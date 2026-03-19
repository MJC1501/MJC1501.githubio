//Macy Culbertson 
//SD class 3/10/26
// Node class 
public class Node {
    Node next;
    Node previous;
    Player data;

    Node(Object data, Node next, Node previous) {
        this.data = data;
        this.next = next;
        this.previous = previous;
    }

    public Node(String name, String age, String grade, Object object, Node tail) {
        //TODO Auto-generated constructor stub
    }

    public Node(String name, String age, String grade, Node tail) {
        //TODO Auto-generated constructor stub
    }

   
    public Node(Player data2) {
        //TODO Auto-generated constructor stub
    }

    public String getName() {
        return ((StudentObject) data).getName();
    }

    public String getAge() {
        return ((StudentObject) data).getAge();
    }

    public String getGrade() {
        return ((StudentObject) data).getGrade();
    }

 
    public void setNext(Node next) { this.next = next; }

    public Node getNext() { return next; }

    public void setPrevious(Node previous) { this.previous = previous; }

    public Node getPrevious() { return previous; }

    public Object getData() { return data; }

    public void setData(Object data) { this.data = data; }
}
