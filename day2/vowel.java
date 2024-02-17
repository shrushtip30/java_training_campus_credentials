import java.util.Scanner;

public class vowel {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a character");
        String ch=sc.nextLine();
        if(ch.equals("a") || ch.equals("e") || ch.equals("i") || ch.equals("o") || ch.equals("u")){
            System.out.println("Vowel");
        }
        else{
            System.out.println("consonant");
        }
    }
}
