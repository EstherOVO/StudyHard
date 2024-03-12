package collection.list;

import java.util.ArrayList;
import java.util.List;

public class Ex01 {
    public static void main(String[] args) {

/*
        문제 1 : 정수를 저장하는 ArrayList를 생성하고, 1부터 10까지의 숫자를 추가하세요.
        그리고 이 리스트에서 짝수만 찾아 출력하는 프로그램을 작성하세요.
*/

        List<Integer> integerList = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            integerList.add(i);
        }

        System.out.print("짝수 리스트 : " );
        for (int i = 0; i < integerList.size(); i++) {
            if (integerList.get(i) % 2 == 0) {
                if (i == integerList.size() - 1) {
                    System.out.print(integerList.get(i));
                } else {
                    System.out.print(integerList.get(i) + ", ");
                }
            }
        }
    }
}
