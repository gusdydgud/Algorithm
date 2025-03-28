import java.util.*;
 
public class Main {
 
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		Queue<Integer> q = new LinkedList<>();
		
		int N = in.nextInt();
		
		for(int i = 1; i <= N; i++) {
			q.offer(i);
		}
		
		
		while(q.size() > 1) {
			q.poll();
			q.offer(q.poll());
		}
		
		System.out.println(q.poll());
	}
}