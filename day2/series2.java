import java.util.Scanner;

public class series2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no:");
        int n=sc.nextInt();
        double sum=1;
        int fact=1;
        int x=n;
        for(int i=1;i<=n;i++){
            while(n>0){
                fact=fact*n;
                sum=sum+(Math.pow(x,i))/fact;
                n--;
            }

        }
        System.out.println(sum);

    }
}
