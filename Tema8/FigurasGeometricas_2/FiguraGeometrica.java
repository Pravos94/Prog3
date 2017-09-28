package FigurasGeometricas_2;

public abstract class FiguraGeometrica {
	protected final double PI = Math.PI;
	protected int posicionX;
	protected int posicionY;
	protected String color;
	

	public abstract double calcularArea();

	public abstract double calcularPerimetro();

	public abstract void imprimirDatos();

}
