class Solution {
    public int[] solution(int[] numlist, int n) {
        int a = numlist.length;
        for (int i = 0; i < a - 1; i++) {
            for (int j = 0; j < a - 1 - i; j++) {
                int x = Math.abs(numlist[j] - n);
                int y = Math.abs(numlist[j + 1] - n);
                if (x > y || (x == y && numlist[j] < numlist[j + 1])) {
                    int tem = numlist[j];
                    numlist[j] = numlist[j + 1];
                    numlist[j + 1] = tem;
                }
            }
        }

        return numlist;
    }
}