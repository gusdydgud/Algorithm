import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        for(int i=0;i<t;i++){
            int a=0;
            int b=0;
            int c=0;
            int d=0;
            int r=sc.nextInt();
            while(r>0){
                a=r/25;
                r=r%25;
                b=r/10;
                r=r%10;
                c=r/5;
                r=r%5;
                d=r;
                r=r/5;
                if(r==0){
                    System.out.println(a+" "+b+" "+c+" "+d);
                }
            }
        }
        

        

        
       

     
       
    }
  
}