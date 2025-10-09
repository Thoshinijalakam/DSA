import java.util.*;
public class Count_vowel_consonants_dyn{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        sc.close();
        int vowels=0,consonants=0;
        str=str.toLowerCase();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if("aeiou".indexOf(ch)!=-1){
                vowels++;
            }else if(ch>='a'&&ch<='z'){
                consonants++;
            }
        }
        System.out.println("Vowels:"+vowels);
        System.out.println("Consonants:"+consonants);
    }
}