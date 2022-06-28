public class RotateMatrix {
    public static int[][] rotateUsingExtraSpace(int[][] matrix) {
        //Starting row becomes last column
        //Ending row becomes starting column
        int rowSize = matrix.length;
        int colSize = matrix[0].length;
        int[][] result = new int[rowSize][colSize];

        int startingRow = 0;
        int endingRow= rowSize - 1;

        int colIndex = colSize - 1;

        while(startingRow <= endingRow){
            for(int i=0;i<colSize;i++){
                result[i][colIndex] = matrix[startingRow][i];
            }
            startingRow++;
            colIndex--;
        }

        return result;
    }

    public static void transpose(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr[0].length;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }

    public static void reverse(int[][] arr){
        for(int i=0;i<arr.length;i++){
            int start = 0, end = arr[0].length-1;
            while(start<end){
                int temp = arr[i][start];
                arr[i][start] = arr[i][end];
                arr[i][end] = temp;
                start++;
                end--;
            }
        }
    }

    public static void main(String[] args){
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        for(int[] nums : rotateUsingExtraSpace(arr)){
            for(int num : nums ){
                System.out.print(num+" ");
            }
            System.out.println();
        }
        System.out.println();

        //Rotate 90 degree without using extra space
        //Find transpose of the matrix and then reverse it
        // 1 2 3
        // 4 5 6
        // 7 8 9

        // Transpose : (Rows become column, column becomes row
        // 1 4 7
        // 2 5 8
        // 3 6 9

        //Reverse :
        // 7 4 1
        // 8 5 2
        // 9 6 3
        transpose(arr);
        reverse(arr);
        for(int[] nums : arr){
            for(int num : nums ){
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }
}
