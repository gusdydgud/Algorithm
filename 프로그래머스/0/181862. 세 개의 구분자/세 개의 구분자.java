import java.util.*;
class Solution {
    public String[] solution(String myStr) {
        String[] answer = myStr.split("[a-c]");
        List<String> list = new ArrayList<>();
        for(String s:answer){
            if(!s.isEmpty()){
                list.add(s);
            }
        }
        if(list.isEmpty()){
            return new String[]{"EMPTY"};
        }
        return list.toArray(new String[0]);
    }
}