import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        Map<String, Integer> termMap = new HashMap<>();
        List<Integer> expiredList = new ArrayList<>();

        for (String term : terms) {
            String[] splitTerm = term.split(" ");
            termMap.put(splitTerm[0], Integer.parseInt(splitTerm[1]));
        }

        int[] todayDate = parseDate(today);

        for (int i = 0; i < privacies.length; i++) {
            String[] splitPrivacy = privacies[i].split(" ");
            int[] privacyDate = parseDate(splitPrivacy[0]);
            int termMonths = termMap.get(splitPrivacy[1]);

            if (isExpired(privacyDate, termMonths, todayDate)) {
                expiredList.add(i + 1);
            }
        }

        return expiredList.stream().mapToInt(Integer::intValue).toArray();
    }

    private int[] parseDate(String date) {
        String[] splitDate = date.split("\\.");
        return new int[]{Integer.parseInt(splitDate[0]), Integer.parseInt(splitDate[1]), Integer.parseInt(splitDate[2])};
    }

    private boolean isExpired(int[] privacyDate, int termMonths, int[] todayDate) {
        privacyDate[1] += termMonths;
        while (privacyDate[1] > 12) {
            privacyDate[0]++;
            privacyDate[1] -= 12;
        }

        if (privacyDate[0] < todayDate[0]) return true;
        if (privacyDate[0] == todayDate[0] && privacyDate[1] < todayDate[1]) return true;
        if (privacyDate[0] == todayDate[0] && privacyDate[1] == todayDate[1] && privacyDate[2] <= todayDate[2]) return true;
        
        return false;
    }
}
