package list;

public class Stack<T> implements InterfaceStack<T> {
	
	private int size;
	
	private Node<T> top;
	
	public Stack() {
		this.size = 0;
	}
	
	public int getSize() {
		return size;
	}

	@Override
	public void push(T object) {
		if(object != null) {
			top = new Node<T>(object);
			size++;
		}
	}
	
	@Override
	public T getTop() {
		if(isEmpty()) {
			System.out.println("stack is empty");
			return null;
		} else {
			T object = top.getObject();
			return object;
		}
	}
	
	@Override
	public T pop() {
		if(isEmpty()) {
			System.out.println("stack is empty");
			return null;
		} else {
			T object = top.getObject();
			top = top.getNext();
			size--;
			return object;
		}
	}

	@Override
	public boolean isEmpty() {
		if(top == null) {
			return true;
		} else {
			return false;
		}
	}
	
}
