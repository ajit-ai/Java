package basic;

public class MissingNumber2 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 5, 6 };
        System.out.println(missingNumber2(arr));
        
    }

    public static int missingNumber2(int[] arr) {
        int n = arr.length;
        int sum1 = (n*(n+1))/2;
        int sum2 =0;

        for(int i=0;i<n;i++) {
            sum2 +=arr[i];
            return sum1 - sum2;
        }
        return sum2;
    }
    
}
