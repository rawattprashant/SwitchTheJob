import java.util.Scanner;

public class MaxSumSubarrayOfSizeK {

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size : ");
        int N = sc.nextInt();
        System.out.println("Enter window size : ");
        int K = sc.nextInt();
        System.out.println("Enter array's element : ");
        int[] arr = new int[N];
        for(int i = 0 ; i < N;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("The max Sum of "+K+"-sized sub-array is : " + getMaxSumSubArray(arr, K));
    }

    private static int getMaxSumSubArray(int[] arr, int k) {

        int start = 0 ;
        int end = 0 ;
        int sum = 0 ;
        int maxSum = 0;
        while(end < arr.length){
            sum += arr[end];
            if((end-start+1 ) < k){
                end++;
            } else if ((end-start+1) == k) {
                maxSum = Math.max(maxSum, sum);
                sum = sum - arr[start];
                start++;
                end++;
            }
        }
        return maxSum;
    }
}
