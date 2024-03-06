package pertemuan2;

public class ContohFungsi {
	
	// ini merupakan fungsi tambah dua bilangan
	public static int tambah(int a, int b) {
		return a + b;
	}
	
	// ini merupakan fungsi kali dua bilangan
	public static int kali(int a, int b) {
		return a * b;
	}
	
	public static void main(String[] args) {
		
		// input nilai untuk fungsi tambah
		int hasilPenjumlahan = tambah(5, 3);
		System.out.println("hasil penjumlahan: " + hasilPenjumlahan);
		// OUTPUT hasil penjumlahan: 8
		
		// input nilai untuk fungsi kali
		int hasilPerkalian = kali(4, 6);
		System.out.println("hasil perkalian: " + hasilPerkalian);
		// OUTPUT perkalian: 24
	}

}
