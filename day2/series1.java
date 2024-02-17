import java.util.*;
public class series1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no:");
        int n=sc.nextInt();
        double sum=1;
        int x=n;
        for(int i=1;i<=n;i++){
            sum=sum+(Math.pow(x,i)/i);
        }
        System.out.println(sum);

    }
}
