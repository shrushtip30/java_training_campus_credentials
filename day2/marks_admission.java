import java.util.Scanner;

public class marks_admission {
    public static void main(String[] args) {
        int n1,n2,n3;
        int g;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 3 marks:");
        n1=sc.nextInt();
        n2=sc.nextInt();
        n3=sc.nextInt();
        System.out.println("Enter your gender (0=Male,1=Female):");
        g=sc.nextInt();
        int total=n1+n2+n3;
        int per=(total/3)*100;
        if(per>=62 && g==1){
            System.out.println("Can take admission");
        }
        else{
            System.out.println("cannot take admission");
        }

    }
}
