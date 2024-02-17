import java.util.Scanner;

public class marks {
    public static void main(String[] args) {
        int n1,n2,n3;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 3 marks:");
        n1=sc.nextInt();
        n2=sc.nextInt();
        n3=sc.nextInt();
        if (n1<45 || n2<45 || n3<45){
            System.out.println("fail");

        }
    }
}
