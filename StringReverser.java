import java.util.Scanner;

public class StringReverser {
    public static String stringReverse(String str){
        if (str.length()==0){
            return "string is empty";
        }
        else if(str.length()==1){
            return str;
        }
        

        return stringReverse(str.substring(1))+str.charAt(0);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=sc.nextLine();
        System.out.println("The reversed string is "+stringReverse(str));
    }
    /*Call Stack builds like this:

stringReverse("abc")
  └── stringReverse("bc")
        └── stringReverse("c")
              └── return "c"   ← base case hit

Then it resolves like this:

        ← "c" + "b" = "cb"
  ← "cb" + "a" = "cba"
 */
}
