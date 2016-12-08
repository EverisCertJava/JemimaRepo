package mx.com.everis.certjava.clases;

public class UnaClase implements UnaInterfaz {

	@Override
	public String getAtributo() {
		/*El atributo de la interfaz es final por default.
		 * */
		//La siguiente línea marca error pues no se puede modificar.	
		//atributo="cambios";
		
		String unAtributo=atributo;
		
		return unAtributo;
	}

}
