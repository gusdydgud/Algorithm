import java.util.Arrays;

public class Solution {
    public int solution(int[] mats, String[][] park) {
        int maxSize = 0;
        int rows = park.length;
        int cols = park[0].length;
        int[][] dp = new int[rows][cols];

        // DP 테이블 채우기
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (park[i][j].equals("-1")) {  // 빈 공간이면 계산
                    if (i == 0 || j == 0) {
                        dp[i][j] = 1; // 첫 행이나 첫 열은 1만 가능
                    } else {
                        dp[i][j] = Math.min(
                            Math.min(dp[i-1][j], dp[i][j-1]), 
                            dp[i-1][j-1]
                        ) + 1;
                    }
                } else {
                    dp[i][j] = 0; // 장애물이면 0
                }

                maxSize = Math.max(maxSize, dp[i][j]); // 실제 최대 크기 갱신
            }
        }

        // ✅ 가장 큰 정사각형이 2×2인데, mats 배열과 비교 시 정확한 값 선택
        Arrays.sort(mats);
        for (int i = mats.length - 1; i >= 0; i--) {
            if (mats[i] <= maxSize) {
                return mats[i];  // 가장 큰 돗자리 찾음
            }
        }

        return -1; // 돗자리 놓을 공간 없음
    }
}
