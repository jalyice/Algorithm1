import java.io.*;
import java.util.*;
public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int[] stack = new int [1000000];
        int idx = 0;
        while(N -- > 0){
            st = new StringTokenizer(br.readLine());
            int k = Integer.parseInt(st.nextToken());
            switch(k){
                case 1:		
		        	int num = Integer.parseInt(st.nextToken());
                    stack[idx++] = num;
		        	break;
        		case 2:		
                    if(idx == 0) bw.write(-1+"\n");
                    else {
                        bw.write(stack[idx-1]+"\n");
                        stack[idx--] = 0;
                    }
			        break; 
		        case 3:
                    bw.write(idx+"\n");
			        break;
                case 4:
                    if(idx==0) bw.write(1+"\n");
                    else bw.write(0+"\n");
                    break;
                case 5:
                    if(idx==0) bw.write(-1+"\n");
                    else bw.write(stack[idx-1]+"\n");
                    break;
	        	default:
                    break;
            }
            
        }
        bw.close();
    }
}
