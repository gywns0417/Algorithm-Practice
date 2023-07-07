package array;
// 1000 이의 소를 열거(버전 3)

public class PrimeNumber3 {
    public static void main(String[] args) {
        int counter = 0; // 곱셈과 나눗셈의 횟수
        int ptr = 0; //소수의 개수
        int[] prime = new int[500];

        prime[ptr++] = 2; // 2는 예외로
        prime[ptr++] = 3; // 3도 소수임.


        for(int n = 5; n <= 1000; n += 2){ // 대상은 홀수만
            boolean flag = false;
            for(int i = 1; prime[i] * prime[i] <= n;){ //소수인지 검증
                counter += 2;
                if(n % prime[i] == 0) // 나누어 떨어지면 소수가 아님
                    flag = true;
                    break;
            }
            if(!flag) //마지막까지 안나눠 떨어지면
            prime[ptr++] = n;
            counter++; // 조건 불만족시 나눗셈 진행 안하므로.
        }

        for(int a : prime){
            System.out.println(a);
        }

        System.out.println("곱셈과 나눗셈을 수행한 횟수 : " + counter);
    }
}
