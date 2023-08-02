package backjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class FindNumber {
      public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        String st[] = br.readLine().split(" ");

        for(int i = 0; i < arr.length; i++){
            arr[i] = Integer.parseInt(st[i]);
        }

        int M = Integer.parseInt(br.readLine());

        int[] mArr = new int[M];
        String st2[] = br.readLine().split(" ");

        for(int i = 0; i < mArr.length; i++){
            mArr[i] = Integer.parseInt(st2[i]);
        }
        
        Arrays.sort(arr);

        for(int i = 0; i < mArr.length; i++){
            int key = mArr[i];
            System.out.println(binarySearch(key, arr));
        }

      }

       static int binarySearch(int key, int[] arr){

        int pl = 0;
        int pr = arr.length - 1;
        do {
            int pc = (pl + pr) / 2;

            if(key == arr[pc]){
                return 1;
            }
            else if(arr[pc] < key){
                pl = pc + 1;
            }
            else pr = pc - 1;
            } while (pl <= pr); 
            return 0;
        }
    }


