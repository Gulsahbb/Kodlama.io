package kodlamaio;

public class Main {

	public static void main(String[] args) {
		
		Student  student1 = new Student("Gülşah","Başkurt","gulsah_baskurt","xxx","gulsahbaskurt.10@gmail.com");
		
		Instructor instructor1 = new Instructor("Engin","Demiroğ","engdmrg","yyy",3);
		
		System.out.println("Öğrenci adı ve soyadı : " + student1.getAdi() + " " + student1.getSoyadi() + "\nKullanıcı adı :  " + student1.getKullaniciAdi() 
		+ "\nŞifre : " +  student1.getSifre() + "\nEmail : " + student1.getEmail() + "\n**************************************");
		System.out.println("Eğitmen adı ve soyadı : " + instructor1.getAdi() + " " + instructor1.getSoyadi() + "\nKullanıcı adı : " +  instructor1.getKullaniciAdi()
		+ "\nŞifre : " + instructor1.getSifre() + "\nKurs sayısı : " +  instructor1.getKursSayisi() + "\n**************************************");
		
		
		StudentManager studentManager = new StudentManager();
		studentManager.kursEkle();
		studentManager.kursCikar();
		studentManager.sifreYenile();
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.kursEkle();
		instructorManager.kursSil();
		instructorManager.kursGuncelle();
		
		UserManager userManager = new UserManager();
		userManager.kursEkle();
		
		userManager.kullaniciAdiDegistir(student1);
	}

}
