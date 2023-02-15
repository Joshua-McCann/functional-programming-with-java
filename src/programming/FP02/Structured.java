package programming.FP02;

import java.util.List;

import static programming.Variables.numbers;

public class Structured {

    public static void main(String[] args) {
        int sum = addListStructured(numbers);
        System.out.println(sum);
    }

    private static int addListStructured(List<Integer> numbers) {
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        return sum;
    }
}
