class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String arr[] = my_string.split(" ");
        answer = Integer.parseInt(arr[0]);
        for(int i=1;i<arr.length;i+=2){
            String a=arr[i];
            int n =Integer.parseInt(arr[i+1]);
            if(a.equals("+")){
                answer+=n;
            }else if(a.equals("-")){
                answer-=n;
            }
        }
        return answer;
    }
}