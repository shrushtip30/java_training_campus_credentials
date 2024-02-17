public class even_odd_count {
    public static void main(String[] args) {
        int even=0,odd=0;
        for(int i=1;i<=500;i++){
            if(i%2==0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println("Even:"+even);
        System.out.println("odd:"+odd);
    }
}
