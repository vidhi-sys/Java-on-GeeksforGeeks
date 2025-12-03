class Solution {
    int compare(Node head1, Node head2) {
        Node temp1 = head1;
        Node temp2 = head2;
        
        while (temp1 != null && temp2 != null) {
            // Compare current characters
            if (temp1.data > temp2.data) {
                return 1;
            } else if (temp1.data < temp2.data) {
                return -1;
            }
            
            // Move to next nodes if characters are equal
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        
        // After loop, check if one list is longer
        if (temp1 != null) {
            return 1; // list1 is longer
        } else if (temp2 != null) {
            return -1; // list2 is longer
        }
        
        return 0; // Both lists are identical
    }
}