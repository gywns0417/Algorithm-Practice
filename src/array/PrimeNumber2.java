package array;
// 1000 이의 소를 열거(버전 2)

public class PrimeNumber2 {
    public static void main(String[] args) {
        int counter = 0;
        int ptr = 0; //소수의 개수
        int[] prime = new int[500];

        prime[ptr++] = 2; // 2는 예외로


        for(int n = 3; n <= 1000; n += 2){ // 대상은 홀수만
            int i;
            for(i = 1; i < ptr; i++){ //소수인지 검증
                counter++;
                if(n % prime[i] == 0) // 나누어 떨어지면 소수가 아님
                    break;
            }
            if(ptr == i) //마지막까지 안나눠 떨어지면
            prime[ptr++] = n;
        }

        for(int a : prime){
            System.out.println(a);
        }

        System.out.println("나눗셈을 수행한 횟수 : " + counter);
    }
}
