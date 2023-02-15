package programming.FP04;

import programming.Models.Course;

import java.util.function.Predicate;
import java.util.stream.Collectors;

import static programming.Variables.courseObjects;

public class HigherOrderFunctions {

    private static Predicate<Course> createPredicateWithCutoffReviewScore(int cutOffScore) {
        return x -> x.getReviewScore() > cutOffScore;
    }

    public static void main(String[] args) {
        System.out.println(
                courseObjects.stream()
                        .dropWhile(createPredicateWithCutoffReviewScore(94))
                        .collect(Collectors.toList())
        );

        System.out.println("=".repeat(20));

        System.out.println(
                courseObjects.stream()
                        .takeWhile(createPredicateWithCutoffReviewScore(94))
                        .collect(Collectors.toList())
        );

        System.out.println("=".repeat(20));

        System.out.println(courseObjects);
    }
}
