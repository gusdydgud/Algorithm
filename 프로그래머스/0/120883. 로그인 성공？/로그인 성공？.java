class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "fail";
        
            for(int j=0;j<db.length;j++){
                if(db[j][0].equals(id_pw[0])){
                    if(db[j][1].equals(id_pw[1])){
                        return "login";
                    }else{
                        return "wrong pw";
                    }
                }else{
                    answer="fail";
                }
            }
        
        return answer;
    }
}