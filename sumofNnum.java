import java.util.Scanner;

public class sumofNnum{
    public static int sum(int n){
       if(n==0){
        return 0;
       }
       return n+sum(n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number ");
        int num =sc.nextInt();
        System.out.println("sum of numbers till "+num+" is -->"+sum(num));
    }
}