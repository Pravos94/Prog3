package ControlesWindows;

public class Ventana extends ControlesWindows implements Dibujable, InterfazPlano {

	public Ventana(String abrir, String pulsar) {
		super(abrir, pulsar);
	}

	@Override
	public void Dibujar() {
		System.out.println(".... Se ha dibujado ...");

	}

	@Override
	public void Rotar(double grados) {
		System.out.println("Rotar ");

	}

	@Override
	public void Cerrar() {
		System.out.println(" Cierra la ventana. ");

	}

	@Override
	public void Maximizar() {
		System.out.println("Ventana más grande ");

	}

	@Override
	public void Minimizar() {
		System.out.println("La ventana se ha minimizado ");

	}

}
