public class QuickSort {
    static void quickSort(int[] arr, int s, int e){
        if(s>=e){
            return;
        }
        int p = partition(arr, s, e);
        quickSort(arr, s, p-1);
        quickSort(arr, p+1, e);
    }

    static int partition(int[] arr, int s, int e){
        //Find pivot
        int pivot = arr[s];
        int count = 0;
        //Count no. of elements in array less than pivot
        for(int i=s+1;i<=e;i++){
            if(arr[i]<pivot){
                count++;
            }
        }
        //Find correct position of pivot
        int pivotIndex = s + count;

        //Swap pivot and s
        swap(arr,pivotIndex,s);

        //Implement the condition left side < pivot && right side > pivot
        int i=s,j=e;
        while(i<pivotIndex && j>pivotIndex){
            while(arr[i]<=pivot){
                i++;
            }
            while(arr[j]>pivot){
                j--;
            }
            if(i<pivotIndex && j>pivotIndex){
                swap(arr,i++,j--);
            }
        }

        return pivotIndex;
    }

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args){
        int[] arr = {2,5,1,53,21};
        quickSort(arr,0,arr.length-1);
        for(int num : arr){
            System.out.print(num+" ");
        }
    }
}
