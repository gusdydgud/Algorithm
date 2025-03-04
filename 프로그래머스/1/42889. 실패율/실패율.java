import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] stagePlayers = new int[N + 2];

        for (int stage : stages) {
            stagePlayers[stage]++;
        }

        List<Stage> failureRates = new ArrayList<>();
        int totalPlayers = stages.length;

        for (int i = 1; i <= N; i++) {
            if (totalPlayers == 0) {
                failureRates.add(new Stage(i, 0));
            } else {
                double failureRate = (double) stagePlayers[i] / totalPlayers;
                failureRates.add(new Stage(i, failureRate));
                totalPlayers -= stagePlayers[i];
            }
        }

        failureRates.sort((a, b) -> {
            if (b.rate == a.rate) {
                return Integer.compare(a.stage, b.stage);
            }
            return Double.compare(b.rate, a.rate);
        });

        int[] answer = new int[N];
        for (int i = 0; i < N; i++) {
            answer[i] = failureRates.get(i).stage;
        }

        return answer;
    }

    class Stage {
        int stage;
        double rate;

        public Stage(int stage, double rate) {
            this.stage = stage;
            this.rate = rate;
        }
    }
}
