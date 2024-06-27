class Solution {
	public int solution(int a, int b) {
		int temp=0;
		for (int i=1; i<=Math.min(a, b); i++) {
			if(a%i==0 && b%i==0) {
				temp=i;
			}
		}
		b=b/temp;
		while(b%2==0 ||b%5==0) {
			if(b%2==0) {
				b/=2;
			}else if(b%5==0) {
				b/=5;
			}
		}
		return b==1 ? 1:2;

	}
}