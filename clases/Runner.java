package mx.com.everis.certjava.clases;

import mx.com.everis.certjava.interfaces.Athlete;
import mx.com.everis.certjava.interfaces.Athlete2;
import mx.com.everis.certjava.padre.Person;
/**
 * 
 * @author everis
 * 
 * Modificadores de acceso: private, default(package), protected, public
 *
 */
public class Runner extends Person implements Athlete, Athlete2 {
	/**
	 * Constructor
	 * - no tiene valor de retorno
	 * - sí tiene modificador de acceso
	 */
	public Runner(){
		super("Jemima");
		System.out.println("Clase Hija - Constructor Runner Class");
	}
	
	public Runner(String nombre){
		System.out.println("Clase Hija - Constructor Runner Class - Nombre = "+nombre);
	}
	/**
	 * varargs
	 * @param name recibe un arreglo de strings
	 */
	public Runner(String...name){
	for(String i: name)
		System.out.println(i);
	}
	
	@Override
	public String toString(){
		return "Jemima overrode toString() method @ Runner Class";
		
	}
	/**
	 * Variables de clase o estáticas
	 */
	/**
	 * Variables de Instancia
	 */
	/**
	 * Métodos
	 */
	@Override
	public String getNombre() {
		return null;
	}

	@Override
	public String getApellido() {
		return null;
	}

	@Override
	public int getEdad() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
