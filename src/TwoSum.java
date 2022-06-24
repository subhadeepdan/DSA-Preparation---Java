import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] getTwoSum(int[] arr, int target){
        Map<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int complement = target - arr[i];
            if(hm.containsKey(complement)){
                return new int[] {hm.get(complement), i};
            }
            hm.put(arr[i], i);
        }

        throw new IllegalStateException("No Two Sum found");
    }

    public static void main(String[] args){
        int[] arr = {2,7,11,15};
        int[] result = getTwoSum(arr,9);
        for(int i : result){
            System.out.print(i+" ");
        }
    }
}
