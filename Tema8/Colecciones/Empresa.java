package Colecciones;

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
		for (Empleado empleado : empleados) {

		}

	}

	public void imprimirMinSueldo() {

	}

	public void imprimirMediaSueldos() {

	}

	public void imprimirDesviacionTipica() {
		double desviacion = 0;
		double media = mediaSueldos();

		for (Empleado emp : empleados) {
			desviacion += Math.pow((emp.getSueldo() - media), 2);
			System.out.println(desviacion /= empleados.size());

		}

	}

	public double mediaSueldos() {

		return 0;
	}

	public void subirSueldo() {

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
