package FigurasGeometricas_2;

public final class Cuadrado extends FiguraGeometrica implements InterfazPlano, Dibujable {
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

	@Override
	public String toString() {
		return "Cuadrado [lado=" + lado + "]";
	}

	@Override
	public void Dibujar() {
		System.out.println("   * * * * *   ");
		System.out.println("   *       *   ");
		System.out.println("   *       *   ");
		System.out.println("   *       *   ");
		System.out.println("   * * * * *   ");

	}

	@Override
	public void Rotar(double grados) {
		System.out.println("Se ha rotado un monton de estos grados: " + grados);

	}

}
