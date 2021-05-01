package kodlamaio;

public class Main {

	public static void main(String[] args) {
		
		Student  student1 = new Student("G�l�ah","Ba�kurt","gulsah_baskurt","xxx","gulsahbaskurt.10@gmail.com");
		
		Instructor instructor1 = new Instructor("Engin","Demiro�","engdmrg","yyy",3);
		
		System.out.println("��renci ad� ve soyad� : " + student1.getAdi() + " " + student1.getSoyadi() + "\nKullan�c� ad� :  " + student1.getKullaniciAdi() 
		+ "\n�ifre : " +  student1.getSifre() + "\nEmail : " + student1.getEmail() + "\n**************************************");
		System.out.println("E�itmen ad� ve soyad� : " + instructor1.getAdi() + " " + instructor1.getSoyadi() + "\nKullan�c� ad� : " +  instructor1.getKullaniciAdi()
		+ "\n�ifre : " + instructor1.getSifre() + "\nKurs say�s� : " +  instructor1.getKursSayisi() + "\n**************************************");
		
		
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
