package FigurasGeometricas_1;

public final class Cuadrado extends FiguraGeometrica {
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
		System.out.print("Cuadrado de lado: " + lado + ", �rea: " + calcularArea());
		System.out.println(", per�metro: " + calcularPerimetro());
	}

	@Override
	public String toString() {
		return "Cuadrado [lado=" + lado + "]";
	}
	
	
}
