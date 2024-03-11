package generic;

public class Ex02 {

/*
    연습 문제 : 제네릭 메서드를 이용한 요소 검색

    문제 설명 :
    어떤 배열에서 주어진 요소가 몇 번째 위치에 있는지를 찾는 제네릭 메서드 findIndex를 구현합니다.
    이 메서드는 배열과 찾고자 하는 요소를 매개변수로 받고,
    요소가 배열 내에 있으면 해당 요소의 인덱스를, 없으면 -1을 반환해야 합니다.

    요구사항 :
    findIndex 메서드는 제네릭 타입 T의 배열 T[]와 검색할 요소 T를 매개변수로 받습니다.
    리턴 타입은 int입니다.
    배열 내 요소 검색: 주어진 요소가 배열 내에 존재하는지 검색하고, 있으면 해당 인덱스를, 없으면 -1을 반환합니다.
    제네릭 메서드 구현: findIndex 메서드는 제네릭 타입을 사용하여 어떤 타입의 배열에 대해서도 작동해야 합니다.
*/

    public static <T> int findIndex(T[] array, T t) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(t)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        Integer[] intArray = {1, 2, 3, 4};
        String[] strArray = {"Hello", "World", "Generic", "Method"};

        int index1 = findIndex(intArray, 3);
        System.out.println("intArray 배열 3의 인덱스 : " + index1);

        int index2 = findIndex(strArray, "Hello");
        System.out.println("strArray 배열 \"Hello\"의 인덱스 : " + index2);
    }
}
