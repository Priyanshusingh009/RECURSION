import java.util.Scanner;

public class ExponentiationCalculator {
    public static int exponential(int base,int exponent){
        if(exponent==0){
            return 1;
        }
        return base * exponential(base, exponent-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the base:");
        int base=sc.nextInt();
        System.out.println("enter exponent:");
        int exp=sc.nextInt();
        System.out.println("the value after calutaion of "+base+"^"+exp+" is "+exponential(base, exp));
    }
}
