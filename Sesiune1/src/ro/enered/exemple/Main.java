package ro.enered.exemple;

public class Main {
	public static void main(String[] args) {
		System.out.println("CEVA");
		// definirea variabilelor
		int a = 4;
		int b = 3;
		int c;
		c = adunare(a, b);
		System.out.println(c);
		c = scadere(a, b);
		System.out.println(c);
		initializareStudent();
		initializareNota();
		initializareStoc();
	}

	private static int adunare(int a1, int b1) {
		return a1 + b1;

	}

	private static int scadere(int a1, int b1) {
		return a1 - b1;
	}

	private static void initializareStudent() {
		// Student nou, nume, clasa, curs
		Student s = new Student();
		// atribuim un nume studentului
		s.nume = "Radu";
		// atribuim o grupa
		s.grupa = 4;
		// apelam metoda invata
		System.out.println(s.invata("Java",5));

	}
	public static void initializareNota(){
		//atribuim studentului cu numele X din grupa Y , nota Z
		
		Student s = new Student();
		s.nume= "Ion";
		s.grupa= 2;
		Nota n = new Nota();
		//n.atribuie(s,8);
		System.out.println(n.atribuie(s, 8));	
	}
	public static void initializareStoc(){
		Stoc s = new Stoc();
		System.out.println(s.calcNr());
	}
}
