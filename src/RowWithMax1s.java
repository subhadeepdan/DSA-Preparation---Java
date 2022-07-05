//https://practice.geeksforgeeks.org/problems/row-with-max-1s0023/1
public class RowWithMax1s {
    static int rowWithMax1s(int arr[][], int n, int m) {
        // code here
        int maxCount=0, resultIndex=-1;
        for(int row=0;row<n;row++){
            int count = 0;
            if(arr[row][0]==1){
                count+=m;
            }
            else{
                int col = 1;
                while(col<m && arr[row][col]!=1){
                    col++;
                }
                count+=(m-col);
            }
            if(count>maxCount){
                maxCount=count;
                resultIndex=row;
            }
        }
        return resultIndex;
    }

    public static void main(String[] args) {
        int[][] arr = {{0, 1, 1, 1},
                {0, 0, 1, 1},
                {1, 1, 1, 1},
                {0, 0, 0, 0}};
        System.out.println(rowWithMax1s(arr,3,3));
    }
}
