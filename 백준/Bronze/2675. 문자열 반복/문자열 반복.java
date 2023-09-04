import java.io.*;
import java.util.StringTokenizer;


public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
       
        int n = Integer.parseInt(br.readLine());
       
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
    
            int a = Integer.parseInt(st.nextToken());
            String s = st.nextToken(); 
        
            for(int j=0; j<s.length(); j++){
                for(int k=0; k<a; k++){
                    sb.append(s.charAt(j)); 
                }
        
            }
            
            System.out.println(sb);
            sb.setLength(0);
        }
            


	}
}