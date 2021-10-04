import java.util.HashMap;
import java.util.Map;

public class LoopInspector {


    //for compiling project NOT FOR TEST
    public class Node {
        private Node getNext(){
            return new Node();
        }
    }

    public int loopSize(Node node) {
        Map<Node, Integer> linkedMap = new HashMap<>();
        Node currentNode = node;
        int index = 0;
        while (true) {
            if (!linkedMap.containsKey(currentNode)) {
                linkedMap.put(currentNode, index);
                index++;
                currentNode = currentNode.getNext();
            } else
                break;
        }
        return linkedMap.size() - linkedMap.get(currentNode);
    }
}

/*
You are given a node that is the beginning of a linked list. This list always contains a tail and a loop. Your objective is to determine the length of the loop.

For example in the following picture the tail's size is 3 and the loop size is 12:


// Use the `getNext()` method to get the following node.
node.getNext() ssssss ыыфафыафаыasf
*/
