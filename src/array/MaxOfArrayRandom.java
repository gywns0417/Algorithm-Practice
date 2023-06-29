package array;

import java.util.Scanner;
import java.util.Random;

public class MaxOfArrayRandom {

    static int maxOf(int[] a){
        int max = a[0];
        for(int i = 1; i < a.length; i++){
            if(a[i] > max) max = a[i];
        }
        return max;
    }
    


    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);

        System.out.println("키의 최댓값을 구합니다.");
        int num = 1 + rand.nextInt(9); //1~10명
        System.out.println("사람 수 : " + num);

        int[] height = new int[num];

        for(int i = 0; i < num; i++) {
            height[i] = 100 + rand.nextInt(90); //생성한 난수를 90으로 나눈 나머지(키 값은 100~189)
            System.out.println("height[" + i + "] : " + height[i]);

        }

        System.out.println("최댓값은 " + maxOf(height) + "입니다.");
    }
}
