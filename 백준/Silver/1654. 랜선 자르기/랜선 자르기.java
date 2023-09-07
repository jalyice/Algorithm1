import java.io.*;
import java.util.*;

public class Main {

    public static long Binary_Search(long arr[], int N, long max){
        long half = 0;
        long min = 1;

        while(min<=max){
            half = (min + max) / 2;
            long cnt =0;
            
            for(long num : arr){
                cnt += num/half;
            }

            if(cnt < N) max = half - 1;
            else min = half+1;
        }

        return (max+min)/2;
    }
	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        long result = 0;
        long max =0;

        long[] arr = new long[K];
        for(int i=0; i<K; i++){
            arr[i]= Integer.parseInt(br.readLine());
            max = Math.max(max, arr[i]);
        }

        result = Binary_Search(arr, N, max);

        System.out.println(result);
    
    }

} 