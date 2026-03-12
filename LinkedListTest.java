//Macy Culbertson
// SD class assignment
// Linked List Test file
public class LinkedListTest {
    private Node head;
    private Node tail;
    private Node current;

    public LinkedListTest() {
        head = null;
        tail = null;
        current = null;
    }

   
    public void addNode(StudentObject student) {
       
        Node newNode = new Node(student, null, tail);
        
        if (head == null) { 
            head = newNode;
            tail = newNode;
            current = newNode; 
        } else {
            tail.setNext(newNode);
            tail = newNode;
        }
    }

    public Object getHead() {
        current = head;
        return (current != null) ? current.getData() : null;
    }

    public Object getTail() {
        current = tail; 
        return (current != null) ? current.getData() : null;
    }

    public boolean hasNext() {
        
        return (current != null && current.getNext() != null);
    }

    public Object getNext() {
        if (hasNext()) {
            current = current.getNext(); 
            return current.getData();
        }
        return null;
    }

    public boolean hasPrevious() {
   
        return (current != null && current.getPrevious() != null);
    }

    public Object getPrevious() {
        if (hasPrevious()) {
            current = current.getPrevious(); 
            return current.getData();
        }
        return null;
    }
}