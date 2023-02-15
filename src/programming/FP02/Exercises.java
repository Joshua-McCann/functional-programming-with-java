package programming.FP02;

import java.util.List;
import java.util.stream.Collectors;

import static programming.Variables.courses;
import static programming.Variables.numbers;

public class Exercises {
    public static void main(String[] args) {
        // Exercise 7 Square every number, find sum
        System.out.println("Exercise 7");
        System.out.println(numbers.stream()
                .map(x -> x * x)
                .reduce(0, Integer::sum));
        System.out.println(numbers.stream()
                .reduce(0, (x, y) -> x + y * y));
        System.out.println();

        // Exercise 8 Cube every number, find sum
        System.out.println("Exercise 8");
        System.out.println(numbers.stream()
                .map(x -> x * x * x)
                .reduce(0, Integer::sum));
        System.out.println(numbers.stream()
                .reduce(0, (x, y) -> x + y * y * y));
        System.out.println();

        // Exercise 9 Find sum of odd numbers
        System.out.println("Exercise 9");
        System.out.println(numbers.stream()
                .filter(x -> x % 2 != 0)
                .reduce(0, Integer::sum));
        System.out.println();

        // Exercise 10 create a list of even numbers filtered from the numbers list
        System.out.println("Exercise 10");
        System.out.println(getEvenNumbers(numbers));
        System.out.println();

        // Exercise 11 Create a list of lengths of all course titles.
        System.out.println("Exercise 11");
        System.out.println(getNameLengths(courses));
        System.out.println();

    }

    private static List<Integer> getEvenNumbers(List<Integer> numbers) {
        return numbers.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toList());
    }

    private static List<Integer> getNameLengths(List<String> strings) {
        return strings.stream()
                .map(String::length)
                .collect(Collectors.toList());
    }

}
