package Colecciones_7;

import java.util.ArrayList;

public class Aula {

	Aula aula1;

	private ArrayList<Alumno> listaAlumnos = new ArrayList<>();

	public ArrayList<Alumno> getListaAlumnos() {
		return listaAlumnos;
	}

	public void setListaAlumnos(ArrayList<Alumno> listaAlumnos) {
		listaAlumnos.addAll(listaAlumnos);
	}

	public void imprimir(ArrayList<Alumno> listaAlum) {
		for (Alumno alum : listaAlumnos) {
			System.out.println(alum);
		}
	}

	public void imprimirOrdenadoApellido() {

	}

	public void imprimirOrdenAltura() {

	}

	public void imprimirOrdenNombre() {

	}

}
