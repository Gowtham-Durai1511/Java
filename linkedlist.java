 import java.util.*;
class LinkedList {
    // head of list
    Node head;
    // Linked list Node
    class Node {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }

    // Function to remove duplicates from the given linked
    // list
    void removeDuplicates()
    {
        // Two references to head temp will iterate to the
        // whole Linked List prev will point towards the
        // first occurrence of every element
        Node temp = head, prev = head;

        // Traverse list till the last node
        while (temp != null) {

            // Compare values of both pointers
            if (temp.data != prev.data) {
                // if the value of prev is not equal to the
                // value of temp that means there are no
                // more occurrences of the prev data. So we
                // can set the next of prev to the temp
                // node.
                prev.next = temp;
                prev = temp;
            }
            // Set the temp to the next node
            temp = temp.next;
        }
        // This is the edge case if there are more than one
        // occurrences of the last element
        if (prev != temp)
            prev.next = null;
    }

    /* Utility functions */

    /* Inserts a new Node at front of the list. */
    public void push(int new_data)
    {
        /* 1 & 2: Allocate the Node &
                  Put in the data*/
        Node new_node = new Node(new_data);
        /* 3. Make next of new Node as head */
        new_node.next = head;
        /* 4. Move the head to point to new Node */
        head = new_node;
    }

    /* Function to print linked list */
    void printList()
    {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    /* Driver program to test above functions */
    public static void main(String args[])
    {
        LinkedList llist = new LinkedList();
        llist.push(20);
        llist.push(13);
        llist.push(13);
        llist.push(11);
        llist.push(11);
        llist.push(11);

        System.out.print("List before ");
        System.out.println("removal of duplicates");
        llist.printList();

        llist.removeDuplicates();

        System.out.println(
            "List after removal of elements");
        llist.printList();
    }
}
    

