import java.util.Scanner;

public class calculateStringLength {
    public static int strlength(String str){
        if(str.isEmpty()){
            return 0;
        }
        else{
            return 1+strlength(str.substring(1));
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str=sc.nextLine();
        System.out.println(strlength(str));
    }
    
}
