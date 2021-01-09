use std::io;
use std::cmp::Ordering::Equal;

fn readline() -> Vec<String> {
    let mut buffer = String::new();
    io::stdin().read_line(&mut buffer).unwrap();
    return buffer.trim().split(' ').map(|s| s.to_string()).collect();
}

fn readsingle() -> usize {
    let mut buffer = String::new();
    io::stdin().read_line(&mut buffer).unwrap();
    return buffer.trim().parse().unwrap();
}

fn main (){
    let n = readsingle();
    let mut dict = Vec::with_capacity(n);

    for _ in 0..n{
        let l = readline();
        dict.push((l[0].clone(), l[1].parse::<f64>().unwrap(), l[2].parse::<f64>().unwrap()));

    }

    dict.sort_by(|a, b| a.2.partial_cmp(&b.2).unwrap_or(Equal));

    let mut min_val = std::f64::MAX;
    let mut solution = [0;4];

    for i in 0..n{

        let mut c = 1;
        let mut tmp = [0;4];
        tmp[0] = i;
        for j in 0..n{
            for k in 0..10{
                if k % 2 == 0{
                    c+=1;
                } else {
                    c-=1;
                }
            }
            if c <= 3 && j != i{
                tmp[c] = j;
                c+=1;
            }
        }
        let d = dict[i].1 + dict[tmp[1]].2 + dict[tmp[2]].2 + dict[tmp[3]].2;
        if d < min_val{
            min_val = d;
            solution = tmp;
        }
    }
    println!("{}",min_val);
    for i in solution.iter(){
        println!("{}",dict[*i].0);
    }
}


