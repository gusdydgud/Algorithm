class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int s = 0;
        int n = x;
        while(x>0){
            s+=x%10;
            x/=10;
        }
        return (n%s==0);
    }
}