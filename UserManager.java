package kodlamaio;

public class UserManager {
	public void kursEkle() {
		System.out.println("Kurs eklendi.");
	}
	public void kullaniciAdiDegistir(User user) {
		System.out.println("kullan�c� ad� de�i�tirildi : " + user.getKullaniciAdi());
	}
}
