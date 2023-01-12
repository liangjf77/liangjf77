package chap_01;

public class _Quiz_01 {
    public static void main(String[] args) {
        // 버스 번호(5516, 빨졸08)
        String busNo = "빨졸08";

        // 남은 시간( 5분, 7분)
        int minute = 5;

        // 남은 거리(2.8km, 0.8km)
        double distance = 1.2;

        // 결과 출력
        System.out.println(busNo + "번 버스");
        System.out.println("대략" + minute + "분 후 도착");
        System.out.println("남은 거리 " + distance + "Km");
    }
}
