package pertmuan1;

public class Node {
//	Latihan ini akan memberikan implementasi pembuatan elemen list bertipe bilangan bulat (integer). 
//	Elemen list direpresentasikan dengan Node. Sebuah node terdiri dari atribut
//	nilai dan atribut next. Atribut next akan menunjuk ke node yang lain.
	private int nilai;
	private Node next;
	
	
	public Node (int nilai) {
		this.nilai=nilai;
		
	}
	//setter dan getter nilai
	public void setNilai(int nilai) { 
		this.nilai = nilai;
		}
	
	public int getNilai() {
		return nilai; 
		}
	
	//setter dan getter Node
	public void setNext(Node next) {
        this.next = next;
    }
    public Node getNext() {
        return next;
    }
}
