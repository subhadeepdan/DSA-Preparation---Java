import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacter {
    public static int lengthOfLongestSubstring(String s) {
        int maxCount = 0;
        Set<Character> window = new HashSet<>();
        int left=0,right=0;
        while(left<s.length() && right<s.length()){
            if(!window.add(s.charAt(right))){
                window.remove(s.charAt(left));
                left++;
            }
            else{
                right++;
            }
            maxCount = Math.max(maxCount, window.size());
        }
        return maxCount;
    }

    public static void main(String[] args){
        String str = "abcabcba";
        int l = lengthOfLongestSubstring(str);
        System.out.println(l);
    }
}
