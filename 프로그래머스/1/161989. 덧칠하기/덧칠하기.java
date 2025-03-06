class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int cnt = 0; // 덧칠해야 할 위치 index

        for (int i = 1; i <= n; i++) {
            if (cnt < section.length && section[cnt] == i) { // 덧칠할 곳이면
                answer++; // 덧칠 횟수 증가
                int end = i + m - 1; // 롤러가 덧칠할 범위
                
                // ✅ 덧칠한 범위보다 작은 section[cnt]는 모두 건너뜀
                while (cnt < section.length && section[cnt] <= end) {
                    cnt++;
                }

                i = end; // 롤러 범위 이후로 i 이동
            }
        }
        return answer;
    }
}
