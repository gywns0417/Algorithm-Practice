package search;
import java.util.Scanner;

public class ComplexityQ3 {
    //요솟수가 n인 배열 a 에서 key와 일치하는 모든 요소의 인덱스를 idx의 맨 앞부터 순서대로 저장하고, 일치한 요솟수를 반환하는 메서드를 작성하라.
    static int serachIdx(int[] a, int n, int key, int[] idx){
        int count = 0;
        for(int i = 0; i < n; i++){
            if(a[i] == key){
                idx[count++] = a[i];
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("요솟수 : ");
        int num = scanner.nextInt();
        int[] x = new int[num];

        for(int i = 0; i < num; i++){
            System.out.print("x[" + i + "] : ");
            x[i] = scanner.nextInt();
        }

        System.out.print("검색할 값 : ");

        int ky = scanner.nextInt();
        int[] idx = new int[num];

        int count = serachIdx(x, num, ky, idx);

        if(count == 0) System.out.println("그 값을 가지고 있지 않습니다.");
        else System.out.printf("%s의 요솟수 : %s개 ", ky, count);
    }
}


//1. 인덱스를 저장할 것
//2. 요솟수가 몇갠지 반환할 것
