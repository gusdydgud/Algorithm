import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String a = sc.next();
        int b = sc.nextInt();
        int r = 0;
        int p =1;
        for(int i =a.length()-1;i>=0;i--){
            char c = a.charAt(i);
            int v;
            if(c>='0' && c<='9'){
                v = c-'0';
            }else{
                v= c-'A'+10;
            }
            r+=v*p;
            p*=b;
        }
        System.out.println(r);
        sc.close();
        

        

        
       

     
       
    }
  
}