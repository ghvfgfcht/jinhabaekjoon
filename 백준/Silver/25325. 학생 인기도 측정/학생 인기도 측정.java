import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int testCase;
    static HashMap<String, Integer> map = new HashMap<>();
    static List<Student> studentList = new ArrayList<>();

    static class Student implements Comparable<Student> {
        String name;
        int popularity;

        public Student(String name, int popularity) {
            this.name = name;
            this.popularity = popularity;
        }

        @Override
        public int compareTo(Student other) {
            int popularityCompare = Integer.compare(other.popularity, this.popularity);
            if (popularityCompare != 0) {
                return popularityCompare;
            }
            return this.name.compareTo(other.name);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        testCase = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < testCase; i++) {
            String name = st.nextToken();
            map.put(name, 0);
        }

        for (int i = 0; i < testCase; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            while (st.hasMoreTokens()) {
                String name = st.nextToken();
                if (map.containsKey(name)) {
                    map.put(name, map.get(name) + 1);
                } else {
                    map.put(name, 1);
                }
            }
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            studentList.add(new Student(entry.getKey(), entry.getValue()));
        }
        Collections.sort(studentList);
        for (Student student : studentList) {
            System.out.println(student.name + " " + student.popularity);
        }
    }
}