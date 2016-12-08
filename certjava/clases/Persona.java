package mx.com.everis.certjava.clases;

//la clase puede ser abstract,final o public
public class Persona {

	/**
	 * Atributos
	 * Java es fuertementa tipado
	 */
	public String sexo;
	public String nombre;
	public String apellido;
	public int edad;
	public String nacionalidad;
	public String fechaDeNacimiento;
	/**
	 * Acciones
	 */
	public void correr(){
		Persona2 p=new Persona2();
	}
	
	public void comer(){
		
	}
	
	public void beber(){
		
	}
	
}

class Persona3{
	//Clase embebida, no puede tener modificador de acceso
}
/**
 * Modificadores de Acceso:
 * 
 * public
 * protected
 * package
 * private
 */
