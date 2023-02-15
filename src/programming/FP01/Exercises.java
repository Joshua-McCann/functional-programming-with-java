package programming.FP01;

import java.util.List;
import java.util.function.Predicate;

import static programming.Variables.courses;
import static programming.Variables.numbers;

public class Exercises {

    public static void main(String[] args) {
        // Exercise 1 Print odd numbers
        System.out.println("Exercise 1");
        filterAndPrint(numbers, x -> (Integer) x % 2 != 0);
        System.out.println();

        // Exercise 2 Print individual courses
        System.out.println("Exercise 2");
        printAll(courses);

        System.out.println();
        // Exercise 3 Print Courses with the word `Spring`
        System.out.println("Exercise 3");
        filterAndPrint(courses, s -> ((String) s).toLowerCase().contains("spring"));
        System.out.println();

        // Exercise 4 Print courses with a name at least 4 letters long
        System.out.println("Exercise 4");
        filterAndPrint(courses, s -> ((String) s).length() >= 4);
        System.out.println();

        // Exercise 5 Print the cubes of odd numbers
        System.out.println("Exercise 5");
        numbers.stream()
                .filter(x -> x % 2 != 0)
                .map(x -> x * x * x)
                .forEach(System.out::println);
        System.out.println();

        // Exercise 6 Print the number of characters in each course name
        System.out.println("Exercise 6");
        courses.stream()
                .map(String::length)
                .forEach(System.out::println);

        System.out.println();
    }

    private static void printAll(List<?> list) {
        list.forEach(System.out::println);
    }

    private static void filterAndPrint(List<?> list, Predicate<? super Object> predicate) {
        list.stream()
                .filter(predicate)
                .forEach(System.out::println);
    }
}
