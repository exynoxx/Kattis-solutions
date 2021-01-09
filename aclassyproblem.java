import java.util.*;

public class classy {

    public static class Person implements Comparable<Person>{

        String classs;
        String name;
        public ArrayList<Integer> rank;

        public Person(String name, String classs) {
            this.classs = classs;
            this.name = name;
            this.rank = new ArrayList<>();
            String[] ranking = classs.split("-");
            for (int i = ranking.length - 1; i >= 0; i--) {
                if (ranking[i].equals("upper")) {
                    rank.add(3);
                } else if (ranking[i].equals("middle")) {
                    rank.add(2);
                } else {
                    rank.add(1);
                }
            }
            for (int i = 0; i < 10; i++) {
                rank.add(2);
            }
        }

        @Override
        public String toString() {
            return name;
        }

        @Override
        public int compareTo(Person p) {
            for (int i = 0; i < 10; i++) {
                if (this.rank.get(i) == p.rank.get(i)) {
                    continue;
                }
                if (this.rank.get(i) > p.rank.get(i)) {
                    return -1;
                }
                if (this.rank.get(i) < p.rank.get(i)) {
                    return 1;
                }
            }
            return this.name.compareTo(p.name);
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = Integer.parseInt(in.nextLine());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(in.nextLine());
            ArrayList<Person> persons = new ArrayList<>(n);

            for (int j = 0; j < n; j++) {
                String line = in.nextLine();
                line = line.replaceAll(":", "");
                line = line.replaceAll(" class", "");
                String[] split = line.split(" ");
                persons.add(new Person(split[0],split[1]));
            }
            Collections.sort(persons);

            for (int j = 0; j < n; j++) {
                System.out.println(persons.get(j).toString());
            }
            System.out.println("==============================");
        }
    }
}
