import java.util.Scanner;

public class islands {

    public static class Graph {

        int r,c;
        char[][] tiles = null;

        public Graph(int r, int c) {
            this.r = r;
            this.c = c;

            tiles = new char[r][c];
        }

        public void insertTile (int row, int col, char content) {
            tiles[row][col] = content;
        }

        public char getTile (int row, int col) {
            boolean overR = (row >= r);
            boolean underR = (row < 0);
            boolean overC = (col >= c);
            boolean underC = (col < 0);

            if (overR || underR || overC || underC) {
                return 'A';
            }
            return tiles[row][col];

        }

        public void dfs (int sr, int sc, char mark) {
            char currentTile = getTile(sr, sc);
            if (currentTile == 'A' || currentTile == mark) {
                return;
            }
            if (currentTile == 'L' || currentTile == 'C') {
                tiles[sr][sc] = mark;
                dfs(sr,sc-1,mark); //left
                dfs(sr,sc+1,mark); //right
                dfs(sr-1,sc,mark); //up
                dfs(sr+1,sc,mark); //down
            }
        }

        void printIsland () {
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    System.out.print(getTile(i,j));
                }
                System.out.println();
            }
            System.out.println();
        }

        public int findMinIsland () {
            int count = 0;
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    if (tiles[i][j] == 'L') {
                        dfs(i,j,'X');
                        count++;
                        //printIsland();
                    }
                }
            }
            return count;
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] header = in.nextLine().split(" ");
        int r = Integer.parseInt(header[0]);
        int c = Integer.parseInt(header[1]);

        Graph g = new Graph(r,c);

        for (int i = 0; i < r; i++) {
            char[] line = in.nextLine().toCharArray();
            for (int j = 0; j < c; j++) {
                g.insertTile(i,j,line[j]);
            }
        }
        System.out.println(g.findMinIsland());


    }
}
