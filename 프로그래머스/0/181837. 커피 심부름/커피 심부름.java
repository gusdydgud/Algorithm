class Solution {
    public int solution(String[] order) {
        int answer = 0;
        for(int i=0;i<order.length;i++){
            if(order[i].indexOf("latte")!=-1){
                answer+=5000;
            }else {
                answer+=4500;
            }
        }
        return answer;
    }
}