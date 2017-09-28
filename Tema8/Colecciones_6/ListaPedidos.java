package Colecciones_6;

import java.util.LinkedList;

public class ListaPedidos {
	private LinkedList<Pedido> pedidos = new LinkedList<Pedido>();

	public ListaPedidos(LinkedList<Pedido> pedidos) {
		this.pedidos = pedidos;
	}

	public void imprimirPedidos() {
		for (Pedido pedido1 : pedidos) {
			System.out.println(pedido1.toString());
		}
	}

	public void borrarPedido() {
		for (Pedido pedido1 : pedidos) {
			System.out.println("Pedido: " + pedido1 + " eliminado. ");
			pedidos.removeFirst();

		}
	}

	public void añadirPedido(Pedido pedido1) {
		pedidos.add(pedido1);
	}
}
