import java.util.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
 
		int n = in.nextInt();
		System.out.println(r(n, 0));
	}
 
	static int r(int n, int c) {
		if (n < 2) {
			return c;
		}
		return Math.min(r(n / 2, c + 1 + (n % 2)), r(n / 3, c + 1 + (n % 3)));
 
	}
}