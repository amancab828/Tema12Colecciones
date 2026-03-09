package ejercicios12_ListIterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

import ejercicios12_ArrayList.ConsoleInput;

public class Ejercicio1 {
	
	public void menu() {
        System.out.println("\n--- MENÚ ---");
        System.out.println("1. Mostrar la lista");
        System.out.println("2. Mostrar siguiente");
        System.out.println("3. Mostrar anterior");
        System.out.println("4. Añadir elemento");
        System.out.println("5. Eliminar el último mostrado");
        System.out.println("6. Sustituir el último mostrado");
        System.out.println("7. Salir");
        System.out.println("Opción: ");
	}
	
	public void show() {
		Scanner scanner = new Scanner(System.in);
		ConsoleInput console = new ConsoleInput(scanner);
		
		List<Float> lista = new ArrayList<>(List.of(5.6f, 1.5f, 6.9f, 7.4f));
		ListIterator<Float> it  = lista.listIterator();
        int opcion;

        do {
            menu();
            opcion = console.readInt();

            switch (opcion) {
                case 1 -> System.out.println(lista);

                case 2 -> {
                    if(!it.hasNext()) {
                        it = lista.listIterator();  // Volver al principio
                    }
                    System.out.println(it.next());
                }
                
                case 3 -> {
                    if(!it.hasPrevious()) {
                        it = lista.listIterator(lista.size());  // Volver al final
                    }
                    System.out.println(it.previous());
                }

                case 4 -> {
                    System.out.print("Introduce cadena a añadir: ");
                    float añadirCadena = console.readFloat();
                    
                    it.add(añadirCadena);
                }

                case 5 -> {
                    try {
                        it.remove();
                    } catch (IllegalStateException e) {
                        System.out.println("Primero debes mostrar un elemento.");
                    }
                }

                case 6 -> {
                    try {
                        System.out.print("Introduce por lo que quiere cambiar la cadena: ");
                        float cambiarCadena = console.readFloat();
                        it.set(cambiarCadena);
                    } catch (IllegalStateException e) {
                        System.out.println("Primero debes mostrar un elemento con siguiente o anterior.");
                    }
                }

                case 7 -> System.out.println("Saliendo");

                default -> System.out.println("Opción no válida.");
            }

        } while (opcion != 7);
	}
	
	public static void main(String[] args) {
		new Ejercicio1().show();
	}

}
