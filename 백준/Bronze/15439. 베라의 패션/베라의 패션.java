import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        // 경우의 수는 N * (N-1)
        System.out.println(N * (N - 1));
    }
}