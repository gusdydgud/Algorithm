import java.util.*;
class Solution {
    public String[] solution(String[] str_list) {
        List<String> list = new ArrayList<>();
        int i=0;
        
        while(i<str_list.length){
            if(str_list[i].equals("l")){
                for(int j=0;j<i;j++){
                    list.add(str_list[j]);
                }break;
            }else if(str_list[i].equals("r")){
                for(int j=i+1;j<str_list.length;j++){
                    list.add(str_list[j]);
                }break;
            }i++;
        }
        if(list.isEmpty()){
            return new String[]{};
        }
        String arr[] = new String[list.size()];
        for(int j=0;j<list.size();j++){
            arr[j]=list.get(j);
        }
        return arr;
    }
}