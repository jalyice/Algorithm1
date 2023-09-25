import java.io.*;
import java.util.*;

 public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> st;
        String str ="";

        while(true) {
            st = new Stack<>();
            str = new String(br.readLine());
            if(str.equals(".")) break;
            for(int i=0; i<str.length(); i++){
               char c = str.charAt(i);
               if(c == '(' || c == '[') st.push(c);
               else if(c == ')') {
                    if(st.empty() || st.peek()!='('){
                        System.out.println("no");
                        break;
                    } 
                    st.pop();
               }
               else if(c == ']') {
                    if(st.empty() || st.peek()!='['){
                        System.out.println("no");
                        break;
                    } 
                    st.pop();
               }
              
               else if(c=='.'){
                 if(st.empty()) System.out.println("yes");
                 else System.out.println("no");
               }          
            }
          

        }
         

    }
}
