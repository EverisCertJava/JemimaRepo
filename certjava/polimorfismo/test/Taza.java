package mx.com.everis.certjava.polimorfismo.test;

public class Taza {

	public void agregarLiquido(Liquido liquido){
		if(liquido instanceof Cafe){
			System.out.println("Es Café");
		}
		else if(liquido instanceof Leche){
			System.out.println("Es Leche");
		}
		else if(liquido instanceof Liquido){
			System.out.println("Es Líquido general");
		}
	}
}
