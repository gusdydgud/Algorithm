import java.util.*;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int i = 2;
        while(a>1) {
        	if(a%i==0) {
        		System.out.println(i);
        		a/=i;
        	}else {
        		i++;
        	}
        	
        }
        
        
    }
}