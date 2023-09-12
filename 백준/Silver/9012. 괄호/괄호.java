import java.io.*;

public class Main {
    public static String Solve(String s){
        int cnt = 0;
        for( char c : s.toCharArray()){
            if( c == '(') cnt++;
            else if( cnt == 0) return "NO";
            else cnt--;
        }
        if(cnt == 0) return "YES";
        else return "NO";
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        while(T-- > 0){
            bw.write(Solve(br.readLine())+"\n");
        }
        bw.close();
    }
} 