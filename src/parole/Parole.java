package parole;

import java.util.*;

public class Parole {
		List <String> lista = new ArrayList<>();
	
	
	public Parole() {
	}
	
	public void addParola(String p) {
		lista.add(p);
	}
	
	public List<String> getElenco() {
		Collections.sort(lista);
		return lista;
	}
	
	public void reset() {
		lista.clear();
	}

}
