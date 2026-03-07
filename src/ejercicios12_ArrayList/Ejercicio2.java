package ejercicios12_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ejercicio2 {
	
	// Realiza un método genérico que reciba una lista y la devuelva invertida.
	
	public <T> List<T> invertir(List<T> lista) {
		//se puede usar collections.reverse(lista);
		List<T> listaInvertida= new ArrayList<>();
		
		for(int i=lista.size()-1; i>=0; i--) {
			listaInvertida.add(lista.get(i));
		}
	    
		return listaInvertida;  
	}
	
	public <T> void mostrarLista(List<T> lista) { 
		for(int i=0; i<lista.size(); i++) {
			if (i == 0) {
				System.out.printf("%s", lista.get(i)); 
			} else {
				System.out.printf(", %s", lista.get(i)); 
			}

		}
		System.out.println();
	}
	
	public void show() {
		List<Integer> listaInteger = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
		List<String> listaString = new ArrayList<>(Arrays.asList("Hola", "que", "tal", "estas"));
		
		System.out.println("Lista de enteros:");
		mostrarLista(listaInteger);
		
		System.out.printf("\nLista de enteros invertida:\n");
		mostrarLista(invertir(listaInteger));
		
		System.out.printf("\nLista de palabras:\n");
		mostrarLista(listaString);
		
		System.out.printf("\nLista de String invertida:\n");
		mostrarLista(invertir(listaString)); 
	}
	
	public static void main(String[] args) {
		new Ejercicio2().show();
	}
	
}
