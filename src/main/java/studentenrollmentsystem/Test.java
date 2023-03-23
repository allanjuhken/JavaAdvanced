package studentenrollmentsystem;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Course math = new Course("Math", "MA23", "mr Wilkins");
        Course eng = new Course("English", "ENG23", "ms Levenstein");

        Student jonny = new Student("Jonny", "JD85", Major.AVIATION);
        Student julia = new Student("Julia", "JA86", Major.BUSINESS_MANAGEMENT);

        EnrollmentSystem tallinnUniversity = new EnrollmentSystem();

        tallinnUniversity.addStudent(jonny);
        tallinnUniversity.addStudent(julia);
        //tallinnUniversity.addStudent(jonny);

        tallinnUniversity.addCourse(math);
        tallinnUniversity.addCourse(eng);

        tallinnUniversity.enrollStudentInCourse(jonny, math);

        System.out.println(tallinnUniversity.getStudentsForCourse(math));
        System.out.println(tallinnUniversity.getCoursesForStudent(jonny));
    }
}
