package search;
import java.util.Scanner;

public class ComplexityQ5 {
    //이진 검색을 사용하여 검색한 값과 같은 값의 요소 중 가장 맨 앞의 요소를 찾는 메소드를 작성하라.
    static int binSearchX(int[] a, int n, int key){
        int left = 0;
        int right = n - 1;

        do{
            int center = (left + right) / 2;
            int result = center;

            if(a[center] == key){
                for(int i = center - 1; i >= 0; i--){
                    if(a[i] == key) {
                        result = i;
                    }
                    return result;
                }
            }
            else if(a[center] < key) left = center + 1;
            else right = center - 1; 

        } while(left <= right);
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("요솟수 : ");
        int num = scanner.nextInt();
        int[] x = new int[num];

        System.out.println("오름차순으로 입력하세요.");

        System.out.print("x[0] : ");
        x[0] = scanner.nextInt();

        for(int i = 1; i < num; i++){
            do{
                System.out.printf("x[" + i + "] : ");
                x[i] = scanner.nextInt();
            } while(x[i] < x[i-1]);
        }
        System.out.print("검색할 값 : ");
        int ky = scanner.nextInt();

        int idx = binSearchX(x, num, ky);

        if(idx == 1) System.out.println("그 값이 없습니다.");
        else System.out.println("맨 앞의 요소의 인덱스 : " + idx);
    }
}
