package FigurasGeometricas_2;

public final class Rectangulo extends FiguraGeometrica implements InterfazPlano, Dibujable{
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

	@Override
	public String toString() {
		return "Rectangulo [base=" + base + ", altura=" + altura + "]";
	}
	
	@Override
	public void Dibujar() {
		System.out.println("   * * * * * * *   ");
		System.out.println("   *           *   ");
		System.out.println("   *           *   ");
		System.out.println("   *           *   ");
		System.out.println("   * * * * * * *   ");
	}

	@Override
	public void Rotar(double grados) {
		System.out.println("Se ha rotado un monton de estos grados: " + grados);

	}

}
