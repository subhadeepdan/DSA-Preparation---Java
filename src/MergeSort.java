public class MergeSort {
    public static void main(String[] args){
        int[] arr = {2,5,1,53,21};
        mergeSort(arr,0,arr.length-1);
        for(int num : arr){
            System.out.print(num+" ");
        }
    }

    public static void mergeSort(int[] arr, int s, int e){
        if(s>=e){
            return;
        }

        int mid = s + (e-s)/2;

        mergeSort(arr, s, mid);

        mergeSort(arr, mid+1, e);

        merge(arr, s, e);
    }

    public static void merge(int[] arr, int s, int e){
        int mid = s + (e-s)/2;

        int len1 = mid - s + 1;
        int len2 = e - mid;
        int[] first = new int[len1];
        int[] second = new int[len2];

        int mainArrayIndex = s;
        for(int i=0;i<len1;i++){
            first[i] = arr[mainArrayIndex++];
        }

        mainArrayIndex = mid+1;
        for(int i=0;i<len2;i++){
            second[i] = arr[mainArrayIndex++];
        }

        //Merge two sorted arrays
        int index1=0;
        int index2=0;
        mainArrayIndex = s;
        while(index1<len1 && index2<len2){
            if(first[index1]<second[index2]){
                arr[mainArrayIndex++]=first[index1++];
            }
            else{
                arr[mainArrayIndex++]=second[index2++];
            }
        }

        while(index1<len1){
            arr[mainArrayIndex++]=first[index1++];
        }

        while(index2<len2){
            arr[mainArrayIndex++]=second[index2++];
        }

    }
}
