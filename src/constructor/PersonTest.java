package constructor;

public class PersonTest {
    public static void main(String[] args) {
        /*
        생성자는 클래스를 처음 만들 때 멤버 변수나 상수를 초기화 합니다.
         */
        Person personKim = new Person();
        personKim.name = "김유신";
        personKim.weight = 85.5F;
        personKim.height = 180.0F;

        Person personLee = new Person("이순신", 175, 75);
    }
}
