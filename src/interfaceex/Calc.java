package interfaceex;
/*
인터페이스는 클래스 혹은 프로그램이 제공하는 기능을 명시적으로 선언하는 역할을 합니다.
 */
public interface Calc {
    double PI = 3.14;
    int ERROR = -999999999;

    int add(int num1, int num2);
    int substract(int num1, int num2);
    int times(int num1, int num2);
    int divide(int num1, int num2);
}
