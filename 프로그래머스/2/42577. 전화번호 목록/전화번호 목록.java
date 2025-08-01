import java.util.HashMap;

class Solution {
    public boolean solution(String[] phone_book) {
        HashMap<String, Boolean> map = new HashMap<>();

        // 1. 모든 번호를 해시에 저장
        for (String number : phone_book) {
            map.put(number, true);
        }

        // 2. 각 번호의 접두어가 있는지 확인
        for (String number : phone_book) {
            for (int i = 1; i < number.length(); i++) {
                String prefix = number.substring(0, i);
                if (map.containsKey(prefix)) {
                    return false;
                }
            }
        }

        return true;
    }
}
