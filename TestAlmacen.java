// Clase de prueba COMPLETAR EL CÓDIGO DEL MÉTODO procesar Opción 
	import java.util.Scanner;

	public class TestAlmacen {

		static public void main(String[] argv) {

			Almacen1 prueba = new Almacen1();
			Scanner sc = new Scanner(System.in);
			int opcion;
			int numero=0;

			mostrarMenu();
			opcion = sc.nextInt();
			while (opcion != 0) {
				procesarOpcion(opcion, numero, prueba);
				mostrarMenu();
				opcion = sc.nextInt();
			}
			sc.close();
			
		}

		static void mostrarMenu() {
			System.out.println("--- MENÚ DE  CONTROL DEL ALMACÉN -----");
			System.out.println(" 1.- Mostrar contenido del Almacén");
			System.out.println(" 2.- Poner un Valor  ");
			System.out.println(" 3.- Buscar un Valor ");
			System.out.println(" 4.- Borrar un Valor");
			System.out.println(" 5.- Contar posiciones ocupadas.");
			System.out.println(" 6.- Contar posiciones libres.");
			System.out.println(" 7.- Comprobar si el almacen esta lleno");
			System.out.println(" 0.- Terminar");
	            System.out.print(" Introduzca una opción:[1-6]:");
		}

		// Procesa la opción introducida operando sobre el objeto Almacen1
		static void procesarOpcion(int opcion, int numero, Almacen1 parAlmacen) {
			// Completar......

			switch (opcion) {
			
			case 1:
					System.out.println("||------------------------------||");
					System.out.println("||"+parAlmacen.toString()+"||");
					System.out.println("||------------------------------||");
					break;
			case 2: 
					if(parAlmacen.ponValor(numero) == true) {
						System.out.println("El valor ha sido introducido");
					}else {
						System.out.println("El valor no se puede introducir");
					}
					
					break;
			case 3: 
					if (parAlmacen.estaValor(numero) == false) {
						System.out.println("El valor que busca no esta en el almacen");
					}else {
						System.out.println("El valor que busca se encuentra en el almacen");
					}
					break;
			case 4:
				if (parAlmacen.sacarValor(numero) == true) {
					System.out.println("El valor ha sido borrado");
				}else {
					System.out.println("El valor no se encuentra en el almacen");
				}
				break;
			case 5:
					System.out.println("Hay " +parAlmacen.numPosicionesOcupadas() +" posiciones ocupadas");
					break;
			case 6:
				  	System.out.println(" Posiciones libres = " + parAlmacen.numPosicionesLibres());
				  	break;
			case 7: 
					if (parAlmacen.estaLleno() == true) {
						System.out.println("Está lleno");
					}else {
						System.out.println("Hay hueco");
					}
				
			}

		}

	}