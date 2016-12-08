package mx.com.everis.certjava.polimorfismo;

public class Masajista extends SeleccionFutbol {

	private String titulacion;
	private int aniosExperiencia;

	// Constructor, getter y setter

	public Masajista(int id, String nombre, String apellidos, int edad, String titulacion, int aniosExperiencia){
		super(id,nombre,apellidos,edad);
		this.setTitulacion(titulacion);
		this.setAniosExperiencia(aniosExperiencia);
	}
	@Override
	public void entrenar() {
		System.out.println("Da asistencia en el entrenamiento (Clase Masajista)");
	}

	public void darMasaje() {
		System.out.println("Da un Masaje");
	}
	public String getTitulacion() {
		return titulacion;
	}
	public void setTitulacion(String titulacion) {
		this.titulacion = titulacion;
	}
	public int getAniosExperiencia() {
		return aniosExperiencia;
	}
	public void setAniosExperiencia(int aniosExperiencia) {
		this.aniosExperiencia = aniosExperiencia;
	}
}
