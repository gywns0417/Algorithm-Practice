package backjun;

import java.util.Arrays;
import java.util.Scanner;

public class GoodNumber_1253_008 {
    public static void main(String[] args) {
        // 투 포인터로 푼다.
        // 주어진 수룰 배열로 받아 정렬한다.
        // start_index = 0, end_index = N-1부터 시작한다.
        // s + e == N 이면 count++, start_index++, end_index-- 한다.
        // s + e > N 이면 end_index-- 한다.
        // s + e < N 이면 start_index++ 한다.

        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
        }

        int count = 0;
        int sum = 0;
        Arrays.sort(arr);
        
        for(int i = 0; i < N; i++){
            int start_index = 0;
            int end_index = N - 1;
            long find = arr[i];

            while(start_index < end_index){
                if(arr[start_index] + arr[end_index] == find){
                    if(start_index != i && end_index != i){
                        count++;
                        break;
                    }
                    else if(start_index == i){
                        start_index++;
                    }
                    else if(end_index == i){
                        end_index--;
                    }
                }
                else if(arr[start_index] + arr[end_index] < find){
                    start_index++;
                }
                else {
                    end_index--;
                }
            }
        }
        System.out.println(count);
       
    }
}