package kodlamaio;

public class InstructorManager extends UserManager {
	@Override
	public void kursEkle() {
		System.out.println("Yeni kurs oluþturuldu.");
	}
	public void kursSil() {
		System.out.println("Kurs silindi.");
	}
	public void kursGuncelle() {
		System.out.println("Kurs güncellendi.");
	}
}
