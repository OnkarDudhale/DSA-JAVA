import java.util.*;
public class QCircularLL {
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    static class Queue {
        Node front;
        Node rear;

        public Queue(){
            front=rear=null;
        }

        public boolean isEmpty() {
            return front==null;
        }

        public void add(int data){
            Node newNode=new Node(data);
            if (isEmpty()) {//for single element
                front=rear=newNode;
                rear.next=front;
            }else 
            {
                rear.next=newNode;
                rear=newNode;
                rear.next=front;
            }
        }

        public void remove(){
            if(isEmpty()){
                System.out.println("Empty queue");
                return;
            }
            if(front==rear){
                front=rear=null;
            }else 
            {
                front=front.next;
                rear.next=front; 
            }
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("Empty queue");
                return -1;
            }
            return front.data;
        }
    }

    public static void main(String args[]) {
        Queue q=new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}