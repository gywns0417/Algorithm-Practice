package backjun;

import java.util.Scanner;

public class SectionSum_11659_003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt() + 1;
        int M = sc.nextInt();

        int[] numbers = new int[N];
        for(int i = 1; i < N; i++){
            numbers[i] = sc.nextInt();
        }
        
        int[] sumArr = new int[N];
        sumArr[1] = numbers[1];
        for(int i = 2; i < N; i++){
            sumArr[i] = sumArr[i-1] + numbers[i];
        }

        for(int k = 0; k < M; k++){
            int i = sc.nextInt();
            int j = sc.nextInt();
            System.out.println(sumArr[j] - sumArr[i-1]);
        }
    }
}
