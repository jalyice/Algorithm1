import java.io.*;
import java.util.*;

 public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        double sum = 0;
        double avg = 0;
        int num = (int)Math.round(n * 0.15);
        
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        for(int i=num; i<n-num; i++){
            sum += arr[i];
        }
        avg = Math.round((sum/(n-num*2)));
        System.out.println((int)avg);
        

    }
}
