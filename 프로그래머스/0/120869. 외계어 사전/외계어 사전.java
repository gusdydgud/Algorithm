class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 0;
        int arr[]=new int[dic.length];
        for(int i=0;i<spell.length;i++){
            for(int j=0;j<dic.length;j++){
                if(dic[j].contains(spell[i])){
                    arr[j]++;
                }
            }
        }
        for(int i:arr){
            if(i==spell.length){
                return 1;
            }
        }
       
        return 2;
    }
}