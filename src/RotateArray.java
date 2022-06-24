class RotateArray {
    public static int[] rotate(int[] nums, int k) {

        //if k>nums.length, index=k%nums.length

        int[] result = new int[nums.length];

        for(int i=0;i<nums.length;i++){
            int index = k+i;
            if(index>=nums.length){
                index = index%nums.length;
            }

            result[index]=nums[i];
        }

        return result;

    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7};

        for(int num :  rotate(arr, 3)){
            System.out.print(num+" ");
        }
    }
}