package Comparar;

import java.util.LinkedList;

public class Aula {
	private Alumno alumno1;
	private Alumno alumno2;
	private Alumno alumno3;
	private Alumno alumno4;
	LinkedList<Alumno> grupoAlumnos = new LinkedList<>();

	public Aula(Alumno alumno1, Alumno alumno2, Alumno alumno3, Alumno alumno4) {
		this.alumno1 = alumno1;
		this.alumno2 = alumno2;
		this.alumno3 = alumno3;
		this.alumno4 = alumno4;
	}

	public Alumno getAlumno1() {
		return alumno1;
	}

	public void setAlumno1(Alumno alumno1) {
		this.alumno1 = alumno1;
	}

	public Alumno getAlumno2() {
		return alumno2;
	}

	public void setAlumno2(Alumno alumno2) {
		this.alumno2 = alumno2;
	}

	public Alumno getAlumno3() {
		return alumno3;
	}

	public void setAlumno3(Alumno alumno3) {
		this.alumno3 = alumno3;
	}

	public Alumno getAlumno4() {
		return alumno4;
	}

	public void setAlumno4(Alumno alumno4) {
		this.alumno4 = alumno4;
	}

}
