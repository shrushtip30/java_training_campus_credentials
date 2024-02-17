import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        int rem,rev=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        int num=n;
        while(n>0){
            rem=n%10;
            rev=(rev*10)+rem;
            n=n/10;
        }
        if (rev==num){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }

}
}
