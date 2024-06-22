import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		while(true) {
		int a = sc.nextInt();
		if(a==-1) {
			break;
		}
		int arr[] = new int[10000];
		int c=0;
		int b=0;
		for(int i=1,j=0;i<a;i++) {
			if(a%i==0) {
				arr[j]=i;
				j++;
				c++;
				b+=i;
			}
		}
		
		
		if(a==b) {
			System.out.print(a+" = "+arr[0]);
			for(int i=1;i<c;i++) {
				System.out.print(" + "+arr[i]);
			}
			System.out.println();
		}else {
			System.out.println(a+" is NOT perfect.");
		}
		
		}
	        
		
		// TODO Auto-generated method stub
		
	}

}