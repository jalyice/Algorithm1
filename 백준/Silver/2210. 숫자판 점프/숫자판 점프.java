import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    static int[][] board = new int[5][5];
    static Set<String> uniqueNumbers = new HashSet<>();
    static int[] dx = {0, 0, 1, -1}; // 오른쪽, 왼쪽, 아래, 위
    static int[] dy = {1, -1, 0, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 숫자판 입력 받기
        for (int i = 0; i < 5; i++) {
            String[] line = br.readLine().split(" ");
            for (int j = 0; j < 5; j++) {
                board[i][j] = Integer.parseInt(line[j]);
            }
        }

        // 모든 칸에서 DFS 시작
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                dfs(i, j, "" + board[i][j], 1);
            }
        }

        // 결과 출력
        System.out.println(uniqueNumbers.size());
    }

    static void dfs(int x, int y, String number, int depth) {
        if (depth == 6) {
            uniqueNumbers.add(number); // 6자리 수가 완성되면 Set에 추가
            return;
        }

        // 4방향으로 이동
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            // 범위를 벗어나지 않으면 DFS 계속
            if (nx >= 0 && nx < 5 && ny >= 0 && ny < 5) {
                dfs(nx, ny, number + board[nx][ny], depth + 1);
            }
        }
    }
}
