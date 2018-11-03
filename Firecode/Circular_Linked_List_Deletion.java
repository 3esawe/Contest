package Firecode;

public class Circular_Linked_List_Deletion {
    public static void main(String[] args) {
        Circular_Linked_List_Deletion circular_linked_list_deletion = new Circular_Linked_List_Deletion(1);
        circular_linked_list_deletion.next = new Circular_Linked_List_Deletion(2);
        circular_linked_list_deletion.next.next = new Circular_Linked_List_Deletion(3);
        circular_linked_list_deletion.next.next.next = new Circular_Linked_List_Deletion(4);
        circular_linked_list_deletion.next.next.next.next = circular_linked_list_deletion;
        circular_linked_list_deletion.deleteAtTail(circular_linked_list_deletion);
        circular_linked_list_deletion.deleteAtHead(circular_linked_list_deletion);
    }
    int data;
    Circular_Linked_List_Deletion next;
    public Circular_Linked_List_Deletion(int data) { this.data = data; }

    // java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

    public Circular_Linked_List_Deletion deleteAtTail(Circular_Linked_List_Deletion head) {
        Circular_Linked_List_Deletion temp = head;
        while (true){
            temp = temp.next;

            if (temp.next.next == head){
                temp.next = head;

                break;
            }

        }

        return head;

    }
    public  Circular_Linked_List_Deletion deleteAtHead(Circular_Linked_List_Deletion head) {



            if (head == null)
                return null;
        Circular_Linked_List_Deletion curr = head;
            // Traverse to tail
            while(curr.next != head) {
                curr = curr.next;
            }
            curr.next = head.next;
            head.next = null;
            head = curr.next;
            return head;
    }



}
