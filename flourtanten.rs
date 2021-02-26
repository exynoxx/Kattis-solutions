use std::io;
use std::iter::Iterator;

fn readline() -> Vec<i64> {
    let mut buffer = String::new();
    io::stdin().read_line(&mut buffer).unwrap();
    return buffer.trim().split(' ').map(|s| s.parse().unwrap()).collect();
}

fn readsingle() -> usize {
    let mut buffer = String::new();
    io::stdin().read_line(&mut buffer).unwrap();
    return buffer.trim().parse().unwrap();
}

fn culmultative_forward (l:&Vec<i64>)->Vec<i64>{
    let mut ret = vec![-1;l.len()];
    ret[0] = l[0];
    for i in 1..l.len(){
        ret[i] = ret[i-1]+l[i];
    }
    return ret;
}
fn culmultative_backward (l:&Vec<i64>)->Vec<i64>{
    let n = l.len();
    let mut ret = vec![-1; n];
    ret[n-1] = l[n-1];
    for i in (0..n-1).rev() {
        ret[i] = ret[i+1]+l[i];
    }
    return ret;
}

fn main() {
    readsingle();
    let list = readline().into_iter().filter(|&x| x != 0).collect::<Vec<i64>>();
    let n = list.len();
    let basecost1:Vec<i64> = list.iter().enumerate().map(|(i,&e)| e*((i+1) as i64)).collect();
    let basecost2:Vec<i64> = (0..n).map(|i| basecost1[i]+list[i]).collect();
    let forward = culmultative_forward(&basecost1);
    let backward = culmultative_backward(&basecost2);

    /*println!("{:?}",basecost1);
    println!("{:?}",basecost2);
    println!("{:?}",forward);
    println!("{:?}",backward);*/

    let lr = std::cmp::max(forward[n-1],backward[0]);
    let maxx = (0usize..n-1).map(|i| forward[i]+backward[i+1]).max().unwrap();
    println!("{}",std::cmp::max(maxx,lr));

}