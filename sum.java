import java.util.*;
public class sum{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers separated by comma:");
        String input=sc.nextLine();
        sc.close();
        String[]parts=input.split(",");
        int num1=Integer.parseInt(parts[0].trim());
        int num2=Integer.parseInt(parts[1].trim());
        int res=num1+num2;
        System.out.println("Enter first number:"+num1);
        System.out.println("Enter second number:"+num2);
        System.out.println(num1+"+"+num2+'='+res);
    }
}