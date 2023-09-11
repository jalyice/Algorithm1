import java.io.*;
import java.util.*;

public class Main {
    static int gcd(int n, int m){
        if(m == 0) return n;
        return gcd(m, n%m);
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int tmp = 0;
        if(n<m){
            tmp = n;
            n = m;
            m = tmp;
        }

        System.out.println(gcd(n,m));
        System.out.println(n*m/gcd(n,m));
    }
} 