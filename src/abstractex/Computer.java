package abstractex;

/*
추상클래스는 상속을 하기 위해 만든 클래스입니다.
추상클래스로 설정하려면 class 선언앞에 abstract 예약어를 붙여야 합니다.
 */
public abstract class Computer {
    public abstract void display();
    public abstract void typing();
    public void turnOn() {
        System.out.println("전원을 켭니다.");
    }

    public void turnOff() {
        System.out.println("전원을 끕니다.");
    }
}
