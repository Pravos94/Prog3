package Colecciones_6;

public class Pedido {
	private Cliente cliente1;
	private String articulo;
	private double precio;
	
	public Pedido(Cliente cliente1, String articulo, double precio) {
		this.cliente1 = cliente1;
		this.articulo = articulo;
		this.precio = precio;
	}
	public Cliente getCliente1() {
		return cliente1;
	}
	public void setCliente1(Cliente cliente1) {
		this.cliente1 = cliente1;
	}
	public String getArticulo() {
		return articulo;
	}
	public void setArticulo(String articulo) {
		this.articulo = articulo;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "Pedido [cliente1=" + cliente1 + ", articulo=" + articulo + ", precio=" + precio + "]";
	}
	
}