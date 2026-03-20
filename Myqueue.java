//Macy Culbertson
//SD class 
// Stack and queue assignment
//file defines the queue
public class Myqueue {
private stackandqueueNode front, rear;

    public void enqueue(Player data) {
        stackandqueueNode newNode = new stackandqueueNode(data);
        if (rear == null) {
            front = rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }

    public Player dequeue() {
        if (front == null) throw new RuntimeException("Queue is empty!");
        Player data = front.data;
        front = front.next;
        if (front == null) rear = null;
        return data;
    }

    public void display() {
        stackandqueueNode current = front;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}