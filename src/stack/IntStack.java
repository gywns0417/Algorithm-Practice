package stack;

public class IntStack {
    private int max; // 스택 용량
    private int ptr; // 스택 포인터
    private int[] stk; // 스택 본체

    // 실행 시 예외 : 스택이 비어 있음
    public class EmptyIntStackException extends RuntimeException {
        public EmptyIntStackException(){}
    }

    // 실행 시 예외 : 스택이 가득 참
    public class OverflowIntStackException extends RuntimeException {
        public OverflowIntStackException(){}
    }

    // 생성자
    public IntStack(int capacity){
        ptr = 0;
        max = capacity;
        try {
            stk = new int[max]; // 스택 본체용 배열 생성
        } catch (OutOfMemoryError e) { // 생성할 수 없음
            max = 0;
        }
    }

    public int push(int x) throws OverflowIntStackException {
        if (ptr >= max){
            throw new OverflowIntStackException();
        }
        return stk[ptr++] = x;
    }

    public int pop() throws EmptyIntStackException {
        if(ptr <= 0){
            throw new EmptyIntStackException();
        }
        return stk[--ptr];
    }

    public int peek() throws EmptyIntStackException {
        if(ptr <= 0){
            throw new EmptyIntStackException();
        }
        return stk[ptr - 1];
    }
}

