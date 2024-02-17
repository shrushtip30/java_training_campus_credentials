import java.util.Scanner;

public class Weekday {
    public static void main(String[] args) {
        String ch;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the day:");
        ch=sc.nextLine();
        if (ch.equals("Monday") || ch.equals("Tuesday") || ch.equals("Wednesday") || ch.equals("Thursday") || ch.equals("Friday")){
            System.out.println("Weekday");
        }
        else{
            System.out.println("Weekend");
        }
    }
}
