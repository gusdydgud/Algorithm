class Solution {
    public int[] solution(int[] arr) {
        int s=-1;
        int e=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==2){
                s=i;
                break;
            }
        }
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]==2){
                e=i;
                break;
            }
        }
        int arr2[] = new int[e-s+1];
        if(e==-1&&s==-1){
            return new int[]{-1};
        }else if(e-s==0){
            return new int[]{2};
        }else{
            for(int i=s;i<=e;i++){
                arr2[i-s] = arr[i];
            }
        }
        
        
        return arr2;
    }
}