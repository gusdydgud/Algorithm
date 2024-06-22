import java.util.*;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        sc.close();
        
        int sum = 0;
        int min = Integer.MAX_VALUE;
        
        for(int i = M; i <= N; i++) {
            if(isPrime(i)) {
                sum += i;
                if(min > i) {
                    min = i;
                }
            }
        }
        
        if(sum == 0) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(min);
        }
    }
    
    // 소수 판별 함수
    public static boolean isPrime(int num) {
        if(num < 2) return false;
        for(int i = 2; i <= Math.sqrt(num); i++) {
            if(num % i == 0) return false;
        }
        return true;
    }
}