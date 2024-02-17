import java.util.Scanner;
public class greatest_no {
    public static void main(String[] args) {
        int n1,n2,n3,n4,n5;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 5 nos:");
        n1=sc.nextInt();
        n2=sc.nextInt();
        n3=sc.nextInt();
        n4=sc.nextInt();
        n5=sc.nextInt();
        int max=n1;
        if(n2>max){
            max=n2;
        }
        if(n3>max){
            max=n3;
        }
        if(n4>max){
            max=n4;
        }
        if(n5>max){
            max=n5;
        }
        System.out.println("maximum no is:"+max);
    }
}
