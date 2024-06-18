class Solution {
    public String solution(String bin1, String bin2) {
        int num = Integer.parseInt(bin1,2);
        int num1= Integer.parseInt(bin2,2);
        int sum=num+num1;
        return Integer.toBinaryString(sum);
    }
}