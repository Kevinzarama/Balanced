package list;

public class Node<T> {
	
	private T object;
	
	private Node<T> next;
	
	public Node(T element) {
		this.object = element;
		this.next = null;
	}
	
	public void setObject(T object) {
		this.object = object;
	}
	
	public T getObject() {
		return object;
	}
	
	public void setNext(Node<T> next) {
		this.next = next;
	}
	
	public Node<T> getNext(){
		return next;
	}
	
}
