package Chap_02;

public class _Quiz_02 {
    public static void main(String[] args) {

        int height = 115;
        String result = (height >= 120) ? "탑승 가능합니다" : "탑승 불가능합니다";
        System.out.println("키가 " + height + "cm 이므로 " + result);

        /*int a = 115;
        int b = 121;
        System.out.println(a>=120 ? "키가 " + a + "cm 이므로 탑승 가능합니다" : "키가 " + a + "cm 이므로 탑승 불가능합니다.");
        System.out.println(b>=120 ? "키가 " + b + "cm 이므로 탑승 가능합니다" : "키가 " + b + "cm 이므로 탑승 불가능합니다.");*/
    }
}
