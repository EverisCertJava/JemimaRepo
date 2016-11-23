package mx.com.everis.certjava.polimorfismo;

public class Futbolista extends SeleccionFutbol {

	private int dorsal;
	private String demarcacion;
	
	public Futbolista(int id, String nombre, String apellidos, int edad,int dorsal, String demarcacion){
		super(id,nombre,apellidos,edad);
		this.dorsal=dorsal;
		this.demarcacion=demarcacion;
	}
	// Constructor, getter y setter

	@Override
	public void entrenar() {
		System.out.println("Realiza un entrenamiento (Clase Futbolista)");
	}

	@Override
	public void jugarPartido() {
		System.out.println("Juega un Partido (Clase Futbolista)");
	}

	public void entrevista() {
		System.out.println("Da una Entrevista");
	}
}
