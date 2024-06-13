class Solution {
    public String solution(String my_string, int s, int e) {
         String start = my_string.substring(0, s);
        String mid = my_string.substring(s, e + 1);
        String end = my_string.substring(e + 1);
        String rm = new StringBuilder(mid).reverse().toString();
     
        return start + rm + end;
    }
}