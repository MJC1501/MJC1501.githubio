public class myStack {
private stackandqueueNode top;

    public void push(Player data) {
        stackandqueueNode newNode = new stackandqueueNode(data);
        newNode.next = top;
        top = newNode;
    }

    public Player pop() {
        if (top == null) throw new RuntimeException("Stack is empty!");
        Player data = top.data;
        top = top.next;
        return data;
    }

    public void display() {
        stackandqueueNode current = top;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}
