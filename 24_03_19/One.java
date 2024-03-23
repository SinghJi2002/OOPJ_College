import java.util.Scanner;

public class One {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string");
        String str=sc.nextLine();
        System.out.println("Lower Case "+str.toLowerCase());
        System.out.println("Upper Case "+str.toUpperCase());
        StringBuilder sb=new StringBuilder();
        for(int i=str.length()-1;i>=0;i--){
            sb.append(str.charAt(i));
        }
        String reverse=sb.toString();
        System.out.println("Reverse String "+reverse);
        System.out.println("Enter new string");
        String newStr=sc.nextLine();
        System.out.println("Combined String is "+str.concat(newStr));
        System.out.println("Enter the character you want to search");
        String search=sc.next();
        System.out.println("Character in your entered string"+str.contains(search)+" at "+str.indexOf(search));
        if(str==reverse){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
        int vovel=0;
        int consonant=0;
        for(int i=0;i<str.length();i++){
            if(str.toLowerCase().charAt(i)=='a' || str.toLowerCase().charAt(i)=='e' || str.toLowerCase().charAt(i)=='i' || str.toLowerCase().charAt(i)=='o' || str.toLowerCase().charAt(i)=='u'){
                vovel++;
            }
            else{
                consonant++;
            }
        }
        System.out.println("Number of vovels "+vovel);
        System.out.println("Number of consonants "+consonant);
    }
}
