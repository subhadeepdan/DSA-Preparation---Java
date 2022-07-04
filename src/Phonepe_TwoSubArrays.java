//You are given an array A of N integers.
//You have to choose exactly two non-intersecting subarrays (can be empty)
//such that the total sum of the elements of the two subarrays is maximum
public class Phonepe_TwoSubArrays {
    static long solve(int N, int[] A){
        // Write your code here
        long result = 0;
        for(int i=0;i<N-1;i++){
            //For ignoring negative values
            long maxLeft = Math.max(0, maxSubArrayLeft(A, i));
            long maxRight = Math.max(0, maxSubArrayRight(A, i+1));

            //Find max of sum of subarrays from start and end
            result = Math.max(result, maxLeft + maxRight);
        }
        return result;

    }

    //Apply Kadane's algo from start of the array
    static long maxSubArrayLeft(int[] A, int n){
        long currSum=0, maxSub=A[0];
        for(int i=0;i<=n;i++){
            if(currSum<0){
                currSum=0;
            }
            currSum+=A[i];
            maxSub=Math.max(maxSub, currSum);
        }
        return maxSub;
    }

    //Apply Kadane's algo from end of the array
    static long maxSubArrayRight(int[] A, int n){
        long currSum=0, maxSub=A[A.length-1];
        for(int i=A.length-1;i>=n;i--){
            if(currSum<0){
                currSum=0;
            }
            currSum+=A[i];
            maxSub=Math.max(maxSub, currSum);
        }
        return maxSub;
    }

    public static void main(String[] args){
        int[] arr = {-4,-5,2};
        System.out.println(solve(3, arr));
    }
}
