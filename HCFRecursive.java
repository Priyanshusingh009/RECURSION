public class HCFRecursive {
    public static int gcd(int a, int b) {
        // Base case: if b becomes 0, a is the GCD
        if (b == 0) {
            return a;
        }
        
        return gcd(b, a % b);
    }
     public static void main(String[] args) {
        int num1 = 5, num2 = 3;

        int result = gcd(num1, num2);

        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + result);
    }
    
}
