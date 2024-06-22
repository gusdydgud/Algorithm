import java.util.*;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        
        int[] arr = new int[10000];
        int count = 0;
        
        for(int i = 1; i <= a; i++) {
            if(a % i == 0) {
                arr[count] = i;
                count++;
            }
        }
        
        if(b > count) {
            System.out.println(0); // 약수가 부족한 경우
        } else {
            System.out.println(arr[b - 1]);
        }
    }
}