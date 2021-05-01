package kodlamaio;

public class StudentManager extends UserManager{
	@Override
	public void kursEkle() {
		System.out.println("Yeni kurs eklendi.");
	}
	
	public void kursCikar() {
		System.out.println("Kurs çýkarýldý.");
	}
	public void sifreYenile() {
		System.out.println("Þifre yenilendi.");
	}
}
