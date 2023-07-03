package array;
import java.util.Arrays;
import java.util.Scanner;

public class ReserveArray {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("요소의 개수 : ");
        int num = stdIn.nextInt();

        int[] x  = new int[num]; // 요소의 개수가 num 인 배열

        for(int i = 0; i < num; i++){ //요소 입력 받음
            System.out.print("x[" + i + "] : ");
            x[i] = stdIn.nextInt();
        }

        reserve(x); // 요소 정렬 메소드 실행

        System.out.println("요소를 역순으로 정렬했습니다."); // 결과
        for(int i = 0; i < num; i++){
            System.out.println("x[" + i + "] = " +x[i]);
        }
        System.out.println(Arrays.toString(x));
    }

    static void swap(int[] a, int idx1, int idx2){ // 요소 바꾸는 로직 메소드
        int t = a[idx1]; 
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    static void reserve(int a[]){ // 배열을 받아 swap 메소드 실행
        for(int i = 0; i < a.length / 2; i++){
            swap(a, i, a.length - i - 1);
        }
    }
}
