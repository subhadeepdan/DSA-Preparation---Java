public class BinarySearch2DArray {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int rowCount=matrix.length;
        int colCount=matrix[0].length;
        int s = 0;
        int e = rowCount*colCount - 1;
        while(s<=e){
            int mid = s + (e-s)/2;
            int element = matrix[mid/colCount][mid%colCount];
            if(element == target){
                return true;
            }
            else if(element<target){
                s = mid + 1;
            }
            else{
                e = mid -1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(searchMatrix(arr,9));
    }
}
