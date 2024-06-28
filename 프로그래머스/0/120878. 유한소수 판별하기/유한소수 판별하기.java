public class Solution {
    	
    public int solution(int a, int b) {
    	
      if(b == 1) return 1;
    	
    	int gcd = 0;
    	
    	for(int i = Math.min(a, b); i > 0; i--) {
    		if(a % i == 0 && b % i == 0) {
    			gcd = i; break;
    		}
    	}
    	
    	b /= gcd ;
    	
    	while (b % 2 == 0) b /= 2;
    	while (b % 5 == 0) b /= 5;

        return (b == 1) ? 1 : 2;       
    }
}