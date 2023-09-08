import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st;

        while(true){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            if(a==0 && b==0 && c==0) break;
            int max = (a>b)&&(a>c)?a:(c>b?c:b);
            int min = (b>a)&&(c>a)?a:(b>c?c:b);
            int mid = (a>b)?((a>c)?((b>c)?b:c):a):((b>c)?((a>c)?a:c):b);

            if((max*max) == (min*min) + (mid*mid)) System.out.println("right");
            else System.out.println("wrong");
        }
        

    }
} 