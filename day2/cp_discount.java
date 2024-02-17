import java.util.Scanner;
public class cp_discount {
    public static void main(String[] args) {
        java.util.Scanner sc=new Scanner(System.in);
        double dis;
        System.out.println("Enter cost price:");
        int cp=sc.nextInt();
        System.out.println("Are you a student(y/n):");
        char s=sc.next().charAt(0);
        if (s=='y')
        {
            if(cp>500){
                dis=0.1*cp;
                System.out.println("Price:"+(cp-dis));
            }
            else{
                dis=0.05*cp;
                System.out.println("Price:"+(cp-dis));
            }
        }
        else{
            if(cp>cp){
                dis=0.08*cp;
                System.out.println("Price:"+(cp-dis));
            }
            else{
                dis=0.02*cp;
                System.out.println("Price:"+(cp-dis));
            }
        }
    }
}
