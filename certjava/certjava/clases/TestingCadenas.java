package mx.com.everis.certjava.clases;

public class TestingCadenas {
	public static void main(String[] args) {
		String valor1="Jemima";
		String valor2=new String("Jemima");
		System.out.println(valor1);
		System.out.println(valor2);


		
		if(valor1==valor2){
			System.out.println("Son iguales");
		}else{
			System.out.println("No son iguales");
		}
		if(valor1.equals(valor2)){
			System.out.println("Son iguales");
		}else{
			System.out.println("No son iguales");
		}
		
		StringBuilder cadena= new StringBuilder();
		
		for (int i=1;i<=10;i++){
		cadena.append(i+"..");
		System.out.println(cadena);
		}
	}
}
