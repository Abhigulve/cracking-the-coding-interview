import linkedlist.ListList;
import linkedlist.LinkListMergeSort;
import linkedlist.MockData;
import linkedlist.Node;
import org.junit.jupiter.api.Test;

/**
 * @author Abhijeet Gulve
 */
public class LinkListMergeSortTest {
    @Test
    public void partitionTest() {

        Node linkedList = MockData.getLinkedList();
        ListList.printList(LinkListMergeSort.mergeSort(linkedList));

//        for (int i = 0; i < 2; i++) {
//            Node[] partition = LinkListMergeSort.partition(linkedList);
//            ListList.printList(partition[0]);
//            System.out.println();
//            ListList.printList(partition[1]);
//            System.out.println();
//        }
    }
}
