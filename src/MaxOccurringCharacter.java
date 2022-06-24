public class MaxOccurringCharacter {
    public static char getMaxOccuringChar(String str)
    {
        // Your code here
        int count[] = new int[26];
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            int pos = (int) (ch - 'a');
            count[pos]+=1;
        }

        int max = Integer.MIN_VALUE;
        int resultPos = 0;
        for(int i=0;i<count.length;i++){
            if(count[i]>max){
                max = count[i];
                resultPos = i;
            }
        }

        return (char) (resultPos + 'a');
    }

    public static void main(String[] args){
        String str = "testsample";
        System.out.print(getMaxOccuringChar(str));
    }
}
