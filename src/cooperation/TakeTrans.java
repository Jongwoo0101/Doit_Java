package cooperation;

public class TakeTrans {
    public static void main(String[] args) {
        Student studentwon = new Student("Won", 5000);
        Student studentNick = new Student("Nick", 10000);

        Bus bus100 = new Bus(100);
        studentwon.takeBus(bus100);
        studentwon.showInfo();
        bus100.showInfo();

        Subway subwayGreen = new Subway("2호선");
        studentNick.takeSubway(subwayGreen);
        studentNick.showInfo();
        subwayGreen.showInfo();
    }
}
