package emailApp;

public class EmailApp {

	public static void main(String[] args) {
		Email sampleEmail = new Email("Christopher", "Guerrero");
		
		sampleEmail.setAlternateEmail("chrisgrr3@gmail.com");
		System.out.println(sampleEmail.showInfo());
	}

}
