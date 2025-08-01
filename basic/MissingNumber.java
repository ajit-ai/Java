package basic;


class MissingNumber 
{

    public static void main(String[] args) {

        int[] arr = {1,2,3,5};
        int n = 5;
        System.out.println("Missing number: " + missingNumber(n, arr));
    }


    public static int missingNumber(int n, int arr[]) {

        // Create hash array of size n+1
        int hash[] = new int[n+1];
        //store frequencies of elements
        for(int i=0; i<n-1; i++) {

            hash[arr[i]]++;

        }
        //Find the missing number 
        for(int i=1;i<=n;i++) {
            if(hash[i] == 0) {
                return i;
            }
        }

        return -1;

    }
}
