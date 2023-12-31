package array;
import java.util.Scanner;

public class DayOfYear2 {
    // 각 달의 일 수(+연습문제 : 메서드 dayOfYear을 변수 i와 days 없이 구현하세요. while문을 사용하세요.)
    static int[][] mdays =  {
        {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
        {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
    };
    
    // 서기 year년은 윤년인가?(윤년 : 1 / 평년 : 0)
    static int isLeap(int year){
        return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)? 1 : 0;
    }

    // 서기 y년 m월 d일의 그 해 경과 일 수를 구함
    static int dayOfYear(int y, int m, int d){
       int month = 1;
       while(month < m){
        d += mdays[isLeap(y)][month++];
       }
       return d;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int retry;

        System.out.println("그 해 경과 일수를 구합니다.");

        do {
            System.out.print("년 : "); int year = stdIn.nextInt();
            System.out.print("월 : "); int month = stdIn.nextInt();
            System.out.print("일 : "); int day = stdIn.nextInt();

            System.out.printf("그 해 %d일쨰입니다.\n", dayOfYear(year, month, day));

            System.out.println("한번 더 할까요? (1.예/ 0.아니오)");
            retry = stdIn.nextInt();
        } while(retry == 1);
    }
}
