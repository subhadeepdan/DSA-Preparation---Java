import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Return List of Majority Elements which occurs more than n/3 times in the array
public class MajorityElement2 {
    public static List<Integer> majorityElementUsingHashMap(int[] nums) {
        Map<Integer, Integer> hm = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        for(int num : nums){
            hm.put(num, hm.getOrDefault(num,0)+1);
        }

        for(int key : hm.keySet()){
            if(hm.get(key)>(nums.length/3)){
                result.add(key);
            }
        }

        return result;
    }

    //Moore Voting Algorithm
    public static List<Integer> majorityElement(int[] nums) {
        int count1=0, count2=0;
        Integer c1=null, c2=null;

        for(int num : nums){
            if(c1!=null && c1==num){
                count1++;
            }
            else if(c2!=null && c2==num){
                count2++;
            }
            else if(count1==0){
                c1=num;
                count1++;
            }
            else if(count2==0){
                c2=num;
                count2++;
            }
            else{
                count1--;
                count2--;
            }
        }

        count1=0;
        count2=0;
        for(int num : nums){
            if(c1 == num){
                count1++;
            }

            if(c2!=null && c2==num){
                count2++;
            }
        }

        List<Integer> result = new ArrayList<>();
        if(count1>(nums.length/3)){
            result.add(c1);
        }
        if(count2>(nums.length/3)){
            result.add(c2);
        }

        return result;
    }

    public static void main(String[] args){
        int[] arr = {1,2};
        System.out.println(majorityElementUsingHashMap(arr));
        System.out.println(majorityElement(arr));
    }
}
