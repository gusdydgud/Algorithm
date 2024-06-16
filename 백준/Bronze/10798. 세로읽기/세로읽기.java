import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        char arr[][]= new char[5][15];
        for(int i=0;i<5;i++){
            String a =sc.nextLine();
            for(int j=0;j<a.length();j++){
                arr[i][j] = a.charAt(j);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int j=0;j<15;j++){
            for(int i=0;i<5;i++){
                if(arr[i][j]!='\0'){
                    sb.append(arr[i][j]);
                }
            }
        }
        System.out.println(sb.toString());

        sc.close();
        

        

        
       

     
       
    }
  
}