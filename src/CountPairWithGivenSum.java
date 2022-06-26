import java.util.HashMap;
import java.util.Map;

//Find the number of pairs of elements in the array whose sum is equal to K
public class CountPairWithGivenSum {
    static int getPairsCount(int[] arr, int k) {
        // code here
        Map<Integer, Integer> hm = new HashMap<>();
        int pairCount=0;
        for(int num : arr){
            int complement = k - num;
            if(hm.containsKey(complement)){
                pairCount+=hm.get(complement);
            }
            hm.put(num, hm.getOrDefault(num,0)+1);
        }

        return pairCount;
    }

    public static void main(String[] args){
        int[] arr = {1,5,7,1};
        int sum = 6;
        System.out.print(getPairsCount(arr, sum));
    }
}
