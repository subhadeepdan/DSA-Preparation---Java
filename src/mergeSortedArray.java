public class mergeSortedArray {
    public static void main(String[] args){
        int[] arr1 = {1,2,3,0,0,0};
        int[] arr2 = {2,5,6};
        //int[] result = merge(arr1,3,arr2,3);

        mergeInSameArray(arr1, 3, arr2, 3);

        for(int i : arr1){
            System.out.println(i);
        }

    }

    public static int[] merge(int[] arr1, int m, int[] arr2, int n ){
        int[] result = new int[n+m];

        int x=0,y=0;
        for(int i=0;i<(n+m);i++){
            if(y>=n || (x<m && arr1[x]<=arr2[y])){
                result[i]=arr1[x];
                x++;
            }
            else if(x>=m || (arr1[x]>arr2[y])){
                result[i]=arr2[y];
                y++;
            }
        }

        return result;
    }

    public static void mergeInSameArray(int[] arr1, int m, int[] arr2, int n ){
        int x=m-1,y=n-1;
        int i=arr1.length-1;
        while(x>=0 && y>=0){
            if(arr1[x]>arr2[y]){
                arr1[i--]=arr1[x--];
            }
            else{
                arr1[i--]=arr2[y--];
            }
        }

        while(x>=0){
            arr1[i--]=arr1[x--];
        }

        while(y>=0){
            arr1[i--]=arr2[y--];
        }
    }
}
