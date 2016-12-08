package test;

import building.House;

public class Testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//House casa = new House();
		//casa.doSomething();
		int arreglo[]={1,2,3,4};
		int suma1=0;
		int suma2=0;
		//System.out.println("Suma 1");
		for (int i=0; i<arreglo.length;i++){
			suma1+=arreglo[i];
			System.out.println("Suma 1[sumando index: "+i+"]= "+suma1);
			suma2+=arreglo[arreglo.length-(i+1)];		
			System.out.println("Suma 2[sumando index: "+(arreglo.length-(i+1))+"]= "+suma2);
			
		}
		System.out.println("Total suma 1: "+suma1);
		System.out.println("Total suma 2: "+suma2);
		
		//System.out.println("Resultado= "+suma1);
	//	System.out.println("--------------------");
	//	System.out.println("Suma 2");
		//for (int i=arreglo.length-1; i>=0;i--){
			//suma2+=arreglo[i];		
			//System.out.println("index: "+i+"= "+arreglo[i]);
			
		//}
		//System.out.println("Resultado= "+suma2);
		
	}
	
	
}
