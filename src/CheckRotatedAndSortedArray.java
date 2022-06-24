public class CheckRotatedAndSortedArray {

    public static void main(String[] args){
        int[] arr = {2,4,1,3};
        System.out.print(check(arr));
    }

    public static boolean check(int[] arr) {
        int x = Integer.MIN_VALUE;
        boolean isSorted = true;
        if(arr.length==1){
            return true;
        }
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                x = i+1;
                isSorted = false;
                break;
            }
        }
        if(isSorted){
            return true;
        }

        if(x!=Integer.MIN_VALUE && arr[x-1]>arr[arr.length-1]){
            for(int i=x;i<arr.length-1;i++){
                if(arr[i]>arr[i+1]){
                    return false;
                }
            }
            return true;
        }
        return false;
    }

}
