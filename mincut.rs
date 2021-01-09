use std::io;
use std::cmp::min;
use std::collections::VecDeque;

fn readline() -> Vec<usize> {
    let mut buffer = String::new();
    io::stdin().read_line(&mut buffer).unwrap();
    return buffer.trim().split(' ').map(|s| s.parse().unwrap()).collect();
}

fn readempty() {
    let mut buffer = String::new();
    io::stdin().read_line(&mut buffer).unwrap();
}


fn readsingle() -> usize {
    let mut buffer = String::new();
    io::stdin().read_line(&mut buffer).unwrap();
    return buffer.trim().parse().unwrap();
}

fn bfs(graph: &mut Vec<Vec<i32>>, s: usize, parent:&mut  Vec<i32>, n: usize) -> Vec<bool> {
    let mut visited = vec![false; n];

    let mut q = VecDeque::with_capacity(n);
    q.push_back(s);
    visited[s] = true;
    while !q.is_empty() {
        let u = q.pop_front().unwrap();
        for i in 0..n {
            if !visited[i] && graph[u][i] > 0 {
                q.push_back(i);
                visited[i] = true;
                parent[i] = u as i32;
            }
        }
    }
    return visited;
}

fn minCut(graph: &mut Vec<Vec<i32>>, source: usize, sink: usize, n: usize) {
    let mut parent = vec![-1; n];

    loop {
        let vis = bfs(graph, source,  &mut parent, n);
        if !vis[sink] {
            break;
        }

        let mut df = std::i32::MAX;
        let mut s = sink;
        while s != source {
            df = min(df, graph[parent[s] as usize][s]);
            s = parent[s] as usize;
        }
        
        let mut v = sink;
        while v != source {
            let u = parent[v] as usize;
            graph[u][v] -= df;
            graph[v][u] += df;
            v = parent[v] as usize;
        }
    }

    let visited = bfs(graph, source, &mut parent, n);
    let lenn:usize = visited.iter().map(|&x| if x { 1 } else { 0 }).sum();
    println!("{}", lenn);
    for i in 0..n {
        if visited[i] {
            println!("{}", i);
        }
    }
}


fn main() {
    let l = readline();
    let (n,m,s,t) = (l[0],l[1],l[2],l[3]);
    let mut adj = vec![vec![0; n]; n];
    for _ in 0..m{
        let ll = readline();
        let (u,v,w) = (ll[0],ll[1],ll[2]);
        adj[u][v]=w as i32;
    }
    minCut(&mut adj,s,t,n);
}

