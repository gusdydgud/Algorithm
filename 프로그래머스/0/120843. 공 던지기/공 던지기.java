class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        answer = (k-1) * 2 % numbers.length;
        return numbers[answer];
    }
}