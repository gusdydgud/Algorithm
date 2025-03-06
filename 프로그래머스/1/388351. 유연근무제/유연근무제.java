class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;
        int cnt=0;
        int goal=0;
        for(int i=0;i<schedules.length;i++){
            for(int j=0;j<timelogs[0].length;j++){
                if((startday + j - 1) % 7 + 1 <= 5){
                    if(schedules[i]%100>=50){
                        goal=schedules[i]+50;     
                    }else{
                        goal=schedules[i]+10;
                    }
                    if(timelogs[i][j]>goal){
                        break;
                    }else{
                        cnt++;
                    }
                }
            }
            if(cnt==5){
                answer++;
            }
            cnt=0;
        }
        return answer;
    }
}