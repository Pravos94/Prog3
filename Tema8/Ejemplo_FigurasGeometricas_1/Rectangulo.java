package Ejemplo_FigurasGeometricas_1;

public final class Rectangulo extends FiguraGeometrica {
	private double base;
	private double altura;

	public Rectangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}

	@Override
	public double calcularArea() {
		return base * altura;
	}

	@Override
	public double calcularPerimetro() {
		return 2 * (base + altura);
	}

	@Override
	public void imprimirDatos() {
		System.out.print("Rectangulo de base: " + base + ", altura: " + altura + ", área: " + calcularArea());
		System.out.println(", perímetro: " + calcularPerimetro());

	}

}
