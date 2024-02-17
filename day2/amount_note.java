import java.util.Scanner;
public class amount_note {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter amount :");
        int amt=sc.nextInt();
        System.out.println("Enter which note do you want");
        int note=sc.nextInt();
        switch (note) {
            case 2000: int n1=amt/2000;
                System.out.println("2000*"+n1+"="+2000*n1);
                amt=amt%2000;
                
            case 500: n1=amt/500;
                System.out.println("500*"+n1+"="+500*n1);
                amt=amt%500;
                
            case 200: n1=amt/200;
                System.out.println("200*"+n1+"="+200*n1);
                amt=amt%200;
                
            case 100: n1=amt/100;
                System.out.println("100*"+n1+"="+100*n1);
                amt=amt%100;
                
            case 50: n1=amt/50;
                System.out.println("50*"+n1+"="+50*n1);
                amt=amt%50;
                
            case 20: n1=amt/20;
                System.out.println("20*"+n1+"="+20*n1);
                amt=amt%20;
                
            case 10: n1=amt/10;
                System.out.println("10*"+n1+"="+10*n1);
                amt=amt%10;
                
            case 5: n1=amt/5;
                System.out.println("5*"+n1+"="+5*n1);
                amt=amt%5;
                
            case 2: n1=amt/2;
                System.out.println("2*"+n1+"="+2*n1);
                amt=amt%2;
                
            case 1: n1=amt/1;
                System.out.println("1*"+n1+"="+1*n1);
                amt=amt%1;
            
        }
    }
}
