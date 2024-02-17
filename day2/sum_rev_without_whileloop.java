import java.util.Scanner;
public class sum_rev_without_whileloop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no:");
        int n=sc.nextInt();
        int n1,n2,n3,n4,rev,n5;

        //last digit no
        /*n=n%10;
        no=n/10;
        n=n%10;
        no=no/10;
        n=n%10;
        System.out.println("last digit no:"+n);*/

        //sum of 2 digits
        /*n1=n%10;
        n=n/10;
        n2=n%10;
        n=n/10;
        System.out.println("sum"+(n1+n2));*/

        //sum of 3 digits
        /*n1=n%10;
        n=n/10;
        n2=n%10;
        n=n/10;
        n3=n%10;
        n=n/10;
        System.out.println("sum"+(n1+n2+n3));*/

        //reverse no
        /*n1=n%10;
        n=n/10;
        n2=n%10;
        n=n/10;
        n3=n%10;
        n=n/10;
        n4=n%10;
        n=n/10;
        rev=n1*1000+n2*100+n3*10+n4;
        System.out.println(rev);                                        //practice code online
        
        */

        n1=n%10;
        n2=n/10000;
        System.out.println(n1+n2);




        
    }
}
