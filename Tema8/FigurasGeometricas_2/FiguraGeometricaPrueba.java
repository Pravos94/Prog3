package FigurasGeometricas_2;

public abstract class FiguraGeometricaPrueba {

	public static void main(String[] args) {

		Circulo circulo1 = new Circulo(5.4);
		Cuadrado cuadrado1 = new Cuadrado(8.2);
		Triangulo triangulo1 = new Triangulo(4, 8, 8.5);
		Rectangulo rectangulo1 = new Rectangulo(5, 4);
		Rombo rombo1 = new Rombo(5, 3, 4);

		Dibujable[] dibujable1 = { circulo1, cuadrado1, triangulo1, rectangulo1, rombo1 };

		for (int i = 0; i < dibujable1.length; i++) {
			dibujable1[i].Dibujar();
			dibujable1[i].Rotar(8);
		}

	}

}
