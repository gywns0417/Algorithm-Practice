package array;
import java.util.Scanner;

public class DayOfYear3 {
    // 각 달의 일 수(+연습문제 : y년 m월 d일의 그 해 남은 일수(12월 31이면 0, 12월 30일이면 1)을 구하는 메소드 leftDayOfYear 을 작성하세요.)
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
       int month = 0;
       while(month < m - 1){
        d += mdays[isLeap(y)][month++];
       }
       return d;
    }

    // 남은 일수 구하는 메소드
    static int leftDayOfYear(int y, int result){
        return isLeap(y) == 1? 366 - result : 365 - result;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int retry;

        System.out.println("그 해 경과 일수를 구합니다.");

        do {
            System.out.print("년 : "); int year = stdIn.nextInt();
            System.out.print("월 : "); int month = stdIn.nextInt();
            System.out.print("일 : "); int day = stdIn.nextInt();

            int result = dayOfYear(year, month, day);

            System.out.printf("그 해 %d일쨰입니다.\n", result);

            System.out.printf("그 해 남은 일수는 %d일 입니다.\n", leftDayOfYear(year, result));

            System.out.println("한번 더 할까요? (1.예/ 0.아니오)");
            retry = stdIn.nextInt();
        } while(retry == 1);
    }
}
