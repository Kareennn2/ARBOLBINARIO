package Clases;

import java.util.Scanner;

public class ArbolBinarioOrdenado {

	public static void main(String[] args) {

		ArbolBinario arbol = new ArbolBinario();
		Scanner scanner = new Scanner(System.in);

		int opcion = 0;

		while (opcion != 5) {

			System.out.println("\n==============================");
			System.out.println("    Menú del Árbol Binario");
			System.out.println("==============================");
			System.out.println("1. Insertar números");
			System.out.println("2. Mostrar números en el árbol");
			System.out.println("3. Imprimir números en orden ascendente");
			System.out.println("4. Buscar número en el árbol");
			System.out.println("5. Salir");
			System.out.println("==============================");
			System.out.print("Selecciona una opción: ");
			opcion = scanner.nextInt();

			switch (opcion) {
			case 1:
				// Opción 1: Insertar números
				System.out.print("\nIntroduce un número para insertar: ");
				int valorInsertar = scanner.nextInt();
				boolean insertado = arbol.insertar(valorInsertar);
				if (!insertado) {
					System.out.println("\n❌ El número ya existe en el árbol. Inténtalo con otro número.");
				} else {
					System.out.println("\\n✔️ Número insertado correctamente.");
				}
				break;

			case 2:
				// Opción 2: Mostrar números en el árbol (sin ordenar, solo existencia)
				System.out.println("\n📊 Los números están presentes en el árbol (se muestran en orden ascendente):");
				arbol.recorridoInOrden();
				System.out.println();
				break;

			case 3:
				// Opción 3: Imprimir números en orden ascendente
				System.out.println("\n⬆️ Números en el árbol en orden ascendente:");
				arbol.recorridoInOrden();
				System.out.println();
				break;

			case 4:
				// Opción 4: Buscar número en el árbol
				System.out.print("\n🔍 Introduce un número para buscar: ");
				int valorBuscar = scanner.nextInt();
				boolean encontrado = arbol.buscar(valorBuscar);
				if (encontrado) {
					System.out.println("\n✔️ El número " + valorBuscar + " está en el árbol.");
				} else {
					System.out.println("\n❌ El número " + valorBuscar + " NO está en el árbol.");
				}
				break;

			case 5:
				// Opción 5: Salir
				System.out.println("\n👋 Saliendo del programa...");
				break;

			default:
				// Opción inválida
				System.out.println("\n⚠️ Opción no válida. Inténtalo de nuevo.");
			}
		}

		scanner.close();

	}

}
