package collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Ex04 {

/*
    연습문제 4. 회사 직원 관리 시스템

    요구 사항 :
    Employee 클래스 정의
    필드 : 직원 ID(String id), 이름(String name), 부서(String department)
    생성자 : 직원 ID, 이름, 부서를 매개변수로 받아 초기화
    equals()와 hashCode() 메서드 : 직원 ID를 기준으로 오버라이드

    직원 정보를 추가, 조회, 삭제하는 기능을 구현합니다.
    모든 직원의 정보를 출력하는 기능을 구현합니다.

    예시 데이터 :
    직원1: ID "001", 이름 "Alice", 부서 "개발"
    직원2: ID "002", 이름 "Bob", 부서 "디자인"
    직원3: ID "003", 이름 "Charlie", 부서 "마케팅"
*/

    public static class Employee {

        private String id;
        private String name;

        public Employee(String id, String name) {
            this.id = id;
            this.name = name;
        }

        public String toString() {
            return "◎ 직원 ID : " + id + " | ◎ 직원명 : " + name;
        }

        public boolean equals(Object obj) {
            if (this == obj) return true;

            if (obj == null || getClass() != obj.getClass()) return false;

            Employee employee = (Employee) obj;
            return Objects.equals(id, employee.id);
        }

        public int hashCode() {
            return Objects.hash(id);
        }
    }

    public static void main(String[] args) {

        Employee employee1 = new Employee("001", "Alice");
        Employee employee2 = new Employee("002", "Bob");
        Employee employee3 = new Employee("003", "Charlie");
        Employee employee4 = new Employee("003", "Madison");

        Map<Employee, String> map = new HashMap<>();

        map.put(employee1, "개발팀");
        map.put(employee2, "디자인팀");
        map.put(employee3, "마케팅팀");
        map.put(employee4, "영업팀");

        System.out.println("=== 직원 출력 ===");
        for (Map.Entry<Employee, String> entry : map.entrySet()) {
            System.out.println(entry.getKey().toString() + " | ◎ 부서 : " + entry.getValue());
        }

        System.out.println("=== 직원 삭제 ===");
        map.remove(employee2);

        for (Employee employee : map.keySet()) {
            System.out.println(employee.toString() + " | ◎ 부서 : " + map.get(employee));
        }
    }
}
