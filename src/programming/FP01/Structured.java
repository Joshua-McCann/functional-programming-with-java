package programming.FP01;

import java.util.List;

import static programming.Variables.numbers;

public class Structured {

    public static void main(String[] args) {
//        printAllNumbersInListStructured(numbers);
        printEvenNumbersInListStructured(numbers);
    }

    private static void printAllNumbersInListStructured(List<Integer> numbers) {
        for (int number: numbers) {
            System.out.println(number);
        }
    }

    private static void printEvenNumbersInListStructured(List<Integer> numbers) {
        for (int number: numbers) {
            if (number % 2 == 0)
                System.out.println(number);
        }
    }
}
