package Colecciones_7;

public class Alumno {
	private String nombre;
	private String apellidos;
	private int telefono;
	private double altura;

	public Alumno(String nombre, String apellidos, int telefono, double altura) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.altura = altura;
	}

	public String toString() {
		return "Alumno [nombre=" + nombre + ", apellidos=" + apellidos + ", telefono=" + telefono + ", altura=" + altura
				+ "]";
	}

}
