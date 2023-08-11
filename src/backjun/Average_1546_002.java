package backjun;

import java.util.Scanner;

public class Average_1546_002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] answer = new int[N];

        for(int i = 0; i < N; i++){
            answer[i] = sc.nextInt();
        }
        long sum = 0 ;
        long max = 0;
        for(int i = 0; i < N; i++){
            sum = sum + answer[i];
            if(answer[i] > max) {
                max = answer[i];
            }
        }
        System.out.println(sum * 100.0 / max / N);
    }
}
