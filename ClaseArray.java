package ejercicio5;

import java.util.Scanner;

public class ClaseArray {
	private final int MINIMO = 56;
	private final int MAXIMO = 124;
	private final int LIMITE = 10;
	private int dato;
	private int indice = 10;
	private int[] array1 = new int[indice];

	public ClaseArray() {
		indice = 100;
		dato = 90;
		llenarArray();

	}

	public ClaseArray(int dato, int indice) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("introduce tamaño de array: ");
		this.indice = teclado.nextInt();
		System.out.println("introduce un numero a buscar: ");
		this.dato = teclado.nextInt();

		for (int i = 0; i < array1.length; i++) {
			System.out.println("introduce numero de posicion [" + i + "]: ");
			this.array1[i] = teclado.nextInt();
		}
	}

	public int[] llenarArray() {
		for (int i = 0; i < array1.length; i++) {
			array1[i] = (int) Math.floor((Math.random() * (MAXIMO - MINIMO + 1) + MINIMO));
		}
		return array1;
	}

	public int busquedaSecuencial(int dato) {
		int indic = -1;
		for (int i = 0; i < array1.length; i++) {
			if (array1[i] == dato) {
				indic = i;
				break;
			}
		}
		return indic;
	}

	public int[] busquedaSecuencialRepetidos(int dato) {
		final int POSICION = -1;
		int j = 0;
		int[] arrayPosiciones = new int[j];
		for (int i = 0; i < array1.length; i++) {
			if (array1[i] == dato) {
				arrayPosiciones[j] = i;
				j++;
			}
		}
		if (arrayPosiciones.length == 0) {
			arrayPosiciones[j] = POSICION;
		}
		return arrayPosiciones;
	}

	public void imprimir() {
		System.out.println("Array de " + array1.length + "posiciones");
		for (int i = 0; i < array1.length; i--) {
			for (int j = 0; j < LIMITE; j++) {
				System.out.print(array1[i]);
				i++;
			}

		}
	}

}
