import java.util.Scanner;
class Masukan {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner masukan = new Scanner(System.in);
		int nilai;
		System.out.println("Masukkan nama Anda");
		nilai = masukan.nextInt(); // Coba ganti menjadi masukan.next();
		System.out.println("Selamat Datang, " + nilai);
	}
}
