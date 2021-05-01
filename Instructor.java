package kodlamaio;

public class Instructor extends User{
	int kursSayisi;

	

	public Instructor(String adi, String soyadi, String kullaniciAdi, String sifre, int kursSayisi) {
		super(adi, soyadi, kullaniciAdi, sifre);
		this.kursSayisi = kursSayisi;
	}

	public int getKursSayisi() {
		return kursSayisi;
	}

	public void setKursSayisi(int kursSayisi) {
		this.kursSayisi = kursSayisi;
	}
	
}
