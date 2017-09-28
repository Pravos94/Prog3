package FigurasGeometricas_1;

public abstract class FiguraGeometricaPrueba {

	public static void main(String[] args) {
		FiguraGeometrica[] figuraGeometrica = null;

		Circulo circulo1 = new Circulo(5.4);
		Cuadrado cuadrado1 = new Cuadrado(8.2);
		Triangulo triangulo1 = new Triangulo(4, 8, 8.5);
		Rectangulo rectangulo1 = new Rectangulo(5, 4);
		Rombo rombo1 = new Rombo(5, 3, 4);

		figuraGeometrica[0] = circulo1;
		figuraGeometrica[1] = cuadrado1;
		figuraGeometrica[2] = triangulo1;
		figuraGeometrica[3] = rectangulo1;
		figuraGeometrica[4] = rombo1;

		for (int i = 0; i < figuraGeometrica.length; i++) {
			figuraGeometrica[i].imprimirDatos();
			figuraGeometrica[i].toString();
		}

	}

}
