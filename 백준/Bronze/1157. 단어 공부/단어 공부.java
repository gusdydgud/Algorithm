import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		String str = sc.next();
		str = str.toUpperCase();
		int arr[] = new int[26];
		int m = -1;
		for(int i =0;i<str.length();i++) {
			arr[str.charAt(i)-65]++;
		}
		char cnt = '?';
		for(int i =0;i<26;i++) {
			if(m<arr[i]) {
				cnt = (char) (i+'A');
				m=arr[i];
			}else if(arr[i] ==m) {
				cnt = '?';
			}
			
				
						
			
			
		}
		System.out.println(cnt);
		
		// TODO Auto-generated method stub

	}

}