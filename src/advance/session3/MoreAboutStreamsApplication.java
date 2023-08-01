package advance.session3;


import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static advance.session3.MoreAboutStreamsApplication.Course.*;

public class MoreAboutStreamsApplication {
    private static Student[] stds = {
            new Student("Mohammad", 90, "a@a.com", 40, "1"
                    ,new Course[]{MATH}),
            new Student("Jawad", 95, "jawad@a.com", 20, "2"
                    ,new Course[]{MATH,JAVA,ENGLISH}),
            new Student("Kasparove", 80, "fer3oon@a.com", 22, "1"
                    ,new Course[]{
                    ARABIC,PHYSICS,JAVA}),
            new Student("Mohammad Hamad", 40, "hamad@a.com", 22, "1"
                    ,new Course[]{ARABIC,ENGLISH}),
            new Student("Ibrahim", 99, "ibrahim@a.com", 32, "1"
                    ,new Course[]{MATH,JAVA})

    };


    public static void main(String[] args) {

        Optional<Student> max = Stream.of(stds)
                .max(Comparator.comparingDouble(Student::grade));


        Map<Course, Long> coursesCount = Arrays.stream(stds)
                .flatMap(st -> Arrays.stream(st.cources()))
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        System.out.println(coursesCount);

    }

    public static record Student(String name,
                                 double grade,
                                 String email,
                                 int age,
                                 String id,
                                 Course[] cources
                                 ) {
    }
    public static enum Course{
        MATH,
        JAVA,
        PHYSICS,
        ARABIC,
        ENGLISH,
        JAVASCRIPT
    }
}
