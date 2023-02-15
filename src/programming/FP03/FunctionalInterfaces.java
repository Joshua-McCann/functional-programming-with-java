package programming.FP03;

import java.util.Random;
import java.util.function.*;

import static programming.Variables.courses;
import static programming.Variables.numbers;

public class FunctionalInterfaces {

    @SuppressWarnings("unused")
    public static void main(String[] args) {

        Predicate<Integer> isEvenPredicate = x -> x % 2 == 0;
        Function<Integer, Integer> squareFunction = x -> x * x;
        Function<String, Integer> convertLength = String::length;
        Consumer<Integer> sysOutConsumer = System.out::println;


        numbers.stream()
                .filter(isEvenPredicate)
                .map(squareFunction)
                .forEach(sysOutConsumer);

        courses.stream()
                .map(convertLength)
                .forEach(sysOutConsumer);

        // Supplier - no input > return something
        Supplier<Integer> randomIntegerSupplier = () -> {
            Random random = new Random();
            return random.nextInt(1000);
        };

        System.out.println(randomIntegerSupplier.get());

        // Unary Operator - one input > one output
        UnaryOperator<Integer> multiplyByThree = (x) -> x * 3;

        System.out.println(multiplyByThree.apply(randomIntegerSupplier.get()));

        // BiPredicate - two inputs > returns boolean
        BiPredicate<Integer, String> biPredicate = (number, string) -> number < 10 && string.length() > 5;
        System.out.println(biPredicate.test(5, "in28minutes"));

        // BiFunction - two inputs > one output of what ever type
        BiFunction<Integer, String, String> biFunction = (number, string) -> number + string;
        System.out.println(biFunction.apply(28, "minutes"));

    }
}
