package ejercicios12_ColeccionesSinDuplicados;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Ejercicio1 {
	/*Una academia quiere registrar a los alumnos que se han matriculado en un curso. De cada alumno se 
	 almacena su dni, nombre y apellidos. Realiza un programa que permita al usuario registrar alumnos. 
	 No se permiten duplicados: si un alumno ya está registrado (mismo dni), no se volverá a guardar.

	A continuación, el programa debe mostrar todos los alumnos de dos maneras:
		- Sin orden garantizado.
		- Manteniendo el orden de inserción. 
	
	A continuación, el programa le solicita al usuario un dni de un alumno para eliminarlo de la academia. Vuelve a 
	mostrar los datos de todos los alumnos para confirmar que efectivamente se ha eliminado.*/
	
	public List<Alumno> crearAlumnos() {
		List<Alumno> alumnos = new ArrayList<>();
		
		alumnos.add(new Alumno("Antonio", "Mancilla Cabeza", "12345678Z"));
		alumnos.add(new Alumno("Antoñito", "Cabeza", "12345678Z"));
		
		alumnos.add(new Alumno("Pepe", "Garcia", "98765432A"));
		alumnos.add(new Alumno("Pepito", "Cabeza", "98765432A"));
		
		alumnos.add(new Alumno("Antonio II", "Rodriguez", "123"));
		alumnos.add(new Alumno("Manolo", "Fernandez", "987"));
		alumnos.add(new Alumno("Miguel", "Sanchez", "23131534"));
		alumnos.add(new Alumno("Fernando", "Garcia", "12313"));
		alumnos.add(new Alumno("Pau", "Perez", "123131"));
		alumnos.add(new Alumno("Pedro", "Jimene", "1412236D"));
		
		return alumnos;
	}
	
	public void sinOrden(List<Alumno> alumnos){
		Set<Alumno> alumnosSet = new HashSet<>(alumnos);
		
		for (Alumno a : alumnosSet) {
			System.out.println(a);
		}
	}
	
	public void conOrden(List<Alumno> alumnos){
		Set<Alumno> alumnosSet = new LinkedHashSet<>(alumnos);
		
		for (Alumno a : alumnosSet) {
			System.out.println(a);
		}
	}
	
	public void eliminarAlumnoDni(List<Alumno> alumnos, String dni) {
	    Iterator<Alumno> it = alumnos.iterator();
	    while(it.hasNext()) {
	        Alumno a = it.next();
	        if(a.getDni().equals(dni)) {
	            it.remove();
	        }
	    }
	}
	
	public void show(){
		Scanner scanner = new Scanner(System.in);
		ConsoleInput console = new ConsoleInput(scanner);
		List<Alumno> alumnos = crearAlumnos();
		String dniEliminar;
		
		System.out.println("Alumnos sin orden: ");
		sinOrden(alumnos);
		
		System.out.println("\n==============\n");
		
		System.out.println("Alumnos con orden: ");
		conOrden(alumnos);
		
		System.out.println("\n==============\n");
		
		System.out.println("Introduzca el dni a eliminar");
        dniEliminar = console.readString();
        eliminarAlumnoDni(alumnos, dniEliminar);
        
		for (Alumno a : alumnos) {
			System.out.println(a);
		}
	}
	
	public static void main(String[] args) {
		new Ejercicio1().show();
	}

}
