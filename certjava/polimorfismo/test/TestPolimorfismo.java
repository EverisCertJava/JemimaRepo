package mx.com.everis.certjava.polimorfismo.test;

public class TestPolimorfismo {
	public static void main(String[] args) {
		Liquido cafe=new Cafe();
		Liquido leche=new  Leche();
		Liquido liquido=new Liquido();
		
		Taza taza=new Taza();
		
		taza.agregarLiquido(cafe);
		taza.agregarLiquido(leche);
		taza.agregarLiquido(liquido);
	}
}
