//Return Majority Element which occurs more than n/2 times in the array
public class MajorityElement {
    public static int majorityElement(int[] nums) {
        int count=1, candidateIndex=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[candidateIndex]){
                count++;
            }
            else{
                count--;
            }
            if(count==0){
                candidateIndex = i;
                count++;
            }
        }

        count=0;
        for (int num : nums) {
            if (num == nums[candidateIndex]) {
                count++;
            }
        }

        if(count>(nums.length/2)){
            return nums[candidateIndex];
        }

        return -1;
    }

    public static void main(String[] args){
        int[] arr = {2,2,1,1,1,2,2};
        System.out.print(majorityElement(arr));
    }
}
