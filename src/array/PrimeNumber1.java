package array;
// 1000 이의 소를 열거(버전 1)

public class PrimeNumber1 {
    public static void main(String[] args) {
        int counter = 0;

        for(int n = 2; n <= 1000; n++){
            int i;
            for(i = 2; i < n; i++){
                counter++;
                if(n % i == 0) // 나누어 떨어지면 소수가 아님
                    break;
            }
            if(n == i) //마지막까지 안나눠 떨어지면
            System.out.println(n);
        }

        System.out.println("나눗셈을 수행한 횟수 : " + counter);
    }
}
