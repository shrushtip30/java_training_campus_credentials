import java.util.*;
public class switchcase_calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (true) {
            System.out.println("enter two values");
            int a=sc.nextInt();
            int b=sc.nextInt();
            System.out.println("1.Addition");
            System.out.println("2.Substraction");
            System.out.println("3.Division");
            System.out.println("4.Multiplication");
            System.out.println("5.Exit");
            System.out.println("enter your choice :");
            int n=sc.nextInt();
            switch (n) {
                case 1:System.out.println("Result:"+(a+b));
                    break;
                case 2:System.out.println("Result:"+(a-b));
                    break;
                case 3:System.out.println("Result:"+(a/b));
                    break;
                case 4:System.out.println("Result:"+(a*b));
                    break;
                case 5:System.exit(0);
                default:System.out.println("Invalid input");
                    break;
            }
        }
    }
}
