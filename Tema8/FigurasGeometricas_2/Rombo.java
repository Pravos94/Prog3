package FigurasGeometricas_2;

public final class Rombo extends FiguraGeometrica implements InterfazPlano, Dibujable{
	private double diametroMayor;
	private double diametroMenor;
	private double lado;

	public Rombo(double diametroMayor, double diametroMenor, double lado) {
		this.diametroMayor = diametroMayor;
		this.diametroMenor = diametroMenor;
		this.lado = lado;
	}

	@Override
	public double calcularArea() {
		return (diametroMayor * diametroMenor) / 2;
	}

	@Override
	public double calcularPerimetro() {
		return 4 * lado;
	}

	@Override
	public void imprimirDatos() {
		System.out.print("Rombo de lado: " + lado + ", diametro mayor: " + diametroMayor + ", diametro menor: "
				+ diametroMenor + ", área: " + calcularArea());
		System.out.println(", perímetro: " + calcularPerimetro());
	}

	@Override
	public String toString() {
		return "Rombo [diametroMayor=" + diametroMayor + ", diametroMenor=" + diametroMenor + ", lado=" + lado + "]";
	}
	
	@Override
	public void Dibujar() {
		System.out.println("       *    ");
		System.out.println("     *   *   ");
		System.out.println("    *     *   ");
		System.out.println("     *   *   ");
		System.out.println("       *    ");


	}

	@Override
	public void Rotar(double grados) {
		System.out.println("Se ha rotado un monton de estos grados: " + grados);

	}
	

}
