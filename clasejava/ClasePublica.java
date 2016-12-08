/*Sólo habrá una declaración de package y será la primer línea del archivo*/
package com.clasejava;

/*Después de la declaración de package se pueden declarar imports de ser necesarios*/
import com.clasestest.*;

/* Sólo puede haber una clase pública en el archivo,
 * la cual deberá llamarse igual que el archivo.
 * 
 * 
 * Un archivo puede contener varias clases las cuales compartirán el package y los imports.
 *
 */
public class ClasePublica {
	//Acceso a ClaseTest
	ClaseTest obj=new ClaseTest();
	
	//Acceso a ClaseDefault
	ClaseDefault obj2= new ClaseDefault();
	
	public void metodoPublico(){
		obj2.metodo();
	}
	
}

class subClase1{
	//Acceso a ClaseTest
	ClaseTest obj=new ClaseTest();
	
	//Acceso a ClaseDefault
		ClaseDefault obj2= new ClaseDefault();
}
