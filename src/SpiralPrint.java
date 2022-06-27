import java.util.ArrayList;
import java.util.List;

public class SpiralPrint {
    public static List<Integer> spiralOrder(int[][] matrix) {
        int rowCount = matrix.length;
        int colCount = matrix[0].length;
        int total = rowCount*colCount;
        int count=0;
        List<Integer> result = new ArrayList<>();

        int startingRow=0;
        int startingCol=0;
        int endingRow = rowCount-1;
        int endingCol = colCount-1;

        while(count<total){
            //Print starting row
            for(int i=startingCol;count<total && i<=endingCol;i++){
                result.add(matrix[startingRow][i]);
                count++;
            }
            startingRow++;

            //Print ending column
            for(int i=startingRow;count<total && i<=endingRow;i++){
                result.add(matrix[i][endingCol]);
                count++;
            }
            endingCol--;

            //Print ending row
            for(int i=endingCol;count<total && i>=startingCol;i--){
                result.add(matrix[endingRow][i]);
                count++;
            }
            endingRow--;

            //Print starting col
            for(int i=endingRow;count<total && i>=startingRow;i--){
                result.add(matrix[i][startingCol]);
                count++;
            }
            startingCol++;

        }
        return result;
    }

    public static void main(String[] args){
        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        List<Integer> result = spiralOrder(arr);
        for(int num : result){
            System.out.print(num+" ");
        }
    }
}
