class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int n = rank.length;
        int[][] s = new int[n][2];
        for (int i = 0; i < n; i++) {
            s[i][0] = rank[i];
            s[i][1] = i;
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (s[j][0] > s[j + 1][0]) {
                    int[] temp = s[j];
                    s[j] = s[j + 1];
                    s[j + 1] = temp;
                }
            }
        }
        int count = 0;
        int a = 0, b = 0, c = 0;
        for (int i = 0; i < n; i++) {
            int idx = s[i][1];
            if (attendance[idx]) {
                if (count == 0) {
                    a = idx;
                } else if (count == 1) {
                    b = idx;
                } else if (count == 2) {
                    c = idx;
                    break;
                }
                count++;
            }
        }
        
        return 10000 * a + 100 * b + c;
    }
}