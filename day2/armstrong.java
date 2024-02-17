public class armstrong{
    public static void main(String[] args) {
        int n=153,rem,sum=0;
        int num=n;
        while(n>0){
            rem=n%10;
            sum=sum+(rem*rem*rem);
            n=n/10;
        }
        if(num==sum){
            System.out.println("armstrong");
        }
        else{
            System.out.println("not armstrong");
        }
    }
}