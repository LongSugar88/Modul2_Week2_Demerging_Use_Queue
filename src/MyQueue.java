public class MyQueue<T> {
    private Node<T> head;
    private Node<T> tail;
    private int currentSize;

    public MyQueue(){
        this.head = null;
        this.tail = null;
    }

    class Node<T>{
        private T data;
        private Node<T> next;
        public Node(T data){
            this.data = data;
            this.next = null;
        }
    }
    public boolean isEmpty(){
        return currentSize == 0;
    }
    public void enqueue(T element){
        Node<T> newNode = new Node<>(element);
        if(head == null){
            head = tail = newNode;
        }
        tail.next = newNode;
        tail = newNode;
        currentSize++;
    }
    public T dequeue() throws Exception {
        if(isEmpty()){
            throw new Exception("Array is empty");
        }
        Node<T> token = head;
        head = head.next;
        if(head == null){
            tail = null;
        }
        currentSize--;
        return token.data;
    }
    public T peek(int index){
        Node<T> current = head;
        if(index == 0){
            return head.data;
        }
        for(int i=0; i< index; i++){
            current = current.next;
        }
        return current.data;
    }
}
