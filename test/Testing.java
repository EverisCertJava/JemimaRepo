package mx.com.everis.certjava.test;

import mx.com.everis.certjava.clases.Runner;
//import mx.com.everis.certjava.padre.Person;

public class Testing {

	public static void main(String[] args) {
		
		for(String i: args)
			System.out.println(i);
		System.out.println(args.length);
		//Runner r = new Runner();
		Runner r = new Runner("A","B","C");
		System.out.println(r);
		//Person p = new Person();

	}

}
