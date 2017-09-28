package ControlesWindows_Incompleto;

public abstract class ControlesWindows {
	protected String abrir;
	protected String pulsar;

	public ControlesWindows(String abrir, String pulsar) {
		this.abrir = abrir;
		this.pulsar = pulsar;
	}

	public abstract void Cerrar();

	public abstract void Maximizar();

	public abstract void Minimizar();

}
