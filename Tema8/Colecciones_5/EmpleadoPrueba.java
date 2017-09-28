package Colecciones_5;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class EmpleadoPrueba {

	public static void main(String[] args) {
		int numeroEmple;
		Empresa empresa1 = null;
		Scanner teclado = new Scanner(System.in);
		HashSet<Empleado> empleados = new HashSet<Empleado>();

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
		System.out.println("----- Desviacion tipica -------");
		empresa1.imprimirDesviacionTipica();
		System.out.println("----- Maximo sueldo -------");
		empresa1.imprimirMaxSueldo();
		System.out.println("----- Minimo sueldo -------");
		empresa1.imprimirMinSueldo();
		System.out.println("----- Media de los sueldos -------");
		empresa1.imprimirMediaSueldos();
		System.out.println("----- Empleados bucle -------");
		empresa1.imprimirEmpleadosBucle();
		System.out.println("----- Subimos el sueldo -------");
		empresa1.subirSueldo();
		System.out.println("----- Empleados con sueldos subidos -------");
		empresa1.imprimirEmpleadosIterador();
		teclado.close();
	}

}
