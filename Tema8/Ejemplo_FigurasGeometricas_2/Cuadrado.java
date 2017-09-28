package Ejemplo_FigurasGeometricas_2;

public final class Cuadrado implements FiguraGeometrica {
	private double lado;

	public Cuadrado(double lado) {
		this.lado = lado;
	}

	@Override
	public double calcularArea() {
		return lado * lado;
	}

	@Override
	public double calcularPerimetro() {
		return 4 * lado;
	}

	@Override
	public void imprimirDatos() {
		System.out.print("Cuadrado de lado: " + lado + ", área: " + calcularArea());
		System.out.println(", perímetro: " + calcularPerimetro());
	}
}
