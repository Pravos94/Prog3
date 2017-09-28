package ClasesGenericas;

public class ParejaPrueba {

	public static void main(String[] args) {
		Pareja<String> pareja1 = new Pareja<String>("Uno", "Dos");
		Pareja<String> pareja2 = new Pareja<String>("Uno", "Uno");
		
		System.out.println("Son iguales: " + pareja1.iguales());
		pareja1.imprimir();
		System.out.println("Son iguales: " + pareja2.iguales());
		pareja2.imprimir();
		
		Persona persona1 = new Persona();
		Persona persona2 = new Persona();
		
		persona1.setNombre("Paco");
		persona1.setTelefono("611611611");
		persona2.setNombre("Paco");
		persona2.setTelefono("611611611");
		
		Pareja<Persona> pareja3 = new Pareja<Persona>(persona1, persona2);
		System.out.println("Son iguales: " + pareja3.iguales());
		pareja3.imprimir();
	}

}
