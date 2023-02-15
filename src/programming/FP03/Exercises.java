package programming.FP03;

import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

import static programming.Variables.numbers;

public class Exercises {

    public static void main(String[] args) {
        // Exercise 12 Find the type of operator that goes into the second reduce function
        System.out.println("Exercise 12");
        BinaryOperator<Integer> sumOperator = new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer, Integer integer2) {
                return integer + integer2;
            }
        };

        int sum = numbers.stream()
                .reduce(0, sumOperator);

        System.out.println(sum);
        System.out.println();

        // Exercise 13 parameterize the mapping logic
        System.out.println("Exercise 13");
        List<Integer> updateList = convertNumbers(numbers, x -> x * x);
        System.out.println(updateList);
        System.out.println();
    }

    private static List<Integer> convertNumbers(List<Integer> numbers, Function<Integer, Integer> mappingLogic) {
        return numbers.stream()
                .map(mappingLogic)
                .collect(Collectors.toList());
    }

}
