import java.util.*;
public class palindromedynamic{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        sc.close();
        String rev=" ";
        for(int i=str.length()-1;i>=0;i--){
            rev+=str.charAt(i);
        }
        if(str.equals(rev)){
            System.out.println(str+"is a palindrome");
        }else{
            System.out.println(str+"is not a palindrome");
        }
    }
}