package backjun;

import java.util.Scanner;

public class ContinousSum_2018_006 {
    public static void main(String[] args) {
        // 수 입력 받기

        // 배열에 N만큼 채우기
        // 비교하기 while(sum != N)
        // sum > N이면, sum에서 start 값 빼고, start값 증가
        // sum < N이면, end값 증가하고, sum에 end값 추가
        // sum == N이면, end값 증가하고, sum에 end값 추가하고, count 추가

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int sum = 1;
        int count = 1;
        int start_index = 1;
        int end_index = 1;

        while(start_index != N){
            if(sum == N){;
                sum += ++end_index;
                count++;
            }
            else if(sum > N){
                sum -= start_index++;
            }
            else if(sum < N){
                sum += ++end_index;
            }
        }
        System.out.println(count);
    }
}
