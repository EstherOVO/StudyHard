package a_programmers;

import java.time.LocalDate;
import java.util.*;

public class Question01 {

    static class Solution {

        public int[] solution(String today, String[] terms, String[] privacies) {
            int[] answer = {};

            Map<String, Integer> termsMap = new HashMap<>();
            List<Integer> finalCheckPrivacy = new ArrayList<>();

            for (int i = 0; i < terms.length; i++) {
                String[] termSplit = terms[i].split(" ");

                termsMap.put(termSplit[0], Integer.parseInt(termSplit[1]));
            }

            int count = 1;
            for (int i = 0; i < privacies.length; i++) {

                Integer dueDate = termsMap.get(privacies[i].substring(11));

                int year = Integer.parseInt(privacies[i].substring(0, 4));
                int month = Integer.parseInt(privacies[i].substring(5, 7));
                int day = Integer.parseInt(privacies[i].substring(8, 10));

                LocalDate until = LocalDate.of(year, month, day);
                until = until.plusMonths(dueDate);

                int todayYear = Integer.parseInt(today.substring(0, 4));
                int todayMonth = Integer.parseInt(today.substring(5, 7));
                int todayDay = Integer.parseInt(today.substring(8, 10));

                LocalDate now = LocalDate.of(todayYear, todayMonth, todayDay);

                if (now.isAfter(until) || now.isEqual(until)) {
                    finalCheckPrivacy.add(count);
                }

                count++;
            }

            answer = finalCheckPrivacy.stream().mapToInt(Integer::intValue).toArray();

            return answer;
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        String[] terms1 = { "A 6", "B 12", "C 3" };
        String[] privacies1 = { "2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C" };

        String[] terms2 = { "Z 3", "D 5" };
        String[] privacies2 = { "2019.01.01 D", "2019.11.15 Z", "2019.08.02 D", "2019.07.01 D", "2018.12.28 Z" };

        System.out.println(Arrays.toString(solution.solution("2022.05.19", terms1, privacies1))); // [1, 3]
        System.out.println(Arrays.toString(solution.solution("2020.01.01", terms2, privacies2))); // [1, 4, 5]
    }
}
