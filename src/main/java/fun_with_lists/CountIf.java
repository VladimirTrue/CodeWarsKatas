package fun_with_lists;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CountIf {

    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        Node<Integer> head = new Node<>(1);
        Node<Integer> node1 = new Node<>(2);
        Node<Integer> node2 = new Node<>(3);
        head.next = node1;
        node1.next = node2;

        System.out.println(countIf(head, x -> x >= 2));

    }

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
