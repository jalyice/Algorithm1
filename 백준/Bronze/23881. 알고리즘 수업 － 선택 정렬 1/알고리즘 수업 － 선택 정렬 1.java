import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static int N, K, kth1=-1, kth2;

    private void selectionSort(int[] A) {   
        int swapCnt = 0;
        for (int i = N; i >= 2; i--) {
            
            int max = Integer.MIN_VALUE;
            int idx = 0;
            for (int j = 1; j <= i; j++) {
                if (max < A[j]) {
                    max = A[j];
                    idx = j;
                }
            }

        
            if (i != idx) {
                int tmp = A[i];
                A[i] = A[idx];
                A[idx] = tmp;

                if (++swapCnt == K) {
                    kth1 = A[idx];
                    kth2 = A[i];
                    return;
                }
            }
        }
    }

    private void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        int[] arr = new int[N +1];
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        selectionSort(arr);
        System.out.println(kth1==-1?-1:(kth1 + " " + kth2));
    }
    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}