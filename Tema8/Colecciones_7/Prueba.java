package Colecciones_7;

import java.util.ArrayList;
import java.util.Scanner;

public class Prueba {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int introducir = 1;
		String nombre;
		String apellidos;
		int telefono;
		double altura;
		ArrayList<Alumno> listaAlumnos = new ArrayList<>();

		while (introducir == 1) {
			System.out.println("Nombre del alumno: ");
			nombre = teclado.next();
			System.out.println("Apellidos: ");
			apellidos = teclado.next();
			System.out.println("Telefono: ");
			telefono = teclado.nextInt();
			System.out.println("Altura: ");
			altura = teclado.nextDouble();
			listaAlumnos.add(new Alumno(nombre, apellidos, telefono, altura));
			System.out.println("si quiere añadir otro alumno escriba: 1 ");
			introducir = teclado.nextInt();
		}

		teclado.close();

		for (Alumno alum : listaAlumnos) {
			System.out.println(alum);
		}

	}

}
