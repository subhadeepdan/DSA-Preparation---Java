import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortAMatrix {
    static void sortMatrix(int N, int[][] Mat) {
        // code here
        List<Integer> arr = new ArrayList<>();
        for(int row=0;row<N;row++){
            for(int col=0;col<N;col++){
                arr.add(Mat[row][col]);
            }
        }
        Collections.sort(arr);
        int index=0;
        for(int row=0;row<N;row++){
            for(int col=0;col<N;col++){
                Mat[row][col]=arr.get(index++);
            }
        }

    }

    public static void main(String[] args) {
        int[][] arr = {{1,3,5},{2,6,9},{3,6,9}};
        sortMatrix(3, arr);
        for(int[] row : arr){
            for(int num : row){
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }
}
