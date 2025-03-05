class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        int c=wallet[0];
        int d=wallet[1];
        int a=bill[0];
        int b=bill[1];
        while(true){
            if(a<=c&&b<=d){
                return answer;
            }else if(b<=c&&a<=d){
                return answer;
            }
            if(a>b){
                a=a/2;
            }else{
                b=b/2;
            }
            answer++;
            
        }
       
    }
}