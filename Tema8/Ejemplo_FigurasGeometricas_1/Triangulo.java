package Ejemplo_FigurasGeometricas_1;

public final class Triangulo extends FiguraGeometrica {
	private double base;
	private double altura;
	private double lado;

	public Triangulo(double base, double altura, double lado) {
		this.base = base;
		this.altura = altura;
		this.lado = lado;
	}

	@Override
	public double calcularArea() {
		return (base * altura) / 2;
	}

	@Override
	public double calcularPerimetro() {
		double perimetro = 0;
		if (lado != 0) {
			perimetro = 3 * lado;
		} else {
			perimetro = 2 * lado + base;
		}
		return perimetro;
	}

	@Override
	public void imprimirDatos() {
		System.out.print(
				"Triangulo de lado: " + lado + ",base: " + base + ", altura: " + altura + ", área: " + calcularArea());
		System.out.println(", perímetro: " + calcularPerimetro());
	}

}
