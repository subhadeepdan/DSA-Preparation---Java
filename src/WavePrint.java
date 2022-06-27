public class WavePrint {
    //Time Complexity : O(nRows*MCols)
    public static int[] wavePrint(int[][] arr, int nRows, int mCols) {
        // Write your code here.
        int[] result = new int[nRows*mCols];
        int index=0;
        for(int i=0;i<mCols;i++){
            if(i % 2 != 0){
                for(int j=nRows-1;j>=0;j--){
                    result[index]=arr[j][i];
                    index++;
                }
            }
            else{
                for(int j=0;j<nRows;j++){
                    result[index]=arr[j][i];
                    index++;
                }
            }
        }

        return result;
    }

    public static void main(String[] args){
        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int[] result = wavePrint(arr,3,4);
        for(int num : result){
            System.out.print(num+" ");
        }
    }
}
