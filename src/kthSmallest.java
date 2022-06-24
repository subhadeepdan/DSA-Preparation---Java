public class kthSmallest {

    public static void main(String[] args){
        int[] arr = {3,2,1,5,6,4};
        System.out.print(kthSmallest(arr,2));
    }

    public static int kthSmallest(int[] arr, int k)
    {
        //Your code here
        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            low = Math.min(low, arr[i]);
            high = Math.max(high, arr[i]);
        }

        while(low<high){
            int mid = low + (high-low)/2;

            if(count(arr,mid)<k){
                low = mid+1;
            }
            else{
                high = mid;
            }
        }

        return low;
    }

    public static int count(int[] arr, int mid){
        int count = 0;
        for(int num : arr){
            if(num<=mid){
                count++;
            }
        }

        return count;
    }
}
