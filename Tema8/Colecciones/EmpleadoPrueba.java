package Colecciones;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class EmpleadoPrueba {

	public static void main(String[] args) {
		int numeroEmple;
		Scanner teclado = new Scanner(System.in);
		HashSet<Empleado> empleados = new HashSet<Empleado>();
		Iterator<Empleado> iterador = empleados.iterator();

		System.out.println("Numero de empleados: ");
		numeroEmple = teclado.nextInt();

		for (int i = 0; i < numeroEmple; i++) {
			String nombre;
			double sueldo;
			System.out.println("Nombre del empleado: ");
			nombre = teclado.next();
			System.out.println("Sueldo del empleado: ");
			sueldo = teclado.nextDouble();

			if (empleados.add(new Empleado(nombre, sueldo))) {
				System.out.println("Empleado " + nombre + " añadido. ");
			} else {
				System.out.println("El empleado " + nombre + " no ha sido añadido. ");
			}

		}

	}

}
