

public class swapNodes_1721 {

    public static class ListNode {
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

    public ListNode swapNodes(ListNode head, int k) {

//        List<ListNode> list = new ArrayList<>();
//        ListNode begin = head;
//        do {
//            list.add(begin);
//            begin = begin.next;
//        } while (begin != null);
//        int temp = list.get(k - 1).val;
//        list.get(k - 1).val = list.get(list.size() - k).val;
//        list.get(list.size() - k).val = temp;
//        return head;


        //记录两个节点的前序节点
        ListNode preNode1 = new ListNode(0, head);
        ListNode preNode2 = head;
        // 模拟指针，用来遍历链表
        ListNode cur = head;
        // 用来定位正数第k个节点
        ListNode first = head;
        // 用来定位倒数第k个节点
        ListNode last = head;
        // 用于节点的计数，和节点值的交换
        int count = 1;
        while (cur.next != null) {
            // 找到正数第k个节点
            if (count < k) {
                preNode1 = first;
                first = first.next;
                // 找到倒数第k个节点
            } else {
                preNode2 = last;
                last = last.next;
            }
            count++;
            cur = cur.next;
        }
        if (first.next == last) {
            ListNode temp = last.next;
            last.next = first;
            first.next = temp;
            preNode1.next = last;
            if (k == 1) {
                head = last;
            }
            return head;
        } else if (first == last) {
            return head;
        } else {
            ListNode temp = last.next;
            last.next = first.next;
            first.next = temp;
            preNode2.next = first;
            preNode1.next = last;

            return head;
        }
    }

    public static void main(String[] args) {
        ListNode l0 = new ListNode(1);
        ListNode l1 = new ListNode(2);
        l0.next = l1;
        swapNodes_1721 swapNodes_1721 = new swapNodes_1721();
        swapNodes_1721.swapNodes(l0, 1);
    }

}

