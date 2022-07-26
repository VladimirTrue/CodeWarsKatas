package fun_with_lists;

public class Length {

    static int length(Node head) {
        if (head == null) return 0;
        int count = 1;
        if (head.next != null) {
                count += length(head.next);
        }
        return count;
    }

}
