use std::cmp::max;
use std::io;

fn knap_sack(W: usize, wt: &Vec<usize>, val: &Vec<usize>, n: usize) {
    let mut K = vec![vec![0; W + 1]; n + 1];
    for i in 0..=n {
        for w in 0..=W {
            if i == 0 || w == 0 {
                K[i][w] = 0;
            } else if wt[i - 1] <= w {
                K[i][w] = max(val[i - 1] + K[i - 1][w - wt[i - 1]], K[i - 1][w]);
            } else {
                K[i][w] = K[i - 1][w];
            }
        }
    }

    let mut res = K[n][W];
    let mut idx:Vec<usize> = vec![];

    let mut w = W;
    for i in (0..=n).rev(){
        if res <= 0{
            break;
        }
        if res == K[i - 1][w]{
            continue;
        } else {
            idx.push(i-1);
            res = res - val[i - 1];
            w = w - wt[i - 1]
        }
    }

    println!("{}",idx.len());
    for &e in idx.iter(){
        print!("{} ", e);
    }


}

fn main() {
    loop{
        let mut input = String::new();
        let bytes = io::stdin().read_line(&mut input).unwrap();
        if bytes == 0{
            break;
        }

        let l:Vec<&str> = input.split(" ").collect();
        let t:usize = l[0].trim().parse().unwrap();
        let n:usize = l[1].trim().parse().unwrap();

        let mut V = vec![];
        let mut W = vec![];

        for _ in 0..n{
            let mut line = String::new();
            io::stdin().read_line(&mut line).unwrap();

            let vw:Vec<&str> = line.split(" ").collect();
            let v = vw[0].trim().parse().unwrap();
            let w = vw[1].trim().parse().unwrap();
            V.push(v);
            W.push(w);
        }
        knap_sack(t,&W,&V,V.len());


    }
}