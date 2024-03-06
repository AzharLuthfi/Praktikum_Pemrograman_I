package pertemuan3;

public class StrukturList {
	//LATIHAN 2
	private Node HEAD;
	
	public StrukturList() {
		this.HEAD = HEAD;
	}
	public void addTail(int data) {
		Node newNode = new Node(data);
		
		if (isEmpty()) {
			HEAD = newNode;
		}else {
			Node posNode = null;
			Node curNode = HEAD;
			
			while(curNode != null) {
				posNode = curNode;
				curNode = curNode.getNext();
			}
			
			posNode.setNext(newNode);
		}
	}
	
	private boolean isEmpty() {
		return HEAD == null;
	}
	
	
	//LATIHAN 3
	public void displayElement() {
		Node curNode = HEAD;
		
		while(curNode != null) {
			System.out.print(curNode.getData()+ " ");
			curNode = curNode.getNext();
		}
	}
}
