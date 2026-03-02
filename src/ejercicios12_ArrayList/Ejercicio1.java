package ejercicios12_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio1 {

	/* Crea un programa que:
		Lea 10 números enteros introducidos por el usuario y los almacene en un ArrayList.
		Calcule la media.
		Muestre los números inferiores a la media.*/
	
	public ArrayList<Double> leerNumeros() {
		Scanner scanner = new Scanner(System.in);
		ConsoleInput console = new ConsoleInput(scanner);
		
        ArrayList<Double> numeros = new ArrayList<>();
		
        System.out.println("Las notas deben estar entre 0 y 10");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número: " + (i + 1) + ": ");
            double n = console.readDoubleInRange(0, 10);
            numeros.add(n);
        }
        
        return numeros;
	}
	
	public double media(ArrayList<Double> numeros) {
		double suma = 0;
		
        for (double n : numeros) {
            suma += n;
        }
        
        return suma / numeros.size();
	}
	
	public void numInferiores(ArrayList<Double> numeros, double media) {
		for (double n : numeros) {
			if (n<media) {
				System.out.println(n);
			}
		}
	}
	
	public void show() {
		ArrayList<Double> numeros = leerNumeros();
		double media = media(numeros);
		
		System.out.printf("Calculamos la media: %.2f\n", media);
		
		System.out.println("Mostramos los menores de la media: ");
		numInferiores(numeros, media);
	}
	
	public static void main(String[] args) {
		new Ejercicio1().show();
	}

}
