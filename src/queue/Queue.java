package queue;
//
//import java.util.Arrays;
//
//public class Queue<T> {
//
//    private int front;
//    private int rear;
//    private int size;
//    private T[] queue;
//
//    public Queue(int inSize) {
//        this.size = inSize;
//        this.queue = (T[]) new Object[size];
//        this.front = -1;
//        this.rear = -1;
//    }
//
//    public boolean isempty() {
//        return (this.front == -1 && this.rear == -1);
//    }
//
//    public void enQueue(T value) {
//        if ((this.rear + 1) % this.size == front) {
//            resize(2 * this.size);
//
//        } else if (isempty()) {
//            this.front++;
//            this.rear++;
//            this.queue[this.rear] = value;
//
//        } else {
//        	this.rear=(this.rear+1)%size;
//        	this.queue[this.rear] = value;
//
//        }
//    }
//
//    public T deQueue() {
//        T value = null;
//        if (isempty()) {
//            throw new IllegalStateException("Queue is empty, cant dequeue");
//        } else if (this.front == this.rear) {
//            value = this.queue[this.front];
//            this.front = -1;
//            this.rear = -1;
//
//        } else {
//            value = this.queue[this.front];
//            this.front=(this.front+1)%size;
//
//        }
//        return value;
//
//    }
//    public void resize(int capacity){
//    	
//    	T[] queueCopy = (T[]) new Object[capacity];
//    	
//    	for(int i = 0; i < this.size;i++){
//    		queueCopy[i] = this.queue[i];
//    	}
//    	
//    	this.queue = queueCopy;
//    	this.front = 0;
//    	this.rear = this.size;
//    	this.size = capacity;
//    	
//    }
//    
//    
//    
//    @Override
//    public String toString() {
//        return "Queue [front=" + this.front + ", rear=" + this.rear + ", size=" + this.size
//                + ", queue=" + Arrays.toString(this.queue) + "]";
//    }
//
//    public static void main(String[] args) {
//    	
//    	Queue<Integer> que = new Queue<>(10);
//    	
//    	que.enQueue(1);
//    	que.enQueue(2);
//    	que.enQueue(3);
//    	que.enQueue(4);
//    	que.enQueue(5);
//    	que.enQueue(6);
//    	que.enQueue(7);
//    	que.enQueue(8);
//    	que.enQueue(9);
//    	
//    	System.out.println("Queue Size:" + que.size);
//    	
//    	System.out.println(que.toString());
//    	
//    	
//    	int val = que.deQueue();
//    	val = que.deQueue();
//    	val = que.deQueue();
//    	val = que.deQueue();
//    	
//    	System.out.println("Queue Size:" + que.size);
//    	
//    	System.out.println(que.toString());
//			
//	}
//}


/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility  classes
*/
import java.util.*;
import java.io.*;

class Queue {
    public static void main(String args[] ) throws Exception {
        
         //* Read input from stdin and provide input before running
       //  * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String data = "";
        int size = Integer.parseInt(br.readLine());
        MyQueue que = new MyQueue(size);
        
        data = br.readLine();
        String elem[] = data.split("\\s+");
        
        for(int i=0;i<elem.length-1;i++){
         //   que.enqueue(Integer.parseInt(elem[i]));
        
        }
        
            
        int N = Integer.parseInt(br.readLine());
        if(N == 1){
          //  que.enqueue(Integer.parseInt(br.readLine()));
        }
        else{
            //int n = que.dequeus();
        }
        
       que.print();
/*
        //Scanner
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();

        for (int i = 0; i < N; i++) {
            System.out.println("hello world");
        }
        */
    }
}

class MyQueue{
    private int elements[];
    private int size = 0;
    private int head = 0;
    private int tail = 0;
   
    MyQueue(int capacity){
        elements = new int[capacity];
     }
    
    public void enqueue(int n) throws Exception{
        if(elements.length == size){
            throw new Exception("Queue full!");
        }
        elements[tail] = n;
        tail = (tail+1) % elements.length;
        size++;
    }
    
    public int dequeus() throws Exception{
        if(size == 0)
            throw new Exception("Queue Empty!");
        
        int data = elements[head];
        elements[head] = 0;
        head = (head + 1) % elements.length;
        size--;
        return data;
    }
    
    public void print(){
        for(int data: elements){
            System.out.print(data + " ");
        }
    }
}


