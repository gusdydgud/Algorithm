class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        boolean t= true;
        while(t){
            t=false;
            int arr1[] = new int[arr.length];
            for(int i=0;i<arr.length;i++){
                if(arr[i]>=50&&arr[i]%2==0){
                    arr1[i]= arr[i]/2;
                }else if(arr[i]<50&&arr[i]%2!=0){
                    arr1[i]=arr[i]*2+1;
                }else{
                    arr1[i]=arr[i];
                }
                if(arr1[i]!=arr[i]){
                    t=true;
                }
            }
            arr=arr1;
            answer++;
        }
        return answer-1;
    }
}