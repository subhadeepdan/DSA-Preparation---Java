import java.util.ArrayList;
import java.util.List;

public class DuplicateInArray {
    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();
        for(int num : nums){
            int index = num % nums.length;
            nums[index]+=(nums.length);
        }

        for(int i=0;i<nums.length;i++){
            if(nums[i]/nums.length>1){
                result.add(i);
            }
        }

        return result;
    }

    public static void main(String[] args){
        int[] nums = {4,3,2,7,7,2,3,1};
        System.out.print(findDuplicates(nums));
    }
}
