package programming.FP01;

import java.util.List;

import static programming.Variables.numbers;

public class Functional {

    public static void main(String[] args) {

//        printAllNumbersInListStructured(numbers);
//        printEvenNumbersInListStructured(numbers);
        printSquaresOfEvenNumbersInList(numbers);
    }

    private static void printAllNumbersInListStructured(List<Integer> numbers) {
        numbers.forEach(System.out::println);
    }

    private static void printEvenNumbersInListStructured(List<Integer> numbers) {
        numbers.stream()
                .filter(x -> x % 2 == 0)
                .forEach(System.out::println);
    }

    private static void printSquaresOfEvenNumbersInList(List<Integer> numbers) {
        numbers.stream()
                .filter(x -> x % 2 == 0)
                .map(x -> x * x)
                .forEach(System.out::println);

    }
}
