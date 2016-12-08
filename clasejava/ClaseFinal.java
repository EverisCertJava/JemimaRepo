package com.clasejava;
/*
 *Una clase no puede ser final y abstracta al mismo tiempo.
 *Sin embargo una clase abstracta puede ser extendida en una clase final.
 *Una clase final no puede ser extendida.
 */
public final class ClaseFinal extends ClaseAbstracta {

/*
 * La primer clase (que no sea abstracta) en extender una clase abstracta
 * deberá implementar todos sus métodos abstractos.
 * 
 */
	@Override
	void metodoAbstracto() {
		// TODO Auto-generated method stub
		
	}

}
