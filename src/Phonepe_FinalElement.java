import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Q queries
//Each query is of type "X L R". Add X to every array element from index L to R
//After executing all Q queries and modifying the array, perform following task :
//Remove two random elements Ai and Aj from the array and add their sum to the array. This will reduce size of array by 1
//Repeat above step until there is only 1 element left in the array
//Determine the min last element that we can get after repeating the above operations
public class Phonepe_FinalElement {
    static long solve(int N, int[] A, int Q, int[][] queries){
        performQuery(A,Q,queries);
        List<Long> arr = new ArrayList<>();
        for(int num : A){
            arr.add((long) num);
        }
        findMinRecursively(arr);
        return arr.get(0);
    }

    static void performQuery(int[] A, int Q, int[][] queries){
        for(int i=0;i<Q;i++){
            int num = queries[i][0];
            int leftIndex=queries[i][1]-1;
            int rightIndex=queries[i][2]-1;

            for(int j=leftIndex;j<=rightIndex;j++){
                A[j]+=num;
            }
        }
    }

    static List<Long> findMinRecursively(List<Long> arr){
        if(arr.size()<=1){
            return arr;
        }
        else{
            Collections.sort(arr);
            for(int i=0;i<arr.size()-1;i++){
                long sum = arr.get(i) + arr.get(i+1);
                arr.add(sum);
                arr.remove(i);
                arr.remove(i);
            }
        }
        return findMinRecursively(arr);
    }

    public static void main(String[] args){
        int[] A = {1,4,3,2,4};
        int Q = 2;
        int[][] queries = {{5,1,2},{-5,1,3}};
        System.out.println(solve(A.length, A, Q, queries));
    }
}
