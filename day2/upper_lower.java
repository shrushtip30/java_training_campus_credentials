import java.util.Scanner;
public class upper_lower {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter character:");
        char ch=sc.next().charAt(0);
        if(ch>=65 && ch<=90){
            System.out.println("UpperCase");
        }
        else if(ch>=97 && ch<=122){
            System.out.println("LowerCase");
        }
        else if(ch>=48 && ch<=57){
            System.out.println("Digits");
        }
        else{
            System.out.println("Special Symbol");
        }
    }
}
