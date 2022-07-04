//Find kth smallest element in 2D matrix
//The matrix is row-wise as well as col-wise sorted
public class KthSmallestInMatrix {
    public static int kthSmallest(int[][]mat,int k)
    {
        //code here.
        int row = mat.length;
        int col = mat[0].length;
        //Smallest element in array
        int s = mat[0][0];
        //Largest element in array
        int e = mat[row-1][col-1];
        while(s<=e){
            int mid = s + (e-s)/2;
            if(count(mat,mid)<k){
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        return e;
    }

    static int count(int[][] mat, int element){
        int count = 0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]<element){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[][] arr = {{10, 20, 30, 40},{15, 25, 35, 45},{24, 29, 37, 48},{32, 33, 39, 50}};
        System.out.println(kthSmallest(arr,7));
    }
}
