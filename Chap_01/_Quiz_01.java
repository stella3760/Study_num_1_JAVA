package Chap_01;

public class _Quiz_01 {
    public static void main(String[] args) {
        /*int bus1 = 1234;
        String bus2 = "상암08";

        int min1 = 3;
        int min2 = 5;

        double km1 = 1.5;
        double km2 = 0.8;

        System.out.println("버스가 오고 있습니다. " + bus1 + " 버스가 " + min1 + "분 남았습니다. " + km1 + "km에서 접근 중입니다.");
        System.out.println("버스가 오고 있습니다. " + bus2 + " 버스가 " + min2 + "분 남았습니다. " + km2 + "km에서 접근 중입니다.");
    */
        // 버스 번호 (1234, 상암08)
        String busNo = "상암08";

        // 남은 시간 (3분, 5분)
        int minute = 3;

        // 남은 거리 (1.5km, 0.8km)
        double distance = 1.5;

        // 결과 출력
        System.out.println(busNo + "번 버스");
        System.out.println("약 " + minute + "분 후 도착");
        System.out.println("남은 거리 " + distance + "km");

    }
}
