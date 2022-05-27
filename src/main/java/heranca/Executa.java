package heranca;

public class Executa {

	public static void main(String[] args) {
		Carros simples = new Carros();
		CarrosEspeciais especiais = new CarrosEspeciais(); 
		
	
		simples.desligar();
		especiais.ligar();
	}

}
