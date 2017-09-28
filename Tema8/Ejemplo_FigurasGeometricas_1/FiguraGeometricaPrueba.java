package Ejemplo_FigurasGeometricas_1;

public abstract class FiguraGeometricaPrueba {

	public static void main(String[] args) {
		Circulo circulo1 = new Circulo(5.4);
		Cuadrado cuadrado1 = new Cuadrado(8.2);
		Triangulo triangulo1 = new Triangulo(4, 8, 8.5);

		circulo1.imprimirDatos();
		cuadrado1.imprimirDatos();
		triangulo1.imprimirDatos();
	}

}
