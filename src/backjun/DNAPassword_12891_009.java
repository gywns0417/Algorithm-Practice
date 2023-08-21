package backjun;

import java.util.Scanner;

// 1. 첫째 줄에 DNA 길이 S, 비밀번호 길이 P 가 주어진다(1 <= P <= S <= 1,000,000)
// 2. 두 번째 줄에 임의로 만든 DNA 문자열(검증대상)이 주어진다.
// 3. 세 번쨰 줄에 부분 문자열에 포함되어야 할 {'A','C','G','T'} 의 최소 개수가 공백을 구분으로 주어진다. 각각의 수는 S보다 작거나 같은 음이 아닌 정수이며 총 합은 S보다 작거나 같음이 보장된다.
// 출력 : 만들 수 있는 비밀번호의 수

// 어떻게 풀 것인가?
// DNA 검증대상의 A, C, G, T 각각의 개수가 A, C, G, T 각각의 최소 개수를 충족하는지 여부를 체크해야 한다.
// 체크방법 : 슬라이딩 윈도우로 한 칸씩 이동하면서, 새로 생긴 문자에 따라 switch로 ++한다. 만약 그 문자가 최소 개수면 체크변수를 ++ 한다.
// 빠진 문자는 switch로 -- 한다. 만약 그 문자가 최소개수와 같았으면, 체크변수에 --한다.
// 추가와 제외를 끝낸 후, 체크 변수 == 4이면, 리턴할 정답에 ++ 한다.
public class DNAPassword_12891_009 {
    static int[] myArr = new int[4];
    static int[] checkArr = new int[4];
    static int check;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int S = sc.nextInt();
        int P = sc.nextInt(); // 1번 완료

        char A[] = new char[S];
        String DNA = sc.next();
        for(int i = 0; i < S; i++){
            A[i] = DNA.charAt(i);
        }
    

        int result = 0;

        for(int i = 0; i < 4; i++){
            checkArr[i] = sc.nextInt();
            if(checkArr[i] == 0){
                check++;
            }
        }
        //P만큼 초기 문자열 검증
        for(int i = 0; i < P; i++){
            add(A[i]);
        }
        if(check == 4){
            result++;
        }

        for(int i = P; i < S; i++){
            int j = i - P;
            add(A[i]);
            remove(A[j]);
            if(check == 4){
                result++;
            }
        }
        System.out.println(result);
    }

    static void add(char c){
        switch (c) {
            case 'A':
                myArr[0]++;
                if(myArr[0] == checkArr[0]){
                    check++;
                }
                break;

            case 'C':
                myArr[1]++;
                if(myArr[1] == checkArr[1]){
                    check++;
                }
                break;

            case 'G':
                myArr[2]++;
                if(myArr[2] == checkArr[2]){
                    check++;
                }
                break;

            case 'T':
                myArr[3]++;
                if(myArr[3] == checkArr[3]){
                    check++;
                }
                break;
        }
    }

    static void remove(char c){
        switch (c) {
            case 'A':
                if(myArr[0] == checkArr[0]){
                    check--;
                }
                myArr[0]--;
                
                break;
            case 'C':
                if(myArr[1] == checkArr[1]){
                    check--;
                } 
                myArr[1]--;
                
                break;
            case 'G':
                if(myArr[2] == checkArr[2]){
                    check--;
                }
                myArr[2]--;
                
                break;
            case 'T':
                if(myArr[3] == checkArr[3]){
                    check--;
                }
                myArr[3]--;
                break;
        
            default:
                break;
        }
    }
}