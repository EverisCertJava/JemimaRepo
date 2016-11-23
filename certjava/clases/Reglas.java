/*Se pueden hacer comentarios en todos lados*/
/*
 *El orden para declarar es: 
 *1) package (si existe) 
 *2) import (si existen)
 *3) class
 */
package mx.com.everis.certjava.clases;
//Importando todo un paaquete
import mx.com.everis.certjava.importaesto.*;

import static mx.com.everis.certjava.staticimport.StaticClass.staticMethod;
import static mx.com.everis.certjava.staticimport.StaticClass.MAX_VALUE;
import  static mx.com.everis.certjava.staticimport.StaticClass2.obj;

/*Se pueden hacer comentarios en todos lados*/
public class Reglas {
	/*
	 *Probando algunas definiciones de identificadores:
	 *Puede declararse con una letra, signo $ ó _ al principio.
	 *(Dichos signos pueden estar en cualquier parte del identificador)
	 *No puede declararse con un número al principio...
	 *pero sí se pueden poner números en otras partes del identificador.
	 *
	 */
	//Integer prueba=MAX_VALUE;
	Long prueba2=MAX_VALUE;
	
	String nombre;
	String $nombre;
	String _nombre;
	String n1o2m3b4r5e;
	String nombre$;
	String nombre_;
	String _n0mbr3$;
	
	//La siguiente línea marca error:
	//String 1nombre;
	
	/*
	 * No se pueden usar palabras reservadas en un identificador.
	 */
	
	//La siguientes 2 líneas marcan error:
	//String package;
	//String class;
	
	/*
	 * La declaración de variables en Java es case sensitive
	 */
	
	String variable;
	String Variable;
	/*
	 * Se manda a llamar al método estático
	 */
	public void method(){
		staticMethod();
		String valor=obj.stringMethod();
		
	}
	
	/*Se pueden hacer comentarios en todos lados*/
}

class Clase{
	
}
class Clase2{
	
}

/*
 * No se puede declarar una clase no pública con el mismo nombre
 * que una clase pública...
 * (La siguiente declaración de clase marca error)
 */
//class Reglas{
	
//}
/*Se pueden hacer comentarios en todos lados*/