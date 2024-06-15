class Solution {
    public int[] solution(int[] arr) {
        
        int a=arr.length;
        int c=1;
       
        while(a>c){
          c*=2;
           
        }
        int[] answer = new int[c];
        for(int i=0;i<arr.length;i++){
            answer[i]=arr[i];
        }
        return answer;
    }
}