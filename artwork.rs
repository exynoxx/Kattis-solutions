use std::io;
use std::collections::HashSet;

fn readline() -> Vec<usize> {
    let mut buffer = String::new();
    io::stdin().read_line(&mut buffer).unwrap();
    return buffer.trim().split(' ').map(|s| s.parse().unwrap()).collect();
}

fn hash(i: usize, j: usize, m: usize) -> usize {
    return i * m + j;
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

fn union(parent: &mut Vec<usize>, rank: &mut Vec<usize>, x: usize, y: usize, numroots: &mut i32) {
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
    *numroots -= 1;
    if rank[xroot] == rank[yroot] {
        rank[xroot] += 1;
    }
}

fn search(grid: &Vec<Vec<i32>>, parent: &mut Vec<usize>, rank: &mut Vec<usize>, tx: usize, ty: usize,n:usize, m: usize,numroots: &mut i32) {
    if grid[tx][ty] > 0 {
        return;
    }

    let idx = [(0, -1), (0, 1), (1, 0), (-1, 0)];
    for (i, j) in idx.into_iter() {
        let dx: i32 = i + tx as i32;
        let dy: i32 = j + ty as i32;
        if dx < 0 || dx >= n as i32 || dy < 0 || dy >= m as i32 || grid[dx as usize][dy as usize] > 0 {
            continue;
        }
        let me = hash(tx, ty, m);
        let other = hash(dx as usize, dy as usize, m);
        union(parent, rank, me, other,numroots)
    }
}

fn main() {
    let h = readline();
    let (n, m, q) = (h[0], h[1], h[2]);

    let mut grid = vec![vec![0; m]; n];
    let mut queue: Vec<(usize, usize, usize, usize)> = Vec::with_capacity(q);


    //PAINT BLACK
    for _ in 0..q {
        let l = readline();
        queue.push((l[0]-1, l[1]-1, l[2]-1, l[3]-1));
        let (x1, y1, x2, y2) = (l[0]-1, l[1]-1, l[2]-1, l[3]-1);

        if x1 == x2 && y1 == y2 {
            grid[x1][y1] += 1;
        } else if x1 == x2 {
            for j in y1..=y2 { grid[x1][j] += 1; }
        } else {
            for i in x1..=x2 { grid[i][y1] += 1; }
        }
    }

    let mut parent = (0..n * m + m).collect();
    let mut rank: Vec<usize> = vec![0; n * m + m];
    let mut numroots:i32 = 0;

    //CONNECT ALL WHITE
    for i in 0..n{
        for j in 0..m{
            if grid[i][j] > 0{
                continue
            }
            numroots+=1;
        }
    }



    for i in 0..n{
        for j in 0..m{
            search(&grid,&mut parent,&mut rank,i,j,n,m,&mut numroots);
        }
    }


    let mut result:Vec<i32> = Vec::with_capacity(q);
    result.push(numroots);

    //REMOVE ONE BLACK QUERY, MERGE IF POSSIBLE
    for qq in (1..q).rev() {
        let (x1, y1, x2, y2) = queue[qq];
        ;
        if x1 == x2 && y1 == y2 {
            grid[x1][y1] -= 1;
            if grid[x1][y1] == 0{
                numroots+=1;
            }
            search(&grid, &mut parent, &mut rank, x1, y1, n,m,&mut numroots);
        } else if x1 == x2 {
            for j in y1..=y2 { grid[x1][j] -= 1; if grid[x1][j] == 0 {numroots+=1}}
            for j in y1..=y2 {
                search(&grid, &mut parent, &mut rank, x1, j, n,m,&mut numroots);
            }
        } else {
            for i in x1..=x2 { grid[i][y1] -= 1; if grid[i][y1] == 0 {numroots+=1} }
            for i in x1..=x2 {
                search(&grid, &mut parent, &mut rank, i, y1, n,m,&mut numroots);
            }
        }
        result.push(numroots);

    }

    for &e in result.iter().rev(){
        println!("{}",e);
    }

}