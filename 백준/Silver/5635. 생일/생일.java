import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        List<Person> people = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            String[] parts = br.readLine().split(" ");
            String name = parts[0];
            int day = Integer.parseInt(parts[1]);
            int month = Integer.parseInt(parts[2]);
            int year = Integer.parseInt(parts[3]);

            people.add(new Person(name, day, month, year));
        }

        Collections.sort(people);

        System.out.println(people.get(people.size() - 1).getName());
        System.out.println(people.get(0).getName());
    }
}

class Person implements Comparable<Person> {
    private String name;
    private int day;
    private int month;
    private int year;

    public Person(String name, int day, int month, int year) {
        this.name = name;
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Person other) {
        if (this.year != other.year) {
            return this.year - other.year;
        }
        if (this.month != other.month) {
            return this.month - other.month;
        }
        return this.day - other.day;
    }
}
