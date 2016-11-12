package queue;

import java.util.Arrays;

public class Queue<T> {

    private int front;
    private int rear;
    private int size;
    private T[] queue;

    public Queue(int inSize) {
        this.size = inSize;
        this.queue = (T[]) new Object[size];
        this.front = -1;
        this.rear = -1;
    }

    public boolean isempty() {
        return (this.front == -1 && this.rear == -1);
    }

    public void enQueue(T value) {
        if ((this.rear + 1) % this.size == front) {
            resize(2 * this.size);

        } else if (isempty()) {
            this.front++;
            this.rear++;
            this.queue[this.rear] = value;

        } else {
        	this.rear=(this.rear+1)%size;
        	this.queue[this.rear] = value;

        }
    }

    public T deQueue() {
        T value = null;
        if (isempty()) {
            throw new IllegalStateException("Queue is empty, cant dequeue");
        } else if (this.front == this.rear) {
            value = this.queue[this.front];
            this.front = -1;
            this.rear = -1;

        } else {
            value = this.queue[this.front];
            this.front=(this.front+1)%size;

        }
        return value;

    }
    public void resize(int capacity){
    	
    	T[] queueCopy = (T[]) new Object[capacity];
    	
    	for(int i = 0; i < this.size;i++){
    		queueCopy[i] = this.queue[i];
    	}
    	
    	this.queue = queueCopy;
    	this.front = 0;
    	this.rear = this.size;
    	this.size = capacity;
    	
    }
    
    
    
    @Override
    public String toString() {
        return "Queue [front=" + this.front + ", rear=" + this.rear + ", size=" + this.size
                + ", queue=" + Arrays.toString(this.queue) + "]";
    }

    public static void main(String[] args) {
    	
    	Queue<Integer> que = new Queue<>(10);
    	
    	que.enQueue(1);
    	que.enQueue(2);
    	que.enQueue(3);
    	que.enQueue(4);
    	que.enQueue(5);
    	que.enQueue(6);
    	que.enQueue(7);
    	que.enQueue(8);
    	que.enQueue(9);
    	
    	System.out.println("Queue Size:" + que.size);
    	
    	System.out.println(que.toString());
    	
    	
    	int val = que.deQueue();
    	val = que.deQueue();
    	val = que.deQueue();
    	val = que.deQueue();
    	
    	System.out.println("Queue Size:" + que.size);
    	
    	System.out.println(que.toString());
			
	}
}