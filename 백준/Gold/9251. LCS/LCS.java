import java.io.*;


public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String a = br.readLine();
        String b = br.readLine();

        int[][] m = new int[a.length()+1][b.length()+1];
        for(int i=0; i<=a.length(); i++){
            m[i][0] = 0;
        }
        for(int i=0; i<=b.length(); i++){
            m[0][i] = 0;
        }       
        for(int i=1; i<=a.length(); i++){
            for(int j=1; j<=b.length(); j++){
                if(a.charAt(i-1) == b.charAt(j-1)) m[i][j]= m[i-1][j-1]+1;
                else m[i][j]= Math.max(m[i-1][j],m[i][j-1]);
            }
        }
        System.out.println(m[a.length()][b.length()]);
	}
}