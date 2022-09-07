public class LongestPalindromicSubstring {
    public static String longestPalindrome(String s) {
        if(s.length()<=1){
            return s;
        }
        int length = s.length();
        int maxCount = 1;
        int start=0, end=0;
        //Odd Palindromes
        for(int i=0;i<length-1;i++){
            int l=i,r=i;
            while(l>=0 && r<length && s.charAt(l)==s.charAt(r)){
                l--;
                r++;
            }
            int currCount = r-l-1;
            if(currCount > maxCount){
                maxCount = currCount;
                start = l+1;
                end = r-1;
            }
        }
        //Even palindromes
        for(int i=0;i<length-1;i++){
            int l=i,r=i+1;
            while(l>=0 && r<length && s.charAt(l)==s.charAt(r)){
                l--;
                r++;
            }
            int currCount = r-l-1;
            if(currCount > maxCount){
                maxCount = currCount;
                start = l+1;
                end = r-1;
            }
        }

        return s.substring(start,end+1);
    }

    public static void main(String[] args){
        String s = "abb";
        String result = longestPalindrome(s);
        System.out.println(result);
    }
}
