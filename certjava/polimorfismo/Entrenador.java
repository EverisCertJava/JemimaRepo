package mx.com.everis.certjava.polimorfismo;

public class Entrenador extends SeleccionFutbol {

	private int idFederacion;
	public Entrenador(int id, String nombre, String apellidos, int edad, int idFederacion){
		super(id,nombre,apellidos,edad);
		this.idFederacion=idFederacion;
	}
       // Constructor, getter y setter

	@Override
	public void entrenar() {
		System.out.println("Dirige un entrenamiento (Clase Entrenador)");

	}

	@Override
	public void jugarPartido() {
		System.out.println("Dirige un Partido (Clase Entrenador)");
	}

	public void planificarEntrenamiento() {
		System.out.println("Planificar un Entrenamiento");
	}
}
	
