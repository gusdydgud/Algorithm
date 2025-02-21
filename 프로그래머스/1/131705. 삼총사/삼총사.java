class Solution {
    private int count = 0 ;
    public int solution(int[] number) {
        backt(number,0,0,0);
        return count;
    }
    private void backt(int[] number,int start, int depth, int sum){
        if (depth==3){
            if(sum==0){
                count++;
            }
            return;
        }
        for(int i=start;i<number.length;i++){
            backt(number,i+1,depth+1,sum+number[i]);
        }
    }
}