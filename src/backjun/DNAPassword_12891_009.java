package backjun;

import java.util.Scanner;

public class DNAPassword_12891_009 {
    // DNA 문자열 길이, 부분 문자열 길이 저장
    // DNA 문자열을 charArray로 바꿈
    // 이동가능 길이만큼 일단 검사해서 ACGT 개수 배열 저장
    // 그 다음 add, remove 메소드 만들어서 추가되고 사라지는 것에 대해 검사.
    static int checkSecret = 0;
    static int[] myArr = new int[4]; // ACGT 카운트할 배열 생성
    static int[] yourArr = new int[4];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int S = sc.nextInt();
        int P = sc.nextInt();

        String dna = sc.next();

        char[] dnaArr = new char[S]; // 길이만큼 char 배열 선언
        for(int i = 0; i < S; i++){ // 배열에 ACGT 추가
            dnaArr[i] = dna.charAt(i);
        }

        for(int i = 0; i < 4; i++){
            yourArr[i] = sc.nextInt();
        }
        
        int result = 0;

        for(int i = 0; i < P; i++){ // 부분길이만큼 첫 검사
            add(dnaArr[i]);
            if(checkSecret == 4){
                result++;
            }
        }

        for(int i = P; i < S; i++){  
            int j = i - P; // j는 0부터 커지고 i는 ++ 되므로
            add(dnaArr[i]);
            remove(dnaArr[j]); // 0, 1, 2 ... S-P +1 만큼 이동
            if(checkSecret == 4){
                result++;
            }
        }
        System.out.println(result);
    }

    private static void add(char c){ // 새로 들어온 문자 검사
        switch (c) {
            case 'A':
                myArr[0]++;
                if(myArr[0] == yourArr[0]){
                    checkSecret++;
                }
                break;
        
            case 'C':
                myArr[1]++;
                if(myArr[1] == yourArr[1]){
                    checkSecret++;
                }
                break;

            case 'G':
                myArr[2]++;
                if(myArr[2] == yourArr[2]){
                    checkSecret++;
                }
                break;

            case 'T':
                myArr[3]++;
                if(myArr[3] == yourArr[3]){
                    checkSecret++;
                }
                break;
        }
    }

    private static void remove(char c){ // 지워진 문자 검사
        switch (c) {
            case 'A':
                myArr[0]--;
                if(myArr[0] == yourArr[0]){
                    checkSecret--;
                }
                break;
        
            case 'C':
                myArr[1]--;
                if(myArr[1] == yourArr[1]){
                    checkSecret--;
                }
                break;

            case 'G':
                myArr[2]--;
                if(myArr[2] == yourArr[2]){
                    checkSecret--;
                }
                break;

            case 'T':
                myArr[3]--;
                if(myArr[3] == yourArr[3]){
                    checkSecret--;
                }
                break;
        }

    }
}
