package programming.FP04;


import programming.Models.Course;

import java.math.BigInteger;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

import static programming.Variables.courseObjects;
import static programming.Variables.courses;


public class CustomClass {

    public static void main(String[] args) {

//        // allMatch - predicate will return true if all match the predicate
//        Predicate<Course> reviewGreaterThan95 = course -> course.getReviewScore() > 95;
//        assert !courseObjects.stream().allMatch(reviewGreaterThan95) : "All scores are greater than 95";
//        System.out.println("Not all scores are greater than 95");
//
//        // noneMatch - predicate will return true if nothing matches the predicate
//        Predicate<Course> reviewLessThan90 = course -> course.getReviewScore() < 90;
//        assert courseObjects.stream().noneMatch(reviewLessThan90) : "One or more scores below 90";
//        System.out.println("All scores are above 90");
//
//        // anyMatch - predicate will return true if anything matches the predicate
//        Predicate<Course> reviewIs98 = course -> course.getReviewScore() == 98;
//        assert courseObjects.stream().anyMatch(reviewIs98) : "None of the scores are 98";
//        System.out.println("There is a score that matches 98");
//
//        // sorting objects
//        Comparator<Course> comparingByNoOfStudentsIncreasing = Comparator
//                .comparingInt(Course::getNoOfStudents);
//
//        System.out.println(courseObjects.stream().sorted(comparingByNoOfStudentsIncreasing).collect(Collectors.toList()));
//
//        Comparator<Course> comparingByNoOfStudentsDecreasing = Comparator
//                .comparingInt(Course::getNoOfStudents)
//                .reversed();
//
//        System.out.println(courseObjects.stream().sorted(comparingByNoOfStudentsDecreasing).collect(Collectors.toList()));
//
//        Comparator<Course> comparingByNoOfStudentsAndReviews = Comparator
//                .comparingInt(Course::getNoOfStudents)
//                .thenComparing(Course::getReviewScore, Comparator.reverseOrder());
//
//        System.out.println(courseObjects.stream().sorted(comparingByNoOfStudentsAndReviews).collect(Collectors.toList()));
//
//        // iterate through everything, stop collecting once the predicate is no longer true (everything else is dropped)
//        System.out.println(courseObjects.stream()
//                .takeWhile(course -> course.getReviewScore() >= 95)
//                .collect(Collectors.toList()));
//
//        // iterate through everything, stop dropping once the predicate is no longer true (everything else remains)
//        System.out.println(courseObjects.stream()
//                .dropWhile(course -> course.getReviewScore() >= 95)
//                .collect(Collectors.toList()));
//
//        // max gives the biggest value
//        System.out.println(courseObjects.stream()
//                .max(Comparator.comparingInt(Course::getNoOfStudents))
//                .orElse(null));
//
//        System.out.println(courseObjects.stream()
//                .max(Comparator.comparingInt(Course::getReviewScore))
//                .orElse(null));
//
//        // min gives the lowest value
//        System.out.println(courseObjects.stream()
//                .min(Comparator.comparingInt(Course::getNoOfStudents))
//                .orElse(null));
//
//        System.out.println(courseObjects.stream()
//                .filter(x -> x.getReviewScore() < 90)
//                .min(Comparator.comparingInt(Course::getReviewScore))
//                .orElse(courseObjects.get(0)));
//
//        // sum
//        System.out.println(courseObjects.stream()
//                .filter(reviewGreaterThan95)
//                .mapToInt(Course::getNoOfStudents)
//                .sum()
//        );
//
//        // average
//        System.out.println(courseObjects.stream()
//                .filter(reviewGreaterThan95)
//                .mapToInt(Course::getNoOfStudents)
//                .average().orElse(-1)
//        );
//
//        // count
//        System.out.println(courseObjects.stream()
//                .filter(reviewGreaterThan95)
//                .mapToInt(Course::getNoOfStudents)
//                .count()
//        );
//
//        // maps
//        System.out.println(courseObjects.stream()
//                .collect(Collectors.groupingBy(Course::getCategory, Collectors.counting())));
//
//        System.out.println(courseObjects.stream()
//                .collect(Collectors.groupingBy(
//                        Course::getCategory,
//                        Collectors.maxBy(Comparator.comparingInt(Course::getReviewScore)
//                ))));
//
//        System.out.println(courseObjects.stream()
//                .collect(Collectors.groupingBy(
//                        Course::getCategory,
//                        Collectors.mapping(Course::getName, Collectors.joining(", "))
//                )));

//        System.out.println(Stream.of(12,9,13,4,6,2,4,12,15).count());

//        System.out.println(Arrays.stream(new int[]{12,9,13,4,6,2,4,12,15}).sum());

//        System.out.println(IntStream.rangeClosed(1,10).filter(x -> x % 2 == 0).peek(System.out::println).sum());
//        System.out.println(IntStream.iterate(2, e -> e + 2).limit(10).peek(System.out::println).sum());
//        System.out.println(IntStream.iterate(2, e -> e * 2).limit(10).peek(System.out::println).sum());

//        System.out.println(LongStream.rangeClosed(1, 10)
//                .map(e -> e * 10)
//                .mapToObj(r -> LongStream.rangeClosed(1, r).mapToObj(BigInteger::valueOf).reduce(BigInteger.ONE, BigInteger::multiply))
//                .peek(System.out::println)
//                .reduce(BigInteger.ZERO, BigInteger::add));
        System.out.println(
                courseObjects.stream()
                        .map(str -> str.getName().toUpperCase(Locale.ROOT).split(""))
                        .map(Arrays::asList)
                        .flatMap(List::stream)
                        .collect(Collectors.groupingBy(
                                x -> x,
                                Collectors.counting()))
                        .entrySet().stream()
                        .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                        .collect(Collectors.toList())
        );

        System.out.println(
                courseObjects.stream()
                        .flatMap(course -> courseObjects.stream().map(x -> List.of(course.getName(), x.getName())))
                        .filter(x -> !x.get(0).equals(x.get(1)))
                        .collect(Collectors.toList())
        );
    }

}
