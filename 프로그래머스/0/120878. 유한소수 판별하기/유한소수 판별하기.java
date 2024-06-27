class Solution {
	public int solution(int a, int b) {
    int gcd = gcd(a, b);
        
        // 기약분수의 분모 계산
        int denominator = b / gcd;
        
        // 분모가 2와 5로만 나누어지는지 확인
        while (denominator % 2 == 0) {
            denominator /= 2;
        }
        while (denominator % 5 == 0) {
            denominator /= 5;
        }
        
        // 최종적으로 분모가 1이 되면 유한소수, 그렇지 않으면 무한소수
        return denominator == 1 ? 1 : 2;
    }

    // 유클리드 호제법을 이용한 최대공약수 계산 함수
    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}