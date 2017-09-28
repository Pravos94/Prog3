package FigurasGeometricas_2;

public final class Circulo extends FiguraGeometrica implements InterfazPlano, Dibujable {
	private double radio;

	public Circulo(double radio) {
		this.radio = radio;
	}

	@Override
	public double calcularArea() {
		return PI * radio * radio;
	}

	@Override
	public double calcularPerimetro() {
		return 2 * PI * radio;
	}

	@Override
	public void imprimirDatos() {
		System.out.print("Círculo de radio: " + radio + ", área: " + calcularArea());
		System.out.println(", perímetro: " + calcularPerimetro());

	}

	@Override
	public String toString() {
		return "Circulo [radio=" + radio + "]";
	}

	@Override
	public void Dibujar() {
		System.out.println("     *   *   ");
		System.out.println("   *       *   ");
		System.out.println("   *       *   ");
		System.out.println("     *   *   ");

	}

	@Override
	public void Rotar(double grados) {
		System.out.println("Se ha rotado un monton de estos grados: " + grados);

	}

}
