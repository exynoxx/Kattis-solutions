import java.util.*;

class Graph
{

    HashMap<Integer, String> mappings;

    private int V;   // No. of vertices
    private LinkedList<Integer> adj[]; //Adjacency Lists
    public int bestD = 50000;
    public String bestName = "";
    public boolean hasCycle = false;


    // Constructor
    Graph(int v, HashMap<Integer, String> mappings)
    {
        this.mappings = mappings;
        V = v;
        adj = new LinkedList[v];
        for (int i=0; i<v; ++i)
            adj[i] = new LinkedList();
    }

    // Function to add an edge into the graph
    void addEdge(int v,int w)
    {
        adj[v].add(w);
    }

    // prints BFS traversal from a given source s
    void BFS(int s)
    {
        LinkedList<Integer> queue = new LinkedList<Integer>();
        boolean visited[] = new boolean[V];
        int[] d = new int[V];
        int[] pi = new int[V];

        visited[s]=true;
        queue.add(s);

        while (queue.size() != 0)
        {
            int k = queue.poll();

            Iterator<Integer> i = adj[k].listIterator();
            while (i.hasNext())
            {
                int n = i.next();

                if (n == s) {
                    hasCycle = true;
                    if (d[k] < bestD) {
                        bestD = d[k];

                        bestName = "";

                        int w = k;
                        while (w != s) {
                            bestName = mappings.get(w) + " " + bestName;
                            w = pi[w];
                        }
                        bestName = mappings.get(s) + " " + bestName;
                    }

                }

                if (!visited[n])
                {
                    visited[n] = true;
                    d[n] = d[k] + 1;
                    pi[n] = k;
                    queue.add(n);
                }
            }
        }
        //System.out.println("BFS: " + s + " bestD: " + bestD + " : " + bestName);
    }
}

public class spaghetti {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = Integer.parseInt(in.nextLine());
        
        String[] names = in.nextLine().split(" ");
        HashMap<String, Integer> mappings = new HashMap<>();
        HashMap<Integer, String> backToString = new HashMap<>();
        Graph g = new Graph(n, backToString);

        for (int i = 0; i < n; i++) {
            mappings.put(names[i], i);
            backToString.put(i, names[i]);
        }

        for (int i = 0; i < n; i++) {
            String header = in.nextLine();
            String[] tokens = header.split(" ");
            int indexFrom = mappings.get(tokens[0]);

            for (int j = 0; j < Integer.parseInt(tokens[1]); j++) {
                String importline = in.nextLine();
                importline = importline.substring(7);
                String[] adjs = importline.split(", ");
                for (int k = 0; k < adjs.length; k++) {
                    int indexTo = mappings.get(adjs[k]);
                    g.addEdge(indexFrom,indexTo);
                }
            }
        }

        for (int i = 0; i < n; i++) {
            g.BFS(i);
        }

        if (!g.hasCycle) {
            System.out.println("SHIP IT");
        } else {
            System.out.println(g.bestName);
        }
    }
}
