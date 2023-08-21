package backjun;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class MinNumberFind_11003_010 {
    // 1. 첫째 줄에 주어지는 두 수는 각각 수의 갯수(N), 슬라이딩 윈도우 길이(L) 이다.
    // 2. 수가 정렬되어있지 않고, 할 때마다 정렬하기엔 자원 소모가 크다.
    // 3. 매번 최솟값을 출력해야 한다.
    // 4. 덱으로 숫자를 하나씩 넣되, (인덱스, 수의 값) 을 넣는다.
    // 5. 마지막 인덱스 - 첫번째 수 인덱스 + 1 > L 이면 첫 값을 제거해야 한다.
    // 6. 추가되는 값이 이전 값보다 작다면 이전 값을 삭제하고 넣는다. 인덱스 범위를 먼저 계산해야한다. 

    //  ++ Scanner 보다 BufferedReader 가 큰 데이터 호출에 좋다.
    //  ++ System.out.print()는 매번 출력에 상당한 시간을 소모할 수 있다. 특히 반복문 내에서 큰 오버헤드를 발생시킬 수 있다. 가능하다면, 출력한 문자열을 합친 후 한번에 출력하거나 BufferedWriter를 사용하자.
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        Deque<Node> deque = new ArrayDeque<>();

        for(int i = 0; i < N; i++){
            int now = Integer.parseInt(st.nextToken());

            // deque가 비어있지 않고, 마지막 값이 now보다 크다면
            while(!deque.isEmpty() && deque.getLast().value > now){
                deque.removeLast();
            }
            deque.addLast(new Node(now, i));

            // 인덱스 계산
            if(deque.getFirst().index <= i - L){
                deque.removeFirst();
            }
            bw.write(deque.getFirst().value + " ");
        }
        bw.flush();
        bw.close();
    }

    static class Node {
        public int index;
        public int value;

        Node(int value, int index){
            this.index = index;
            this.value = value;
        }
    }
}
