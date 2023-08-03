package advance.session4;


import java.util.*;
import java.util.stream.Collectors;

import static java.util.Comparator.comparingDouble;

public class TreeSetApplication {

    final static Student[] stds = {
            new Student("Mohammad", 90, "a@a.com", 40, "1"),
            new Student("Ahmad", 80, "ahmad@a.com", 30, "2"),
            new Student("Mosa", 70, "mosa@a.com", 25, "3"),
            new Student("Jawad", 75, "jawad@a.com", 20, "4"),
            new Student("Dima", 95, "dima@a.com", 20, "5"),
            new Student("Mohammad Hamad", 30, "hamad@a.com", 27, "6")
    };

    public static void main(String[] args) {


        TreeSet<Student> setOfStudent =
                new TreeSet<>(comparingDouble(Student::grade));

        for (Student std : stds) {
            setOfStudent.add(std);
        }

        setOfStudent.forEach(System.out::println);

        Student student75 = new Student("", 75, "", 0, "");
        Student ceiling = setOfStudent.ceiling(student75);

        System.out.println("ceiling = " + ceiling);

        Student higher = setOfStudent.higher(student75);

        System.out.println("higher = " + higher);

        SortedSet<Student> studentsHead75 = setOfStudent.headSet(student75);

        System.out.println("studentsHead75 = " + studentsHead75);

        SortedSet<Student> studentsTail75 = setOfStudent.tailSet(student75);

        System.out.println("studentsTail75 = " + studentsTail75);

        Student student65 = new Student("", 65, "", 0, "");
        Student student85 = new Student("", 85, "", 0, "");

        SortedSet<Student> above65 = setOfStudent.tailSet(student65);
        SortedSet<Student> studentsBetween65And85 = above65.headSet(student85);

        System.out.println("studentsBetween65And85 = " + studentsBetween65And85);

        Set<Student> studentsBetween65And85UsingStream = Arrays
                .stream(stds)
                .filter(s -> s.grade() >= 65 && s.grade() <= 85)
                .collect(Collectors.toSet());

        System.out.println("studentsBetween65And85UsingStream.equals(studentsBetween65And85) = "
                + studentsBetween65And85UsingStream.equals(studentsBetween65And85));

        NavigableSet<Student> students = setOfStudent.subSet(student65, true, student85, false);
        System.out.println("students = " + students);

    }

    public static record Student(String name, double grade, String email, int age, String id) {
    }
}
