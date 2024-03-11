package generic;

import java.security.Key;

public class Ex01 {

/*
    연습 문제 : 제네릭을 활용한 범용 Pair 클래스 구현

    문제 설명 :
    두 개의 객체를 한 쌍으로 관리할 수 있는 제네릭 클래스 Pair를 구현하세요.
    이 클래스는 두 객체의 타입이 서로 다를 수 있도록 제네릭을 활용해야 합니다.
    Pair 클래스는 두 객체에 대해 getter 메소드를 제공해야 하며, 이 두 객체는 생성 시점에 초기화되어야 합니다.

    요구사항 :
    Pair 클래스 정의: 두 개의 제네릭 타입 매개변수(K와 V)를 갖는 Pair 클래스를 정의합니다.
    생성자 구현: Pair 객체를 생성할 때, 두 객체를 매개변수로 받아 초기화하는 생성자를 구현합니다.
    Getter 메소드 제공: 두 객체 각각에 대한 getter 메소드 getKey()와 getValue()를 구현합니다.
 */

    public static class Pair<K, V> {

        K key;
        V value;

        public Pair(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }
    }

    public static void main(String[] args) {

        Pair<Integer, String> pair1 = new Pair<>(1, "Apple");
        System.out.println("Pair1 = " + pair1.key + " - " + pair1.value);

        Pair<String, Boolean> pair2 = new Pair<>("KeyExists", true);
        System.out.println("Pair2 = " + pair2.key + " - " + pair2.value);
    }
}
