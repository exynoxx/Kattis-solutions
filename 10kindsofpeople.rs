use std::io;

fn readline() -> Vec<usize> {
    let mut buffer = String::new();
    io::stdin().read_line(&mut buffer).unwrap();
    return buffer.trim().split(' ').map(|s| s.parse().unwrap()).collect();
}

fn readlinestring() -> String {
    let mut buffer = String::new();
    io::stdin().read_line(&mut buffer).unwrap();
    return buffer.trim().parse().unwrap();
}

fn readsingle() -> usize {
    let mut buffer = String::new();
    io::stdin().read_line(&mut buffer).unwrap();
    return buffer.trim().parse().unwrap();
}

fn hash(i: usize, j: usize, c: usize) -> usize {
    return i * c + j;
}

fn find(parent: &mut Vec<usize>, x: usize) -> usize {
    let mut root = x;
    while parent[root] != root {
        root = parent[root];
    }

    let mut y = x;
    while parent[y] != root {
        let p = parent[y];
        parent[y] = root;
        y = p;
    }
    return root;
}

fn union(parent: &mut Vec<usize>, rank: &mut Vec<usize>, x: usize, y: usize) {
    let mut xroot = find(parent, x);
    let mut yroot = find(parent, y);

    if xroot == yroot {
        return;
    }
    if rank[xroot] < rank[yroot] {
        let tmp = yroot;
        yroot = xroot;
        xroot = tmp;
    }
    parent[yroot] = xroot;
    if rank[xroot] == rank[yroot] {
        rank[xroot] += 1;
    }
}


fn main() {
    let rc = readline();
    let (r, c) = (rc[0], rc[1]);

    let mut arr = vec![vec![0; c]; r];

    for rr in 0..r {
        let row = readlinestring();
        for (i, e) in row.chars().enumerate() {
            if e == '0' {
                arr[rr][i] = 0;
            } else {
                arr[rr][i] = 1;
            }
        }
    }


    let mut parent = (0..r*c+c).collect();
    let mut rank = vec![0; r * c + c];

    let idx = [(0, -1), (0, 1), (1, 0), (-1, 0)];
    for i in 0..r {
        for j in 0..c  {
            let typ = arr[i][j];
            for (x, y) in idx.into_iter() {
                let dx: i32 = i as i32 + x;
                let dy: i32 = j as i32 + y;
                if dx < 0 || dx >= r as i32 || dy < 0 || dy >= c as i32 || arr[dx as usize][dy as usize] != typ {
                    continue;
                }
                let other = hash(dx as usize, dy as usize, c);
                let me = hash(i, j, c);
                union(&mut parent, &mut rank, me, other);
            }
        }
    }

    let m = readsingle();
    for _ in 0..m {
        let l = readline();
        let (r1, c1, r2, c2) = (l[0] - 1, l[1] - 1, l[2] - 1, l[3] - 1);

        if find(&mut parent, hash(r1, c1, c)) == find(&mut parent, hash(r2, c2, c)) {
            if arr[r1][c1] == 0 {
                println!("binary");
            } else {
                println!("decimal");
            }
        } else {
            println!("neither");
        }
    }
}