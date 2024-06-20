class Solution {
    public int[][] solution(int[][] arr) {
        int m=0;
        if(arr.length>arr[0].length){
            m=arr.length;
        }else{
            m=arr[0].length;
        }
        int[][] answer = new int[m][m];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                answer[i][j]=arr[i][j];
            }
        }
        return answer;
    }
}