package programming.FP03;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

import static programming.Variables.courses;
import static programming.Variables.numbers;

public class BehaviorParameterization {

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Predicate<Integer> evenPredicate = x -> x % 2 == 0;
        Predicate<Integer> oddPredicate = x -> x % 2 != 0;
        filterAndPrint(numbers, evenPredicate);
        filterAndPrint(numbers, oddPredicate);

    }

    private static void filterAndPrint(List<Integer> numbers, Predicate<Integer> filterLogic) {
        numbers.stream()
                .filter(filterLogic)
                .forEach(System.out::println);
    }
}
