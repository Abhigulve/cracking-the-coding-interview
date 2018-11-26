package linkedlist;

/**
 * @author Abhijeet Gulve
 */
public class LinkListMergeSort {

    public static Node[] partition(Node head) {

        Node slow;
        Node fast;
        Node[] partitionNode = new Node[2];
        if (head == null || head.next == null) {
            partitionNode[0] = head;
            partitionNode[1] = null;
        } else {
            slow = head;
            fast = head.next;

            while (fast != null) {
                fast = fast.next;
                if (fast != null) {
                    slow = slow.next;
                    fast = fast.next;
                }
            }
            partitionNode[0] = head;
            partitionNode[1] = slow.next;
            slow.next = null;
        }
        return partitionNode;
    }

    public static Node mergeLists(Node first, Node second) {
        Node dummy = new Node(0, null);
        Node res = dummy;
        while (true) {
            if (first == null) {
                res.next = second;
                break;
            }
            if (second == null) {
                res.next = first;
                break;
            }
            if (first.data <= second.data) {
                res.next = first;
                first = first.next;
            } else {
                res.next = second;
                second = second.next;
            }
            res = res.next;
        }
        return dummy.next;
    }


    public static Node mergeSort(Node head) {

        if (head == null || head.next == null) {
            return head;
        }
        Node[] partition = partition(head);
        Node node1 = mergeSort(partition[0]);
        Node node2 = mergeSort(partition[1]);
        return mergeLists(node1, node2);
    }
}
