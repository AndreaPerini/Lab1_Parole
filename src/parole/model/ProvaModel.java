package parole.model;

public class ProvaModel {

	public static void main(String [] args) {
		Parole elenco = new Parole();
		elenco.addParola("andrea");
		elenco.addParola("perini");
		elenco.addParola("buco");
		System.out.println(elenco.getElenco());
	}
}
