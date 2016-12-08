package com.clasestest;
import com.clasejava.*;

//La siguiente línea marca error pues una clase final no puede ser extendida.
//public class ClaseTest extends ClaseFinal{

public class ClaseTest {
	//Clase visible.
	ClasePublica obj=new ClasePublica();
	
	/*La siguiente línea marca error "clase no visible"*/
	//ClaseDefault obj2= new ClaseDefault();
}
