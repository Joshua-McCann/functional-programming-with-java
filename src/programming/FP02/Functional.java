package programming.FP02;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static programming.Variables.courses;
import static programming.Variables.numbers;

public class Functional {

    public static void main(String[] args) {
//        int sum = addListFunctional(numbers);
//        System.out.println("Final sum: " + sum);
//        numbers.stream()
//                .distinct()
//                .sorted()
//                .forEach(System.out::println);

//        courses.stream()
//                .sorted(Comparator.naturalOrder())
//                .forEach(System.out::println);
//
//        courses.stream()
//                .sorted(Comparator.reverseOrder())
//                .forEach(System.out::println);
//
//        courses.stream()
//                .sorted(Comparator.comparing(String::length))
//                .forEach(System.out::println);

        System.out.println(doubleList(List.of(1,5,6)));
    }

    private static int addListFunctional(List<Integer> numbers) {
        return numbers.stream()
                .reduce(0, (total, nextInt) -> {
                    int newTotal = total + nextInt;
                    System.out.println("Next Iteration");
                    System.out.println("==================");
                    System.out.println("total + nextInt = newTotal");
                    System.out.printf("%5d + ", total);
                    System.out.printf("%-7d = ", nextInt);
                    System.out.println(newTotal);
                    System.out.println("");
                    return newTotal;
                });
    }

    private static List<Integer> doubleList(List<Integer> numbers) {
        return numbers.stream()
                .map(x -> x * x)
                .collect(Collectors.toList());
    }
}
