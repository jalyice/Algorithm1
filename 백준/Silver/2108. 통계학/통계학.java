import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[8001];
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for(int i=0; i<N; i++){
            int val = Integer.parseInt(br.readLine());
            sum += val;
            arr[val+4000]++;
            if(max < val) max = val;
            if(min > val) min = val;
            
        }
        int cnt = 0;
        int mid = 0;
        int mode = 0;
        int mode_max = 0;
        boolean flag = false;

        for(int i = min + 4000; i <= max + 4000; i++){
            if(arr[i]>0){
                if(cnt < (N+1)/2 ){
                    cnt += arr[i];
                    mid = i - 4000;
                }

                if(mode_max < arr[i]){
                    mode_max = arr[i];
                    mode = i - 4000;
                    flag = true;
                }

                else if(mode_max == arr[i] && flag ==true){
                    mode = i - 4000;
                    flag = false;
                }
            }
        }
        System.out.println((int)Math.round((double)sum / N));
		System.out.println(mid);
		System.out.println(mode);
		System.out.println(max - min);
        
        
    }
} 