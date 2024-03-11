package generic.ex03;

public class Ex03 {
    public static void main(String[] args) {

/*
        연습 문제 : 제네릭 인터페이스를 이용한 데이터 처리 시스템

        문제 설명 :
        제네릭 인터페이스 DataProcessor<T>를 정의하고, 이를 구현하는 클래스를 작성하여 데이터 처리 시스템을 구현합니다.
        DataProcessor<T> 인터페이스는 데이터를 처리(processData)하고 결과를 반환하는 메소드를 포함해야 합니다.
        이 연습 문제를 통해, 제네릭 인터페이스를 사용하여 다양한 타입의 데이터를 처리할 수 있는 유연한 시스템을 구현하는 방법을 배웁니다.

        요구사항 :
        - DataProcessor<T> 인터페이스 정의
        processData 메소드를 정의합니다.
        이 메소드는 T 타입의 데이터를 매개변수로 받고, 처리된 데이터의 결과를 T 타입으로 반환합니다.

        - StringDataProcessor 클래스 구현
        DataProcessor<String> 인터페이스를 구현합니다.
        문자열 데이터를 대문자로 변환하는 로직을 processData 메소드에 구현합니다.

        - NumberDataProcessor 클래스 구현
        DataProcessor<Integer> 인터페이스를 구현합니다.
        정수 데이터를 두 배로 증가시키는 로직을 processData 메소드에 구현합니다.
*/

        DataProcessor<String> stringProcessor = new StringDataProcessor();
        System.out.println(stringProcessor.processData("hello, generics"));

        DataProcessor<Integer> intProcessor = new NumberDataProcessor();
        System.out.println(intProcessor.processData(100));
    }
}
