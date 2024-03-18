package lambda;

import java.util.function.Function;

public class Ex06 {
    public static void main(String[] args) {

        Student[] students = {
                new Student("홍길동", 90, 96),
                new Student("이몽룡", 95, 93)
        };

        double mathAvg = getAvg(students, Student::getMathScore);
        double engAvg = getAvg(students, Student::getEngScore);

        System.out.println("□ 수학 점수 평균 : " + mathAvg);
        System.out.println("□ 영어 점수 평균 : " + engAvg);
    }

    public static double getAvg(Student[] students, Function<Student, Integer> function) {

        int sum = 0;
        for (Student student : students) {
            sum += function.apply(student);
        }

        return (double) sum / students.length;
    }

    public static class Student {

        private String name;
        private int mathScore;
        private int engScore;

        public Student(String name, int mathScore, int engScore) {
            this.name = name;
            this.mathScore = mathScore;
            this.engScore = engScore;
        }

        public String getName() {
            return name;
        }

        public int getMathScore() {
            return mathScore;
        }

        public int getEngScore() {
            return engScore;
        }
    }
}