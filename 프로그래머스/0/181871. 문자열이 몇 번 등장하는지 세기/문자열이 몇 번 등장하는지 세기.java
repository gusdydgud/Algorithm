class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        int i=0;
        while((i=myString.indexOf(pat,i)) != -1){
            answer++;
            i++;
        }
        return answer;
    }
}