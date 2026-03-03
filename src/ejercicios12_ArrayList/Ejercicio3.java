package ejercicios12_ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio3 {
	
	/*Realiza el siguiente menú para gestionar una lista de cadenas:
		1.Nueva lista
		2.Número de cadenas
		3.Añadir cadena
		4.Eliminar última cadena
		5.Contiene cadena
		6.Mostrar lista entera
		7.Salir
	En la opción 1, se limpia la lista dejándola vacía. 
	En la opción 5,  se pide una cadena al usuario y se le informa si dicha cadena está o no en la lista.*/
	
	public void menu() {
        System.out.println("\n--- MENÚ ---");
        System.out.println("1. Nueva lista");
        System.out.println("2. Número de cadenas");
        System.out.println("3. Añadir cadena");
        System.out.println("4. Eliminar última cadena");
        System.out.println("5. Contiene cadena");
        System.out.println("6. Mostrar lista entera");
        System.out.println("7. Salir");
        System.out.println("Opción: ");
	}
	
	public void show() {
		Scanner scanner = new Scanner(System.in);
		ConsoleInput console = new ConsoleInput(scanner);
		
        List<String> lista = new ArrayList<>();
        int opcion;

        do {
            menu();
            opcion = console.readInt();

            switch (opcion) {
                case 1 -> {
                    lista.clear();
                    System.out.println("Lista limpiada.");
                }

                case 2 -> System.out.printf("Número de cadenas: %d", lista.size());
                
                case 3 -> {
                    System.out.print("Introduce una cadena: ");
                    String cadena = console.readString();
                    lista.add(cadena);
                    System.out.println("Cadena añadida.");
                }

                case 4 -> {
                    if (lista.isEmpty()) {
                        System.out.println("La lista está vacía.");
                    } else {
                        String eliminada = lista.remove(lista.size() - 1);
                        System.out.printf("Eliminada: %s\n", eliminada);
                    }
                }

                case 5 -> {
                    System.out.print("Introduce cadena a buscar: ");
                    String buscar = console.readString();

                    if (lista.contains(buscar)) {
                        System.out.println("La cadena SÍ está en la lista.");
                    } else {
                        System.out.println("La cadena NO está en la lista.");
                    }
                }

                case 6 -> {
                    if (lista.isEmpty()) {
                        System.out.println("Lista vacía.");
                    } else {
                        System.out.println("Contenido de la lista:");
                        for (String s : lista) {
                            System.out.println(s);
                        }
                    }
                }

                case 7 -> System.out.println("Saliendo");

                default -> System.out.println("Opción no válida.");
            }

        } while (opcion != 7);
	}
	
	public static void main(String[] args) {
		new Ejercicio3().show();
	}
	
}
