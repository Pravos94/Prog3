package FigurasGeometricas_1;

public final class Circulo extends FiguraGeometrica {
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
		System.out.print("C�rculo de radio: " + radio + ", �rea: " + calcularArea());
		System.out.println(", per�metro: " + calcularPerimetro());

	}

	@Override
	public String toString() {
		return "Circulo [radio=" + radio + "]";
	}
	
	

}
