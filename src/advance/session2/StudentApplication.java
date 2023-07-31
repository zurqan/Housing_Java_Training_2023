package advance.session2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class StudentApplication {

    public static void main(String[] args) {

        Student[] stds = {
                new Student("Mohammad", 90, "a@a.com", 40, "1"),
                new Student("Ahmad", 80, "ahmad@a.com", 30, "2"),
                new Student("Mosa", 70, "mosa@a.com", 25, "3"),
                new Student("Jawad", 75, "jawad@a.com", 20, "4"),
                new Student("Dima", 95, "dima@a.com", 20, "5"),
                new Student("Mohammad Hamad", 85, "hamad@a.com", 27, "6")
        };

        //1. Array of Names
        String[] names = Arrays.stream(stds)
                .map(x -> x.name())
                .toArray(size -> new String[size]);
        System.out.println(Arrays.toString(names));

        //2. Avg grade
        OptionalDouble averageGrade = Arrays.stream(stds)
                .mapToDouble(student -> student.grade)
                .average();
        System.out.println("averageGrade = " + averageGrade);
        //3. Avg age
        OptionalDouble averageage = Arrays.stream(stds).mapToDouble(a -> a.age).average();
        System.out.println("averageAge = " + averageage);

        //4. Count stds age > 30

        long count = Arrays.stream(stds)
                .filter(student -> student.age > 30)
                .count();
        System.out.println(count);
        //5. Names concatenated by ","
        String concatNames = Arrays.stream(stds).map(a -> a.name).reduce(" ", (acc, e) -> acc + "," + e);

        String collectedNames = Arrays.stream(stds).map(a -> a.name).collect(Collectors.joining(",", "{", "}"));
        System.out.println("collectedNames = " + collectedNames);
        System.out.println("concatNames = " + concatNames);

        //6. Check if someone have grade equal to 97
        boolean b = Arrays.stream(stds).map(a -> a.grade).anyMatch(a -> a >= 97);
        System.out.println("b = " + b);
        //7. Sort students by grade
        Student[] stdsOrderedByGrade = Arrays.stream(stds)
                .sorted(Comparator.comparingDouble(Student::grade))
                .toArray(Student[]::new);

        //8. Sort students by name
        Student[] stdsOrderedByName = Arrays.stream(stds)
                .sorted(Comparator.comparing(Student::name))
                .toArray(Student[]::new);
        System.out.println("Arrays.toString(stdsOrderedByName) = " + Arrays.toString(stdsOrderedByName));
    }

    public static record Student(String name, double grade, String email, int age, String id) {
    }
}
