import java.io.*;

public class Main {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        bw.write(recur(N,0)+"\n");
        bw.close();
    }

    static int recur(int N, int count){
        if(N<2){
            return count;
        }
        return Math.min(recur(N/2, count+1 + (N%2)), recur(N/3, count +1 +(N%3)));
    }

}