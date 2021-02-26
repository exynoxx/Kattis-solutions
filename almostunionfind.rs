use std::io;
use std::collections::HashSet;

fn readline() -> Vec<usize> {
    let mut buffer = String::new();
    let bytes = io::stdin().read_line(&mut buffer).unwrap();
    if bytes == 0 {
        return vec![0];
    }
    return buffer.trim().split(' ').map(|s| s.parse().unwrap()).collect();
}

fn readsingle() -> usize {
    let mut buffer = String::new();
    io::stdin().read_line(&mut buffer).unwrap();
    return buffer.trim().parse().unwrap();
}

/* set![1,2,3]; */
macro_rules! set {
    ( $( $x:expr ),* ) => {  // Match zero or more comma delimited items
        {
            let mut temp_set = HashSet::new();  // Create a mutable HashSet
            $(
                temp_set.insert($x); // Insert each item matched into the HashSet
            )*
            temp_set // Return the populated HashSet
        }
    };
}

fn main() {
    loop {
        let l1 = readline();
        if l1[0] == 0{return;}


        let (n, m) = (l1[0], l1[1]);


        let mut pos = vec![0; n + 1];
        let mut sums = vec![0; n + 1];
        let mut sets: Vec<HashSet<usize>> = Vec::with_capacity(n + 1);


        sets.push(set!(0));
        for i in 1..=n {
            pos[i] = i;
            sums[i] = i;
            sets.push(set!(i));
        }

        for _ in 0..m {
            let l = readline();
            match l[0] {
                1 => {
                    //union
                    let (mut p, mut q) = (l[1], l[2]);

                    let mut pos_p = pos[p];
                    let mut pos_q = pos[q];

                    if pos_p == pos_q {
                        continue;
                    }
                    if sets[pos_p].len() > sets[pos_q].len() {
                        pos_p = pos[q];
                        pos_q = pos[p];
                    }

                    sums[pos_q] += sums[pos_p];
                    sums[pos_p] = 0;

                    for e in sets[pos_p].clone().iter() {
                        sets[pos_q].insert(*e);
                        pos[*e] = pos_q;
                    }
                    sets[pos_p].clear();
                }
                2 => {
                    //move
                    let (p, q) = (l[1], l[2]);
                    if pos[p] == pos[q] {
                        continue;
                    }
                    sums[pos[p]] -= p;
                    sums[pos[q]] += p;
                    sets[pos[p]].remove(&p);
                    sets[pos[q]].insert(p);
                    pos[p] = pos[q];
                }

                3 => {
                    //print
                    let p = l[1];
                    println!("{} {}", sets[pos[p]].len(), sums[pos[p]]);
                }

                _ => ()
            }
        }
    }
}