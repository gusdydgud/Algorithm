class Solution {
    public int solution(String[] strArr) {
        int[] arr = new int[31];
        for (String str : strArr) {
            int i = str.length();
            arr[i]++;
        }
        int max = 0;
        for (int c : arr) {
            if (c > max) {
                max = c;
            }
        }
        
        return max;
    }
}