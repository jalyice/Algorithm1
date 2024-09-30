import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        if (N == 0) {
            System.out.println(0);
            return;
        } else if (N == 1) {
            System.out.println(1);
            return;
        }

        int a = 0, b = 1, c = 0;
        for (int i = 2; i <= N; i++) {
            c = a + b; // 피보나치 수 계산
            a = b;     // 이전 두 수 업데이트
            b = c;
        }
        System.out.println(c);
    }
}
