use std::io;
use std::collections::HashSet;

fn main() {
    let mut input = String::new();
    io::stdin().read_line(&mut input).unwrap();
    let mut n: i64 = input.trim().parse().unwrap();
    let mut c: i64 = 0;
    let mut d: i64 = 2;

    while d*d <= n {
        if n % d == 0 {
            n/=d;
            c+=1;
        } else {
            d+= 1 + d % 2;
        }
    }
    if n > 1{c+=1;}
    println!("{}",c)
}
