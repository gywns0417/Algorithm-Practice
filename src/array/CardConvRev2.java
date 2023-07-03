package array;
import java.util.Scanner;
//배열의 앞쪽에 아랫자리가 아니라 윗자리를 넣어두는 메서드를 작성하세요.

public class CardConvRev2 {
    //정수값 x를 r진수로 변환하여 배열 d에 아랫자리부터 넣어두고 자릿수를 반환한다.
    static int cardConvR(int x, int r, char[] d){
        int digits = 0;
        int n = 1;
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUWXYZ";
        //x를 r로 나눴을 때, 몇제곱까지 나눌 수 있는가? 즉, r의 n제곱으로 나눴을 때 1 이하면 안된다. n+1이 자릿수가 된다.
        while(x / (n*r) > 1){
            n++;
        }
        digits = n;

        do {
            d[n--] = dchar.charAt(x % r); //r로 나눈 나머지(변환값)을 배열에 역순으로 저장
            x /= r; // x = x / r (몫)
        } while(x != 0); //x가 0이 될 때까지 계속해서 배열에 변환값을 저장한다.
        return digits; //자릿수를 반환
        
    }
    public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    int no; // 변환하는 정수
    int cd; // 기수
    int dno; // 변환 후의 자릿수
    int retry; // 다시 한번?
    char[] cno = new char[32]; //변환 후 각 자리의 숫자를 넣어두는 문자의 배열

    System.out.println("10진수를 기수 변환합니다.");
    do {
        do{
            System.out.println("변환하는 음이 아닌 정수 : ");
            no = stdIn.nextInt();
        } while(no < 0);
        
        do {
            System.out.println("어떤 진수로 변환할까요? (2-36) : ");
            cd = stdIn.nextInt();
        } while (cd < 2 || cd > 36);
        dno = cardConvR(no, cd, cno);

        System.out.println(cd + "진수로는");
        for(int i = 0; i <= dno; i++){ // 순서대로 꺼낼 수 있다.
            System.out.print(cno[i]); //cardConvR 메소드에서 cno 값은 변함. dno - 1 이상 값은 다 0임.
        }
        System.out.println(" 입니다.");

        System.out.println("한번 더 할까요? (1.예/0.아니오) ; )");
        retry = stdIn.nextInt();
    } while(retry == 1); //do-while 문 전체 반복
}

}

