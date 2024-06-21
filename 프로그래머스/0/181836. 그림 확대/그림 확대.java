class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length*k];
        for(int i=0;i<picture.length;i++){
            for(int j=0;j<k;j++){
                String arr="";
                for(int a=0;a<picture[i].length();a++){
                    for(int b=0;b<k;b++){
                        arr+=picture[i].charAt(a);
                    }
                }
                answer[i*k+j]=arr;
            }
            
        }
        return answer;
    }
}