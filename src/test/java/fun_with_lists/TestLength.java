package fun_with_lists;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestLength {

    @Test
    public void basicTests() {
        Node<Integer> head = new Node<>(1);
        Node<Integer> node1 = new Node<>(2);
        Node<Integer> node2 = new Node<>(3);
        head.next = node1;
        node1.next = node2;
        assertEquals(0, Length.length(null));
        assertEquals(3, Length.length(head));
    }
}
