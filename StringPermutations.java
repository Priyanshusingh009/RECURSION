public class StringPermutations {
    static int count = 0;
    public static void permute(String str, String prefix) {
        
        if (str.length() == 0) {
            System.out.println(prefix);
            count++;
            return;
        }

        // choose each character one by one
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); // current char
            String remaining = str.substring(0, i) + str.substring(i + 1); // rest of string
            permute(remaining, prefix + ch); 
        }
    }

    public static void main(String[] args) {
        String input = "ABC";
        System.out.println("All permutations of " + input + " are:");
        permute(input, "");
        System.out.println("The total no.s of permutaions are : "+count);
    }
    
}
