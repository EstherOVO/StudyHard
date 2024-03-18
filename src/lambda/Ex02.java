package lambda;

import java.util.function.Function;

public class Ex02 {
    public static void main(String[] args) {

        Function<String, String> date = string -> string.substring(0, 4) + "-" + string.substring(4, 6) + "-" + string.substring(6, 8);
        System.out.println(date.apply("20240320"));
    }
}
