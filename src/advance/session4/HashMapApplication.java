package advance.session4;

import java.util.Arrays;
import java.util.HashMap;
import java.util.IntSummaryStatistics;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.summarizingInt;

public class HashMapApplication {


    final static TreeSetApplication.Student[] stds = {
            new TreeSetApplication.Student("Mohammad", 90, "a@a.com", 40, "1"),
            new TreeSetApplication.Student("Ahmad", 80, "ahmad@a.com", 30, "2"),
            new TreeSetApplication.Student("Mosa", 70, "mosa@a.com", 25, "3"),
            new TreeSetApplication.Student("Jawad", 75, "jawad@a.com", 20, "4"),
            new TreeSetApplication.Student("Dima", 95, "dima@a.com", 20, "5"),
            new TreeSetApplication.Student("Mohammad Hamad", 30, "hamad@a.com", 27, "6")
    };

    public static void main(String[] args) {

        Map<String, TreeSetApplication.Student> studentMap =
                new HashMap<>();

        for (TreeSetApplication.Student std : stds) {
            studentMap.put(std.id(), std);
        }

        TreeSetApplication.Student student = studentMap.get("2");
        System.out.println("student = " + student);

        TreeSetApplication.Student student1 = studentMap.get("10");
        System.out.println("student1 = " + student1);


        TreeSetApplication.Student st10 = studentMap.getOrDefault("10", new TreeSetApplication.Student("UnKnown", 0, "", 0, ""));

        System.out.println("st10 = " + st10);


        IntSummaryStatistics ageSummaryStatistics =
                Arrays.stream(stds)
                .collect(summarizingInt(TreeSetApplication.Student::age));

        System.out.println("ageSummaryStatistics = " + ageSummaryStatistics);
    }
}
