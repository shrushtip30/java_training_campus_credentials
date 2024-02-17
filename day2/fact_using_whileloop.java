import java.util.*;

public class fact_using_whileloop {
    public static void main(String[] args) {
        int fact=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        while(n>0){
            fact=fact*n;
            n--;
        }
        System.out.println(fact);
    }
}
