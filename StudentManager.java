package kodlamaio;

public class StudentManager extends UserManager{
	@Override
	public void kursEkle() {
		System.out.println("Yeni kurs eklendi.");
	}
	
	public void kursCikar() {
		System.out.println("Kurs ��kar�ld�.");
	}
	public void sifreYenile() {
		System.out.println("�ifre yenilendi.");
	}
}
