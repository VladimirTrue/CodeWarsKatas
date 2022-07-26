package fun_with_lists;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCountIf {


    @Test
    public void basicTests() {
        Node<Integer> head = new Node<>(1);
        Node<Integer> node1 = new Node<>(2);
        Node<Integer> node2 = new Node<>(3);
        head.next = node1;
        node1.next = node2;
        assertEquals(0, CountIf.countIf(null, __ -> false));
        assertEquals(3, CountIf.countIf(head, __ -> true));
    }

//        @Test
//        public void arrayOfInts() {
//            assertEquals(2, CountIf.countIf(Helpers.listFromArray(1, 2, 3), x -> x <= 2));
//        }
}
