package pertmuan1;

public class NodeMain {
	public static void main(String[] args) {
		 
		Node n0 = new Node(2); 
		Node n1 = new Node(3); 
		Node n2 = new Node(5);
		Node n3 = new Node(7);
		Node n4 = new Node(8);
	    Node n5 = new Node(9);
	//a
	    
	    n2.setNext(n3);
	    n3.setNext(n5);
	    n5.setNext(n4);
	    
        Node p = n2;
        while (p!= null) {
            System.out.printf("%d " , p.getNilai() );
            p = p.getNext();
            
        }
        
        System.out.println();
     //b
        
        n0.setNext(n1);
        n1.setNext(n2);
        n2.setNext(n3);
        n3.setNext(n5);

        Node q = n0;
        while (q != null) {
            System.out.printf("%d ", q.getNilai());
            q = q.getNext();
        }

    
    
	 }
}
