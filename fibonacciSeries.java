import java.util.Scanner;

public class fibonacciSeries {
    public static long fibonacci(int position){
        if (position == 0) {
      return 0;
    } else if (position == 1) {
      return 1;
    }
    return fibonacci(position-1) + fibonacci(position-2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number: ");
        int position = sc.nextInt();
        System.out.println("the fibonacci number at "+position+" is------>"+fibonacci(position));
    }
    
}
