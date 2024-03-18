package lambda;

import java.util.Map;
import java.util.function.BiFunction;

public class Ex01 {
    public static void main(String[] args) {

        Map<String, Integer> userScores = Map.of("Alice", 75, "Bob", 45, "Charlie", 85);

        BiFunction<String, Integer, String> isPassed = (name, score) -> name + " : " + (score >= 50 ? "합격" : "불합격");
        userScores.forEach((name, score) -> System.out.println(isPassed.apply(name, score)));
    }
}
