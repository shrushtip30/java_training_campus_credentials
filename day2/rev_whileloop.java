
    /*for loop:is ussed when range is given
    while loop:is used when range is not given
    do while: is used for menu driven programming*/

import java.util.*;

public class rev_whileloop{
    public static void main(String[] args) {
        int rem;
        int rev=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        while(n>0){
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        System.out.println(rev);
    }
}

