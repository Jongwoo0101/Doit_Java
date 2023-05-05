package classpart;

public class StudentTest {
    public static void main(String[ ] args)
    {
        Student studentAhn = new Student(); //student 클래스 생성
        studentAhn.studentName = "원종우";

        System.out.println(studentAhn.studentName);
        System.out.println(studentAhn.getStudentName());
    }
}
