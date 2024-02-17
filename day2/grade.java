public class grade {
    public static void main(String[] args) {
        int m1=60,m2=67,m3=78,m4=98,m5=84,total,per;
        char Grade=' ';
        total=m1+m2+m3+m4+m5;
        per=(total/500)*100;
        if(per>=85){
           Grade='A';
        }
        else if(per>=75 && per<85){
            Grade='B';
        }
        else if(per>=55 && per<75){
            Grade='C';
        }
        else if(per>=40 && per<55){
            Grade='D';
        }
        else{
            Grade='E';
        }
        System.out.println("percentage="+per+"\t"+"Grade="+Grade);
    }
}
