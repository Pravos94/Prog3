package Colecciones_6;

import java.util.LinkedList;
import java.util.Scanner;

import Colecciones_5.Empleado;

public class Prueba {

	public static void main(String[] args) {
		int numeroPedidos;
		Cliente cliente1 = null;
		ListaPedidos listaPedidos1 = null;
		LinkedList<Pedido> pedidos = new LinkedList<Pedido>();

		Scanner teclado = new Scanner(System.in);

		System.out.println("Numero de pedidos: ");
		numeroPedidos = teclado.nextInt();

		for (int i = 0; i < numeroPedidos; i++) {
			String articulo;
			double precio;
			String nombreCliente;
			int telefono;

			System.out.println("Nombre del cliente: ");
			nombreCliente = teclado.next();
			System.out.println("Telefono del cliente: ");
			telefono = teclado.nextInt();
			cliente1 = new Cliente(nombreCliente, telefono);

			System.out.println("Nombre del articulo: ");
			articulo = teclado.next();
			System.out.println("Precio del articulo: ");
			precio = teclado.nextDouble();

			pedidos.add(new Pedido(cliente1, articulo, precio));
			System.out.println("Cliente " + cliente1.getNombre() + " añadido. ");

		}
		teclado.close();
		listaPedidos1.borrarPedido();

	}

}
