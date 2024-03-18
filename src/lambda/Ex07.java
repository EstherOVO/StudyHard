package lambda;

import collection.map.Ex04;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Ex07 {
    public static void main(String[] args) {
/*
    연습문제 : 직원 필터링

    요구사항: List<Employee>에서 연봉(salary)이 50,000 이상인 직원만 필터링하여
    그 이름을 출력하세요. Predicate와 Consumer를 사용하여 구현하세요.
     Employee 클래스는 이름(name)과 연봉(salary) 필드를 가집니다.

    입력 데이터
    List<Employee> employees = Arrays.asList(new Employee("둘리", 70000), new Employee("희동", 40000), new Employee("마이클", 80000));

    출력 예시
    ===
    둘리
    마이클
     */

        List<Employee> employeesList = Arrays.asList(new Employee("둘리", 70000), new Employee("희동", 40000), new Employee("마이클", 80000));

//      직원 명단
        Consumer<Employee> employeeNames = employee -> System.out.println("- " + employee.getName());

//      직원 연봉에 따른 필터링
        System.out.println("연봉 50,000 이상인 직원 : ");
        Predicate<Employee> isHighSalaryOwner = employee -> employee.Salary > 50_000;
        for (Employee employee : employeesList) {
            if (isHighSalaryOwner.test(employee)) {
                employeeNames.accept(employee);
            }
        }
    }

    public static class Employee {

        private String name;
        private int Salary;

        public Employee(String name, int salary) {
            this.name = name;
            Salary = salary;
        }

        public String getName() {
            return name;
        }

        public int getSalary() {
            return Salary;
        }
    }
}
