use std::collections::BTreeMap;
use std::io;

fn main(){
    let mut map:BTreeMap<String,i32> = BTreeMap::new();
    let mut total = 0;

    loop {
        let mut input = String::new();
        let bytes = io::stdin().read_line(&mut input).unwrap();
        if bytes == 0{
            break;
        }

        *map.entry(input.to_string().trim().to_string()).or_insert(0)+=1;
        total += 1;

    }
    for (k,v) in map.iter(){

        let res:f64 = (*v as f64/total as f64)*100.0;
        println!("{} {}", k,res);
    }
}