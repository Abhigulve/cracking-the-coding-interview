package linkedlist;

/**
 * @author Abhijeet Gulve
 */
public class MockData {

    public static Node getLinkedList() {
        LinkList linkList = new LinkList();
        linkList.insert(10);
        linkList.insert(19);
        linkList.insert(143);
        linkList.insert(18);
        return linkList.getlinkedList();
    }

    public static Node getDuplicateLinkedList() {
        LinkList linkList = new LinkList();
        linkList.insert(1);
        linkList.insert(1);
        linkList.insert(1);
        linkList.insert(2);
        linkList.insert(2);
        linkList.insert(3);
        return linkList.getlinkedList();
    }
}
