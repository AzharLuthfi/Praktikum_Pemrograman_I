package pertemuan4;

public class StrukturListTest3 {
	public static void main(String[] args) {
		StrukturList List = new StrukturList();
		
	 	List.addHead(2.1);
		List.addTail(4.5);
		List.addMid(3.4, 1);
		List.addMid(1.1, 3);
		List.addTail(5.5);
		
		List.displayElement();
	}

}
