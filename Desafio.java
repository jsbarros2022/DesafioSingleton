
public class Desafio {
	
	static private Desafio instancia = new Desafio();
	
	private Desafio() {} 
	static Desafio getinstancia () {return instancia;}
	
	public static void main(String[] args) {
		 Desafio singleton  = new Desafio();
	}

}
