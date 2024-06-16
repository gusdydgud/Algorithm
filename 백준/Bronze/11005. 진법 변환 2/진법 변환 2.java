import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a=sc.nextInt();
        
        StringBuilder sb=new StringBuilder();
        while(n>0){
            int na =n%a;
            if(na<10){
                sb.append((char)(na+'0'));
            }else{
                sb.append((char)(na-10+'A'));
            }
            n/=a;
        }
        System.out.println(sb.reverse().toString());
        

        

        
       

     
       
    }
  
}