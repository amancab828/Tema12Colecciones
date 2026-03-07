package ejercicios12_ColeccionesSinDuplicados;

public class Alumno {
	private String nombre;
	private String dni;
	private String apellidos;
	
	public Alumno(String nombre, String apellidos, String dni){
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.dni=dni;
	}
	
	public String getDni(){
		return dni;
	}
	
	// Tenemos que sobreescribir equals, seguimos su comportamiento esperado
	@Override
	public boolean equals(Object obj) {
		// Comprueba si dos objetos son el mismo en memoria
	    if (this == obj) {
	        return true;
	    }
	    
	    // Si el objeto se compara con null, no pueden ser iguales
	    if (obj == null) {
	        return false;
	    }
	    
	    // Comprueba si el objeto es del mismo tipo
	    if (!(obj instanceof Alumno)) {
	        return false;
	    }
	    
	    // Casting, conversión de tipo
	    Alumno other = (Alumno) obj;

	    // Se devuelve la lógica del equals
	    return dni.equals(other.dni);
	}
	
	@Override
	public int hashCode() {
	    return dni.hashCode();
	}
	
    @Override
    public String toString() {
    		return String.format("%s, %s, %s", nombre, apellidos, dni);
    }
}
