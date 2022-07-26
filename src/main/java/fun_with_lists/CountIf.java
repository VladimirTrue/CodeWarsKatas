package fun_with_lists;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CountIf {

    static <T> int countIf(Node<T> head, Predicate<T> p) {
        if (head == null) return 0;
        List<T> list = new ArrayList<>();
        Node<T> currNode = head;
        while (currNode.next != null) {
            if (list.isEmpty()) {
                list.add(currNode.data);
                currNode = currNode.next;
            } else {
                list.add(currNode.data);
                currNode = currNode.next;
                if (currNode.next == null) {
                    list.add(currNode.data);
                }
            }
        }

        return list.stream().filter(p).collect(Collectors.toList()).size();
    }
}
