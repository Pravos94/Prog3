package Ejemplo_FigurasGeometricas_1;

public final class Rombo extends FiguraGeometrica {
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

}
