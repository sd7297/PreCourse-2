// Time Complexity : printMiddle function traverses through the array once - O(N)
// Space Complexity : O(1) - no extra space used
// Did this code successfully run on Leetcode : N/A
// Any problem you faced while coding this :  intially, I was only checking for fast_pointer.naxt != null in the while loop
//- which lead to a null pointer exception because when the fast_pointer becomes null - I cannot access it's next  

class LinkedList 
{ 
    Node head; // head of linked list 
  
    /* Linked list node */
    class Node 
    { 
        int data; 
        Node next; 
        Node(int d) 
        { 
            data = d; 
            next = null; 
        } 
    } 
  
    /* Function to print middle of linked list */
   //Complete this function
    void printMiddle() 
    { 
        //Write your code here
        Node fast_pointer = head;
        Node slow_pointer = head;
        if(head!= null && head.next == null)
        {
            //only one element 
            System.out.println("The Middle element is: " + head.data);
        }
        else
        {
            while(fast_pointer!= null && fast_pointer.next!= null)
            {
                fast_pointer = fast_pointer.next.next;
                slow_pointer = slow_pointer.next;
            }

        System.out.println("The Middle element is: " + slow_pointer.data);
	    //Implement using Fast and slow pointers
        }
    } 
  
    public void push(int new_data) 
    { 
        Node new_node = new Node(new_data); 
        new_node.next = head; 
        head = new_node; 
    } 

    public void printList() 
    { 
        Node tnode = head; 
        while (tnode != null) 
        { 
            System.out.print(tnode.data+"->"); 
            tnode = tnode.next; 
        } 
        System.out.println("NULL"); 
    } 
  
    public static void main(String [] args) 
    { 
        LinkedList llist = new LinkedList(); 
        for (int i=15; i>0; --i) 
        { 
            llist.push(i); 
            llist.printList(); 
            llist.printMiddle(); 
        } 

      
    } 
} 