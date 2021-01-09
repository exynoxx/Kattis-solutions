use std::io;
use std::cmp::Ordering::Equal;

fn readline() -> Vec<f64> {
    let mut buffer = String::new();
    io::stdin().read_line(&mut buffer).unwrap();
    return buffer.trim().split(' ').map(|s| s.parse().unwrap()).collect();
}

fn readsingle() -> i32 {
    let mut buffer = String::new();
    io::stdin().read_line(&mut buffer).unwrap();
    return buffer.trim().parse().unwrap();
}

fn dist(p1: (f64, f64), p2: (f64, f64)) -> f64 {
    return (p1.0 - p2.0) * (p1.0 - p2.0) +
        (p1.1 - p2.1) * (p1.1 - p2.1);
}

fn bruteForce(p: &[(f64, f64)]) -> (f64, [(f64, f64); 2]) {
    let mut sol: [(f64, f64); 2] = [(0.0, 0.0), (0.0, 0.0)];
    let mut min = std::f64::MAX;
    let n = p.len();
    for i in 0..n {
        for j in (i + 1)..n {
            let d = dist(p[i], p[j]);
            if d < min {
                min = d;
                sol[0] = p[i];
                sol[1] = p[j];
            }
        }
    }
    return (min, sol);
}

fn solve_lr(p: &[(f64, f64)], d: f64) -> (f64, [(f64, f64); 2]) {
    let n = p.len();
    let midp = p[n / 2];
    let mut strip = Vec::with_capacity(n);
    for i in 0..n {
        if f64::abs(p[i].0 - midp.0) < d {
            strip.push(p[i]);
        }
    }

    let size = strip.len();
    let mut min = d;
    let mut sol = [(0.0, 0.0), (0.0, 0.0)];
    strip.sort_by(|&a, &b| a.1.partial_cmp(&b.1).unwrap_or(Equal));
    for i in 0..size {
        let mut j = i+1;
        while j < size && (strip[j].1 - strip[i].1) < min{
            if dist(strip[i], strip[j]) < min{
                min = dist(strip[i], strip[j]);
                sol[0] = strip[i];
                sol[1] = strip[j];
            }
            j+=1;
        }
    }
    return (min, sol);
}

fn closestUtil(p: &[(f64, f64)]) -> (f64, [(f64, f64); 2]) {
    let n = p.len();
    if n <= 3 {
        return bruteForce(p);
    }
    let mid = n / 2;
    let (dl, lsol) = closestUtil(&p[0..mid]);
    let (dr, rsol) = closestUtil(&p[mid..n]);

    let (d, sol) = match dl < dr {
        true => (dl, lsol),
        false => (dr, rsol)
    };
    let (lr, lrsol) = solve_lr(p, d);

    return match lr < d {
        true => (lr, lrsol),
        false => (d, sol)
    };
}

fn closest(p: &mut Vec<(f64, f64)>) -> [(f64, f64); 2] {
    p.sort_by(|&a, &b| a.0.partial_cmp(&b.0).unwrap_or(Equal));
    let (_, sol) = closestUtil(p.as_slice());
    return sol;
}

fn main() {
    loop {
        let n = readsingle();
        if n == 0 {
            break;
        }
        let mut points: Vec<(f64, f64)> = Vec::with_capacity(n as usize);
        for _ in 0..n {
            let tup = readline();
            points.push((tup[0], tup[1]));
        }
        let l = closest(&mut points);
        for &e in l.iter() {
            print!("{:.2} {:.2} ", e.0, e.1);
        }
        println!();
    }
}