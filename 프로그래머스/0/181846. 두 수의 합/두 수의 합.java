class Solution {
    public String solution(String a, String b) {
        StringBuilder answer = new StringBuilder();
        int A = a.length();
        int B = b.length();
        int c = 0;
        int i = A - 1, j = B - 1;
        while (i >= 0 || j >= 0 || c > 0) {
            int AA = (i >= 0) ? a.charAt(i) - '0' : 0;
            int BB = (j >= 0) ? b.charAt(j) - '0' : 0;
            
            int sum = AA + BB + c;
            answer.append(sum % 10);
            c = sum / 10;
            i--;
            j--;
        }
        return answer.reverse().toString();
    }
}