package inheritance;
public class Customer {
    /*
    protected는 상속된 하위 클래스를 제외한 나머지 외부 클래스에서는 private과 동일한 역할을 합니다.
     */
    protected int customerID;
    protected String customerName;
    protected String customerGrade;
    int bonusPoint;
    double bonusRatio;

    public Customer( ) {
        //기본 생성자 입니다. 고객 한 명이 새로 생성되면 customerGrade는 SILVER이고, bonusRatio는 1%로 지정합니다.
        customerGrade = "SILVER";
        bonusRatio = 0.01;
        System.out.println("Customer() 생성자 호출 ");
    }
    public int calcPrice(int price) {
        //제품에 대해 지불해야 하는 금액을 계산하여 반환합니다. 할인되지 않는 경우 가격을 그대로 반환합니다. 그리고 가격에 대해 보너스 포인트 비율을 적용하여 보너스 포인트를 적립합니다.
        bonusPoint += price * bonusRatio;
        return price;
    }
    public String showCustomerInfo( ){
        //고격 정보를 출력합니다.
        return customerName + " 님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + bonusPoint + "입니다.";
    }

    public int getCustomerID( ) {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName( ) {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerGrade() {
        return customerGrade;
    }

    public void setCustomerGrade(String customerGrade) {
        this.customerGrade = customerGrade;
    }
}
