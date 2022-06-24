import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class kthLargest {

    public static void main(String[] args){
        int[] arr = {3,2,1,5,6,4};

        List<Integer> al = new ArrayList<>();
        al.add(3);
        al.add(2);
        al.add(1);
        al.add(5);
        al.add(6);
        al.add(4);

        //System.out.print(kthLargest(arr,2));

        System.out.print(findKthLargest(al,2));
    }

    public static int kthLargest(int[] arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int num : arr){
            pq.add(num);
        }

        int l = k-1;
        while(l>0){
            pq.remove();
            l--;
        }
        return pq.peek();
    }

    public static int findKthLargest(List<Integer> ints, int k)
    {
        // base case
        if (ints == null || ints.size() < k) {
            System.exit(-1);
        }

        // create a min-heap using the `PriorityQueue` class and insert
        // the first `k` array elements into the heap
        PriorityQueue<Integer> pq = new PriorityQueue<>(ints.subList(0, k));

        // do for remaining array elements
        for (int i = k; i < ints.size(); i++)
        {
            // if the current element is more than the root of the heap
            if (ints.get(i) > pq.peek())
            {
                // replace root with the current element
                pq.poll();
                pq.add(ints.get(i));
            }
        }

        // return the root of min-heap
        return pq.peek();
    }
}
