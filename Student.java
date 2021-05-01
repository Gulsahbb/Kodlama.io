package kodlamaio;

public class Student extends User{
	String email;
	


	public Student(String adi, String soyadi, String kullaniciAdi, String sifre, String email) {
		super(adi, soyadi, kullaniciAdi, sifre);
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	
}
