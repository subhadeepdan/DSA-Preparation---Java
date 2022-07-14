import java.util.Arrays;

//https://practice.geeksforgeeks.org/problems/inversion-of-array-1587115620
public class CountInversion {
    static long mergeSortAndCount(long arr[], int s, int e){
        long count = 0;
        if(s<e){
            int mid = s + (e-s)/2;
            count+=mergeSortAndCount(arr,s,mid);
            count+=mergeSortAndCount(arr,mid+1,e);
            count+=mergeAndCount(arr,s,e);
        }
        return count;
    }

    static long mergeAndCount(long[] arr, int s, int e){
        int mid = s + (e-s)/2;
        long[] first = Arrays.copyOfRange(arr,s,mid+1);
        long[] second = Arrays.copyOfRange(arr,mid+1,e+1);

        int index1=0,index2=0,mainArrayIndex=s;
        long count = 0;
        while(index1<first.length && index2<second.length){
            if(first[index1]<=second[index2]){
                arr[mainArrayIndex++]=first[index1++];
            }
            else{
                arr[mainArrayIndex++]=second[index2++];
                count+=first.length-index1;
            }
        }
        while(index1<first.length){
            arr[mainArrayIndex++]=first[index1++];
        }
        while(index2<second.length){
            arr[mainArrayIndex++]=second[index2++];
        }
        return count;
    }

    public static void main(String[] args){
        long[] arr = {2, 4, 1, 3, 5};
        System.out.println(mergeSortAndCount(arr,0,arr.length-1));
    }
}
