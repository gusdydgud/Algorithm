class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        answer+=my_string.substring(0,s);
        answer+=overwrite_string;
        if(my_string.length() -s - overwrite_string.length()>0){
            answer+=my_string.substring(s+overwrite_string.length(),my_string.length());
        }
        
        return answer;
    }
}