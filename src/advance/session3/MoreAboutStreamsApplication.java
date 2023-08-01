package advance.session3;


import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static advance.session3.MoreAboutStreamsApplication.Course.*;
import static java.util.stream.Collectors.*;

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
                .collect(groupingBy(c -> c, Collectors.counting()));

        System.out.println(coursesCount);

        Set<Course> courses = Arrays.stream(stds)
                .flatMap(s -> Arrays.stream(s.cources()))
                .collect(Collectors.toSet());

        System.out.println("courses = " + courses);

        Map<String, List<String>> stByAgeInterval = Arrays.stream(stds)
                .collect(groupingBy(s -> {
//                    if(s.age>=20 && s.age<29){
//                        return  "20s";
//                    } else if (s.age>=30 && s.age<39) {
//                        return "30s";
//                    }else if (s.age>=40 && s.age<49) {
//                        return "40s";
//                    }
//                    return "Other";
                    return s.age/10 +"0s";
                }, mapping(s -> s.name, toList())));

        System.out.println("stByAgeInterval = " + stByAgeInterval);

//        Stream.iterate(0,p->p+1)
//                .limit(20)
//                .forEach(System.out::println);

        Stream.iterate(0,p->p+1)
                .skip(20)
                .limit(10)
                .forEach(System.out::println);

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
