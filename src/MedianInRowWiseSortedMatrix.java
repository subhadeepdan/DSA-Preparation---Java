//https://practice.geeksforgeeks.org/problems/median-in-a-row-wise-sorted-matrix1527/1
public class MedianInRowWiseSortedMatrix {
    static int median(int mat[][], int r, int c) {
        // code here
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int row=0;row<r;row++){
            if(mat[row][0]<min){
                min = mat[row][0];
            }
            if(mat[row][c-1]>max){
                max = mat[row][c-1];
            }
        }

        int desiredCount = (r*c)/2;

        while(min<=max){
            int mid = min + (max-min)/2;
            if(count(mat,r,c,mid)>desiredCount){
                max = mid - 1;
            }
            else{
                min = mid + 1;
            }
        }
        return max;
    }

    static int count(int[][] mat, int r, int c, int mid){
        int count=0;
        for(int row=0;row<r;row++){
            for(int col=0;col<c;col++){
                if(mat[row][col]<mid){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[][] arr = {{1,3,5},{2,6,9},{3,6,9}};
        System.out.println(median(arr,3,3));
    }
}
