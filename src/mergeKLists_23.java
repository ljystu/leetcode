import java.util.PriorityQueue;

public class mergeKLists_23 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> queue = new PriorityQueue<>((a,b)->a.val-b.val);
        for (ListNode node : lists) {
            if(node!=null)
                queue.add(node);
        }
        ListNode dummy = new ListNode(0);
        ListNode current=dummy ;


        while (queue.size() != 0) {
            ListNode temp= queue.poll();
            current.next =temp;
            current = current.next;
            if(temp.next!=null)
                queue.add(temp.next);
        }
        return dummy.next;
    }


}

