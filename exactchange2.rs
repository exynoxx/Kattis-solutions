use std::io;

fn readline() -> Vec<usize> {
    let mut buffer = String::new();
    io::stdin().read_line(&mut buffer).unwrap();
    return buffer.trim().split(' ').map(|s| s.parse().unwrap()).collect();
}

fn readsingle() -> usize {
    let mut buffer = String::new();
    io::stdin().read_line(&mut buffer).unwrap();
    return buffer.trim().parse().unwrap();
}

fn main() {
    let t = readsingle();
    for _ in 0..t {
        let mut x = readsingle();
        let n = readsingle();
        let mut coins = Vec::with_capacity(n);
        for _ in 0..n {
            let c = readsingle();
            coins.push(c);
        }

        let l = 10001;
        let mut arr = vec![std::usize::MAX; l];
        arr[0] = 0;

        for c in coins.into_iter() {
            for r in (c..l).rev() {
                if arr[r-c] < std::usize::MAX {
                    arr[r] = std::cmp::min(arr[r], arr[r-c] + 1)
                }
            }
        }

        while arr[x] == std::usize::MAX {
            x += 1;
        }
        println!("{} {}", x, arr[x]);
    }
}