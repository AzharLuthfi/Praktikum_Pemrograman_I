package pertemuan4;

public class StrukturList {
	
	private Node HEAD;
	
	public StrukturList() {
		this.HEAD = HEAD;
	}
	
	//fungsi add tail
	public void addTail(double data) {
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
	
	//LATIHAN 2
	//fungsi add middle
	public void addMid(double data, int pos) {
		Node newNode = new Node(data);
		
		if (isEmpty()) {
			HEAD = newNode;
		} else {
			Node posNode = null;
			Node curNode = HEAD;
			
			if (pos == 1) {
				newNode.setNext(HEAD) ;
				HEAD = newNode;
			} else {
				int i = 1; 
				while (curNode != null && i < pos) {
					posNode = curNode;
					curNode = curNode.getNext();
					i++;	
				}
				
				posNode.setNext(newNode);
				newNode.setNext(curNode);
			
			}
		}
	}
	
	//fungsi add head
	public void addHead(double data) {
		Node newNode = new Node(data);
		
		if (isEmpty()) {
			HEAD = newNode;
		} else {
			newNode.setNext(HEAD);
			HEAD = newNode;
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
