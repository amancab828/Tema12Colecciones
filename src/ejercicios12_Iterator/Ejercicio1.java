package ejercicios12_Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import ejercicios12_ArrayList.ConsoleInput;

public class Ejercicio1 {

	/* Modifica el ejercicio 1 del boletín Ejercicios 12 ArrayList para que además de mostrar los números inferiores a la media, 
	 los elimine del ArrayList.*/
	public List<Double> leerNumeros() {
		Scanner scanner = new Scanner(System.in);
		ConsoleInput console = new ConsoleInput(scanner);
		
        List<Double> numeros = new ArrayList<>();
		
        System.out.println("Las notas deben estar entre 0 y 10");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número: " + (i + 1) + ": ");
            double n = console.readDoubleInRange(0, 10);
            numeros.add(n);
        }
        
        return numeros;
	}
	
	public double media(List<Double> numeros) {
		double suma = 0;
		
        for (double n : numeros) {
            suma += n;
        }
        
        return suma / numeros.size();
	}
	
	public void numInferiores(List<Double> numeros, double media) {
		Iterator<Double> it = numeros.iterator();
	    double numero;

	    while(it.hasNext()) {
	    		numero = it.next();
	    		if (numero<media) {
	    			System.out.println(numero);
	    			it.remove();
	    		}
	    }
	}
	
	public void show() {
		List<Double> numeros = leerNumeros();
		double media = media(numeros);
		
		System.out.printf("Calculamos la media: %.2f\n", media);
		
		System.out.println("Mostramos los menores de la media y los eliminamos: ");
		numInferiores(numeros, media);
		
		System.out.println("Numeros restantes:");
		System.out.println(numeros);
	}
	
	public static void main(String[] args) {
		new Ejercicio1().show();
	}

}
