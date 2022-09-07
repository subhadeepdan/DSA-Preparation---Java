public class ReverseListInKGroups {
    public static ListNode reverseKGroup(ListNode head, int k) {
        int len = 0;
        ListNode temp = head;
        //Count length of list
        while(temp!=null){
            len++;
            temp = temp.next;
        }
        //If list contains 0 or 1 elements or length of list is not in multiple of k, then return head (don't reverse it)
        if(head==null || head.next==null || len<k){
            return head;
        }

        ListNode prev=null, curr=head, next=null;
        int groupSize = k;
        while(curr!=null && groupSize-- > 0){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        head.next = reverseKGroup(curr,k);
        return prev;
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

  public static void main(String[] args){
        ListNode head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);
        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        ListNode result = reverseKGroup(head, 3);

        while(result!=null){
            System.out.println(result.val);
            result = result.next;
        }
  }
 }
