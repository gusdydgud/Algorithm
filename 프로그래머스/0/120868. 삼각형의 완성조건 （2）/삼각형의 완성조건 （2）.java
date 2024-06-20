class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int a=sides[0];
        int b=sides[1];
        answer=a+b-1 - (Math.abs(a-b)+1)+1;
        return answer;
    }
}