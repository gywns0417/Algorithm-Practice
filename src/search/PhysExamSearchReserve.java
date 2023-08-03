package search;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class PhysExamSearchReserve {
    // 신체검사 데이터를 정의합니다.
    static class PhysData {
        private String name;
        private int height;
        private double vision;

        // 생성자
        public PhysData(String name, int height, double vision) {
            this.name = name;
            this.height = height;
            this.vision = vision;
        }
        // 문자열을 반환하는 메소드(정보 확인용)
        public String toString() {
            return name + " " + height + " " + vision;
        }

        // 오름차순으로 정렬하기 위한 comparator
        public static final Comparator<PhysData> VISION_REVERSE_ORDER = new HeightOrderComparator(); //설정한 기준 따라 Comparator 객체 생성

        private static class HeightOrderComparator implements Comparator<PhysData> { //Comparator 기준 설정
            public int compare(PhysData d1, PhysData d2){
                return (d1.vision < d2.vision) ? 1 : (d1.vision > d2.vision) ? -1 : 0;
            }
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        PhysData[] x = {
            new PhysData("홍준기", 171, 1.5),
            new PhysData("김한결", 169, 0.8),
            new PhysData("전서현", 173, 0.7),
            new PhysData("유지훈", 168, 0.4),
            new PhysData("이나령", 162, 0.3)
        };
        System.out.print("시력이 몇인 사람을 찾고 있나요? : ");
        double vision = stdIn.nextDouble();
        int idx = Arrays.binarySearch(x, new PhysData("", 0, vision), PhysData.VISION_REVERSE_ORDER); // 배열 x에서 시력이 vision 요소를 VISION_REVERSE_ORDER 의해 검색

        if(idx < 0) System.out.println("요소가 없습니다.");
        else {
            System.out.println("[" + idx + "]에 있습니다.");
            System.out.println("찾은 데이터 : " + x[idx]); // 자동으로 toString() 메서드 호출
        }
    }
}
