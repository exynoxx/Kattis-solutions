use std::io;
use std::cmp::Ordering;

fn readline() -> (i64, i64,String) {
    let mut buffer = String::new();
    io::stdin().read_line(&mut buffer).unwrap();
    let l:Vec<&str>= buffer.trim().split(' ').collect();
    return (l[0].parse().unwrap(), l[1].parse().unwrap(),l[2].to_string());
}

fn readsingle() -> usize {
    let mut buffer = String::new();
    io::stdin().read_line(&mut buffer).unwrap();
    return buffer.trim().parse().unwrap();
}

fn angle(p:(i64,i64),center:(f64,f64)) -> f64{
    f64::atan2(p.1 as f64 -center.1,p.0 as f64 -center.0)
}

fn main(){
    let m = readsingle();
    let mut points:Vec<(i64,i64)> = Vec::with_capacity(m);
    for _ in 0..m{
        let (x,y,stat) = readline();
        if stat == "Y"{
            points.push((x,y));
        }
    }
    let n = points.len();
    let x_mean:f64 = points.iter().map(|&e| e.0 as f64).sum::<f64>()/ n as f64;
    let y_mean:f64 = points.iter().map(|&e| e.1 as f64).sum::<f64>()/ n as f64;
    let center = (x_mean,y_mean);
    points.sort_by(|x,y| angle(*x,center).partial_cmp(&angle(*y,center)).unwrap_or(Ordering::Equal));

    let minn= *points.iter().min().unwrap();

    let mut i = 0;
    while i < n{
        if points[i] == minn{
            break;
        }
        i+=1;
    }

    println!("{}",n);
    for j in i..n{
        let e = points[j];
        println!("{} {}", e.0,e.1);
    }
    for j in 0..i{
        let e = points[j];
        println!("{} {}", e.0,e.1);
    }


}