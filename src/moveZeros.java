public class moveZeros {
    public static void main(String[] args){
        int[] arr = {0,1,0,3,12};
        move(arr);
        for(int i : arr){
            System.out.println(i);
        }
    }

    public static void move(int[] nums){
        int i=0;
        while(i<nums.length-1){
            if(nums[i]==0){
                int temp = nums[i];
                nums[i]=nums[i+1];
                nums[i+1]=temp;
            }
            else{
                i++;
            }
        }
    }
}
