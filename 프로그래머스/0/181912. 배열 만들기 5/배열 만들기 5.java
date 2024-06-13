import java.util.*;
class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        
        List<Integer> list = new ArrayList<>();
        for (String str : intStrs) {
            String ss = str.substring(s, s + l);
            int num = Integer.parseInt(ss);
            if (num > k) {
                list.add(num);
            }
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}