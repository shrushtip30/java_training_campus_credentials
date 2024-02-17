import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no:");
        int n=sc.nextInt();
        int f0=0,f1=1;
        int f2;
        System.out.print(f0+"\t"+f1+"\t");
        for(int i=3;i<=n;i++){
            f2=f0+f1;
            System.out.print(f2+"\t");
            f0=f1;
            f1=f2;
        }
        
    }
    
}
