package ejercicio12_EnumSet;

import java.util.EnumSet;

public class Ejercicio1 {

	/*1. Crea un EnumSet con los enum de los meses del año.
	  2. Crea un EnumSet de meses del año vacío. Introdúcele los meses de verano. 
	  3. Crea un EnumSet a partir del anterior con todos los meses excepto los de verano. 
	  4. Crea un EnumSet copia del anterior. 
	  5. Crea un EnumSet con los meses de septiembre en adelante, es decir, hasta diciembre.*/ 
	
	public void show() {
		EnumSet<Meses> enumMeses1, enumMeses2, enumMeses3, enumMeses4, enumMeses5;
		
		enumMeses1 = EnumSet.allOf(Meses.class);
		System.out.printf("1. Todos los meses del año: %s", enumMeses1);
		
		enumMeses2 = EnumSet.range(Meses.JUNIO, Meses.AGOSTO);
		System.out.printf("\n2. Los meses de verano: %s", enumMeses2);
		
		enumMeses3 = EnumSet.complementOf(enumMeses2);
		System.out.printf("\n3. Todos los meses, excepto los de verano, partiendo del anterior: %s", enumMeses3);
		
		enumMeses4 = EnumSet.copyOf(enumMeses3);
		System.out.printf("\n4. Copia del anterior %s", enumMeses4);
		
		enumMeses5 = EnumSet.range(Meses.SEPTIEMBRE, Meses.DICIEMBRE);
		System.out.printf("\n5. Los meses a partir de Septiembre en adelante: %s", enumMeses5);
	}
	
	public static void main(String[] args) {
		new Ejercicio1().show();
	}

}
