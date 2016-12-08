package com.clasejava;

/* Una clase abstracta puede tener métodos abstractos y no abstractos.
 * 
 * Un sólo método abstracto requiere que toda la clase sea abstracta.
 * 
 * Una clase no puede ser abstracta y final al mismo tiempo.
 * 
 */
//Las siguientes 2 líneas marcan error:
//class ClaseAbstracta{
//final abstract class ClaseAbstracta{
abstract class ClaseAbstracta {
	
	abstract void metodoAbstracto();
	
	public void metodoNoAbstracto(){
		
	}

}
