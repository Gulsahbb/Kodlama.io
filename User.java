package kodlamaio;

public class User {
	String adi;
	String soyadi;
	String kullaniciAdi;
	String sifre;
	
	
	public User(String adi, String soyadi, String kullaniciAdi, String sifre) {
		super();
		this.adi = adi;
		this.soyadi = soyadi;
		this.kullaniciAdi = kullaniciAdi;
		this.sifre = sifre;
	}


	public String getAdi() {
		return adi;
	}


	public void setAdi(String adi) {
		this.adi = adi;
	}


	public String getSoyadi() {
		return soyadi;
	}


	public void setSoyadi(String soyadi) {
		this.soyadi = soyadi;
	}


	public String getKullaniciAdi() {
		return kullaniciAdi;
	}


	public void setKullaniciAdi(String kullaniciAdi) {
		this.kullaniciAdi = kullaniciAdi;
	}


	public String getSifre() {
		return sifre;
	}


	public void setSifre(String sifre) {
		this.sifre = sifre;
	}

	
}
