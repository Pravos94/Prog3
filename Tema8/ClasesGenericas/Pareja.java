package ClasesGenericas;

public class Pareja<T> {
	private T elemento1;
	private T elemento2;

	public Pareja(T elemento1, T elemento2) {
		this.elemento1 = elemento1;
		this.elemento2 = elemento2;
	}

	public boolean iguales() {
		return elemento1.equals(elemento2);
	}

	@Override
	public String toString() {
		return "Pareja [elemento1=" + elemento1 + ", elemento2=" + elemento2 + "]";
	}

	public void imprimir() {
		System.out.println(toString());
	}

}
