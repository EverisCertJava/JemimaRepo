<<<<<<< HEAD
package test;

import building.House;
=======
package mx.com.everis.certjava.test;

import mx.com.everis.certjava.clases.Runner;
//import mx.com.everis.certjava.padre.Person;
>>>>>>> 6dfe732de117133fc555508c2cb48f6a190fc4ee

public class Testing {

	public static void main(String[] args) {
<<<<<<< HEAD
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
	
	
=======
		
		for(String i: args)
			System.out.println(i);
		System.out.println(args.length);
		//Runner r = new Runner();
		Runner r = new Runner("A","B","C");
		System.out.println(r);
		//Person p = new Person();

	}

>>>>>>> 6dfe732de117133fc555508c2cb48f6a190fc4ee
}
