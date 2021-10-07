import java.util.Scanner;

public class hadiah3 {
	
	
	public static void main (String args[]){
		
		
		 Scanner input = new Scanner(System.in);
		
		
		String nama, alamat;
	
		int bayar,kembalian,hargatiketpesawat=0,tipepesawat;
		
		
		System.out.print("Masukkan nama anda : ");
		nama = input.nextLine();
		System.out.print("Masukkan alamat anda : ");
		alamat = input.nextLine();
		System.out.println();
		
		System.out.println("Pilihan Pesawat:");
		System.out.println("1. A harga Rp.5.000.000:");
		System.out.println("2. B harga Rp.2.000.000:");
		System.out.println("3. C harga Rp.1.000.000:");
		System.out.print("Pilihan kamu: ");
		tipepesawat = input.nextInt();
		
		
		
		if (tipepesawat == 1) {
			hargatiketpesawat = 5000000;
			System.out.println("Kamu memilih pesawat A, silahkan lanjut ke pembayaran");
		} else 
		if (tipepesawat == 2) {
			hargatiketpesawat = 2000000;
			System.out.println("Kamu memilih pesawat B, silahkan lanjut ke pembayaran");
		} else 
		if (tipepesawat == 3) {
			hargatiketpesawat = 1000000;
			System.out.println("Kamu memilih pesawat C, silahkan lanjut ke pembayaran");
		} 
		
		System.out.print("Masukkan nominal pembayaran : ");
		bayar = input.nextInt();
		
		kembalian = (bayar-hargatiketpesawat);
		
		
		System.out.print("Nama Anda : " + nama + "\n");
		
		System.out.print("Alamat Anda : " + alamat + "\n");
		
		System.out.print("Kembalian Anda : " + kembalian + "\n");
		
	}
	
		
	
}