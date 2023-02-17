package JAVA.Chap_04;

public class _Quiz_04 {
    public static void main(String[] args) {
        int hour = 5; // 주차시간
        boolean isSmallCar = true; // 경차여부
        boolean withDisabledPerson = false; // 장애인 차량 여부

        int fee = hour * 4000; // 주차 정산 요금(시간 당 4000 원 곱하기)

        // 30000 원 초과 시 일일 최대 요금으로 수정
        if (fee > 30000) {
            fee = 30000; // 일일 최대 요금 적용
        }

        // 경차 또는 장애인 차량인 경우 50% 할인
        if (isSmallCar || withDisabledPerson) {
            fee /= 2; // 50% 할인 적용
        }

        // 실행 결과 출력
        System.out.println("주차 요금은 " + fee + " 원 입니다.");
    } // main
} // class
