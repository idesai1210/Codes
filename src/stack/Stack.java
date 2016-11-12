package stack;

public class Stack <T>{
	
	int topOfStack;
	T[] stack;
	T[] s2;
	int topOfStack2;
	int min = Integer.MAX_VALUE;
	public Stack(){
		this.stack = ( T[] ) new Object[1];
		this.s2 =  (T[]) new Object[1];
	}
	
	
	public void push(T item){
		
		if(topOfStack == this.stack.length){
			resize(2 * topOfStack,true);
		}
		if(topOfStack2 == this.s2.length){
			resize(2 * topOfStack2,false);
		}
		
		if((int)item < this.min){
			this.min = (int)item;
			this.s2[this.topOfStack2++] = item;
			//System.out.println(this.s2[this.topOfStack2 - 1]);
		}
		
		this.stack[topOfStack++] = item;
	}
	public T pop(){
		T item = null;
		if(isEmpty())
			return item;
		else{
			item = this.stack[--topOfStack];
			if((int)item == this.min){
				item = this.s2[--this.topOfStack2];
			}
			return item;
		}
	}
	
	public boolean isEmpty(){
		return (this.topOfStack == 0) ;
	}
	
	public int size(){
		return this.topOfStack;
	}
	
	public int min(){
		
		return (int)this.s2[this.topOfStack2 - 1];
	}
	
	public void resize(int capacity, boolean flag){
		
		if(flag){
			T[] stackCopy = (T[]) new Object[capacity];
			
			for(int i = 0 ;i < this.stack.length;i++){
				stackCopy[i] = this.stack[i];
				
			}
			
			this.stack = stackCopy;
		}
		else{
			
			T[] stackCopy = (T[]) new Object[capacity];
			
			for(int i = 0 ;i < this.s2.length;i++){
				stackCopy[i] = this.s2[i];
				
			}
			
			this.s2 = stackCopy;
			
			
		}
		
	}
	
	
	
	
	public void traverse(){
		for(int i = 0; i < topOfStack;i++){
			System.out.println(this.stack[i]);
		}
	}
	
	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<Integer>();
		
		stack.push(5);
		stack.push(4);
		stack.push(3);
		stack.push(2);
		stack.push(1);
		
		System.out.println("Minimum value is:" +stack.min());
		System.out.println("Stack size: " + stack.size());
		stack.traverse();
		
		System.out.println("Element popped : " + stack.pop());
		System.out.println("Element popped : " + stack.pop());
		System.out.println("Stack size: " + stack.size());
		
		stack.traverse();
		
	}

}
