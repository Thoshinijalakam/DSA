import java.util.*;
public class palindrome_dyn_string_builder{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        StringBuilder sb=new StringBuilder(str); 
           
        System.out.println("Reversed string:"+sb.reverse());
        String rev=sb.reverse().toString();
        if(str.equals(rev)){
            System.out.println("is a palindrome");
        }else{
            System.out.println("is not a palindrome");
        }
    }
}