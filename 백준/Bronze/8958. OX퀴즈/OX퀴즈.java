import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        
        int T = Integer.parseInt(br.readLine());
        
        for(int i=0; i<T; i++){
            String str = br.readLine();
            int cnt = 0;
            int sum = 0;
            for(int j=0; j<str.length(); j++){
                if( str.charAt(j) == 'O'){
                    cnt++;
                }else{
                    cnt=0;
                }
                sum+=cnt;
            }
            
            System.out.println(sum);
            
        }
	}
}
