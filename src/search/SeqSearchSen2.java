package search;
import java.util.Scanner;

public class SeqSearchSen2 {
    // 요솟수가 n인 배열 a에서 key와 같은 요소를 선형 검색합니다.
    static int seqSearch(int[] a, int n , int key){
       /*
        int i = 0;
        a[n] = key;
        while(true){
            if(a[i] == key) break;
            i++;
        }
        return i == n ? -1 : i;
        */
        for(int i = 0; i <= n; i++){
            if(a[i] == key) return i == n? -1 : i; 
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("요솟수 : ");
        int num = stdIn.nextInt();
        int[] x = new int[num + 1];

        for(int i = 0; i < num; i++){
            System.out.print("x[" + i + "] : ");
            x[i] = stdIn.nextInt();
        }

        System.out.print("검색할 값 : ");
        int ky = stdIn.nextInt();
        int idx = seqSearch(x, num, ky);

        if(idx == -1) System.out.println("그 값의 요소가 없습니다.");
        else System.out.println("ky 은(는) x[" + idx + "]에 있습니다.");
    }
}
