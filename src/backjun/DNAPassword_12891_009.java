package backjun;

import java.util.Scanner;

public class DNAPassword_12891_009 {
    // DNA 문자열 길이, 부분 문자열 길이 저장
    // DNA 문자열을 charArray로 바꿈
    // 반복문 시작 - A, C, G, T 최소 개수 입력받아 검사 진행(한번에 배열로 받을 것)
    // 문자 count 0부터 시작, 문자 count가 배열 요소보다 같거나 큰지 체크해야 함. -> 체크해서 false면 바로 break 하고 다음 슬라이딩으로 이동
    // 마지막 요소까지 같거나 크다면 반환값 count++함.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dnaL = sc.nextInt();
        int pL = sc.nextInt();
        String DNA = sc.next();

        // 배열 선언
        char[] dnaA = new char[dnaL];
        for(int i = 0; i < dnaL; i++){
            dnaA[i] =  DNA.charAt(i);
        }
        
        int[] acgtArr = new int[4];
        for(int i = 0; i < 4; i++){
            acgtArr[i] = sc.nextInt();
        }

        // if(dnaA[i] == 'A') cCount++;
        // ... cCount < acgtArr[k] break;
        // 
        for(int i = 0; i < dnaL - pL; i++){
            int mCount = 0;
            if(dnaA[k])
        }
    }
}
