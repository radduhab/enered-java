package ro.enered.exemple;

public class Student {
	String nume;
	int grupa;

	public String invata(String numeCurs, int ore) {
		String rezultat = " Studentul " + nume +  " din grupa " + grupa + " a invatat la " + numeCurs + " timp de "+  ore +" ore ";
		return rezultat;
	}

}
