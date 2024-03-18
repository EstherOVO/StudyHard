package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Ex05 {
    public static void main(String[] args) {

/*
        - Consumer<Person>를 사용하여 각 참석자에 대한 환영 메시지를 출력하세요.
        - Predicate<Person>를 사용하여 특정 조건(예 : 나이가 18세 이상)을 만족하는 참석자를 필터링하세요.
        - Function<Person, String>을 사용하여 참석자의 이름을 반환하세요.
        - Supplier<List<String>>를 사용하여 최종 초대 명단을 생성하고 반환하세요.
*/

        List<Person> attendees = Arrays.asList(
                new Person("둘리", 22),
                new Person("희동이", 3),
                new Person("마이콜", 25),
                new Person("영희", 16)
        );

//      1. Consumer<Person> 환영메시지
        Consumer<Person> welcomeMessage = person -> System.out.println(person.getName() + "님! 환영합니다~");
        attendees.forEach(welcomeMessage);

//      2. Predicate<Person> 나이 필터링
        System.out.println("§ 성인 참가자 : ");
        Predicate<Person> isAdult = person -> person.getAge() > 18;
        for (Person attendee : attendees) {
            if (isAdult.test(attendee)) {
                System.out.println("- " + attendee.getName());
            }
        }

//      3. Function<Person, String> 참석자 전체 명단
        System.out.println("§ 전체 참가자 명단 : ");
        Function<Person, String> getNames = Person::getName;
        attendees.forEach(person -> System.out.println("- " + getNames.apply(person)));

//      4. Supplier<List<String>> 최종 초대 명단
        System.out.println("§ 최종 초대 명단 : ");
        Supplier<List<String>> finalInvitationList = ArrayList::new;

        List<String> inviteList = finalInvitationList.get();

        for (Person attendee : attendees) {
            if (isAdult.test(attendee)) {
                inviteList.add(getNames.apply(attendee));
                System.out.println("- " + getNames.apply(attendee));
            }
        }
    }
}
