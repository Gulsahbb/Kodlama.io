package kodlamaio;

public class InstructorManager extends UserManager {
	@Override
	public void kursEkle() {
		System.out.println("Yeni kurs olu�turuldu.");
	}
	public void kursSil() {
		System.out.println("Kurs silindi.");
	}
	public void kursGuncelle() {
		System.out.println("Kurs g�ncellendi.");
	}
}
