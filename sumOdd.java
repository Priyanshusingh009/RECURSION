public class sumOdd {
    public static int oddsum(int[] arr,int index){
        int sum=0;
        if(index==arr.length){
            return 0;
        }
        if(arr[index]%2!=0){
            return arr[index] + oddsum(arr, index + 1);
        }
        else{
            return oddsum(arr, index+1);
        }
        
    }
    public static void main(String[] args) {
        int[] arr={5,6,3,9,4};
        System.out.println(oddsum(arr, 0));
    }
    
}
