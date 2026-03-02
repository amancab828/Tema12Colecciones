package ejercicios12_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio2 {
	
	// Realiza un método genérico que reciba una lista y la devuelva invertida.
	
	public ArrayList<Integer> leerNumeros() {
		Scanner scanner = new Scanner(System.in);
		ConsoleInput console = new ConsoleInput(scanner);
		
        ArrayList<Integer> numeros = new ArrayList<>();
        int size;
		
        System.out.print("Introduzca el tamaño de la lista: ");
        size = console.readInt();
        for (int i = 0; i < size; i++) {
            System.out.print("Número: " + (i + 1) + ": ");
            int n = console.readInt();
            numeros.add(n);
        }
        
        return numeros;
	}
	
	public ArrayList<Integer> invertirLista(ArrayList<Integer> numeros){
		ArrayList<Integer> numerosInvertido = new ArrayList<>();

		for (int i = numeros.size() - 1; i >= 0; i--) {
			numerosInvertido.add(numeros.get(i));
		}
		
		return numerosInvertido;
	}
	
	public void show() {
		ArrayList<Integer> numeros = leerNumeros();
		ArrayList<Integer> numerosInvertidos = invertirLista(numeros);
		
		for (int n : numerosInvertidos) {
			System.out.println(n);
		}
	}
	
	public static void main(String[] args) {
		new Ejercicio2().show();
	}
	
}
