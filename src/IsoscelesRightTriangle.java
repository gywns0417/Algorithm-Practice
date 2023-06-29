public class IsoscelesRightTriangle {
    public static void main(String[] args) {
        //triangleLU(5);
        triangleRU(5);
    }

    static void triangleLB(int n){ //왼쪽 아래가 직각인 이등변 삼각형 출력
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void triangleLU(int n){ // 왼쪽 위가 직각인 이등변 삼각형 출력
        for(int i = 1; i <= n; i++){
            for(int j = i; j <= n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


    static void triangleRU(int n){ // 오른쪽 위가 직각인 이등변 삼각형 출력
        for(int i = 0; i < n; i++){
            for(int j = 0; j < i; j++){
                System.out.print(" ");
            }
            for(int k = n; k > i; k--){
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
