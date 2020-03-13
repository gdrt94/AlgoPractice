package com.gdrt.linkedList.multilevel;

import com.gdrt.linkedList.NodeWithRandomNode;

public class DeepCopy {
    public NodeWithRandomNode copyRandomList(NodeWithRandomNode head) {

        if (head == null)
            return null;

        NodeWithRandomNode current = head;
        while(current != null) {

            NodeWithRandomNode copy = new NodeWithRandomNode(current.val);
            copy.next = current.next;
            current.next = copy;
            current = copy.next;
        }

        current = head;
        while (current != null) {

            if (current.random != null)
                current.next.random = current.random.next;
            current = current.next.next;
        }

        current = head;
        NodeWithRandomNode copy = head.next;
        NodeWithRandomNode currentCopy = copy;
        while (current != null) {

            NodeWithRandomNode nextOrig = currentCopy.next;
            NodeWithRandomNode nextCopy = null;
            if (nextOrig != null)
                nextCopy = nextOrig.next;
            current.next = nextOrig;
            currentCopy.next = nextCopy;

            current = nextOrig;
            currentCopy = nextCopy;
        }
        return copy;
    }
}















