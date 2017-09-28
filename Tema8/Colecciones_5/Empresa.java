package Colecciones_5;

import java.util.HashSet;
import java.util.Iterator;

public class Empresa {
	private final float PORCENTAJE_SUBIDA = 12.39F;
	private final float MIN_SUELDO = 555.92F;
	HashSet<Empleado> empleados = new HashSet<Empleado>();
	Iterator<Empleado> iterador = empleados.iterator();

	public Empresa(HashSet<Empleado> empleados, Iterator<Empleado> iterador) {
		this.empleados = empleados;
		this.iterador = iterador;
	}

	public void imprimirMaxSueldo() {
		Empleado empleadoMaximo = null;
		for (Empleado emp : empleados) {
			if (emp.getSueldo() > empleadoMaximo.getSueldo()) {
				empleadoMaximo = emp;
			}
		}
		System.out.println("Maximo sueldo: " + empleadoMaximo.toString());
	}

	public void imprimirMinSueldo() {
		Empleado empleadoMinimo = null;
		for (Empleado emp : empleados) {
			if (emp.getSueldo() < empleadoMinimo.getSueldo() || empleadoMinimo == null) {
				empleadoMinimo = emp;
			}
		}
		System.out.println("Maximo sueldo: " + empleadoMinimo.toString());
	}

	public void imprimirMediaSueldos() {
		System.out.println("Media de los sueldos: " + mediaSueldos());
	}

	public void imprimirDesviacionTipica() {
		double desviacion = 0;
		double media = mediaSueldos();

		for (Empleado emp : empleados) {
			desviacion += Math.pow((emp.getSueldo() - media), 2);
		}
		System.out.println(desviacion /= empleados.size());
	}

	public double mediaSueldos() {
		double suma = 0;
		for (Empleado emp : empleados) {
			suma += emp.getSueldo();
		}
		return suma / empleados.size();
	}

	public void subirSueldo() {
		for (Empleado emp : empleados) {
			if (emp.getSueldo() < MIN_SUELDO) {
				emp.setSueldo(emp.getSueldo() + (emp.getSueldo() * PORCENTAJE_SUBIDA) / 100);
			}
		}
	}

	public void imprimirEmpleadosBucle() {
		for (Empleado emp : empleados) {
			System.out.println(emp.toString());
		}
	}

	public void imprimirEmpleadosIterador() {
		while (iterador.hasNext()) {
			System.out.println(iterador.next());
		}
	}
}
