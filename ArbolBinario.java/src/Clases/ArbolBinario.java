package Clases;

public class ArbolBinario {
	private Nodo raiz;

	// Constructor: inicializa el árbol sin ningún nodo (raíz vacía)
	public ArbolBinario() {
		raiz = null;
	}

	// Método público para insertar un nuevo valor en el árbol
	public boolean insertar(int valor) {
		if (buscar(valor)) {
			return false; // Si el valor ya está en el árbol, no lo inserta
		} else {
			raiz = insertarRec(raiz, valor);
			return true;
		}
	}

	// Método recursivo para insertar un nuevo valor en el árbol binario
	private Nodo insertarRec(Nodo raiz, int valor) {
		// Si el árbol está vacío, crea un nuevo nodo
		if (raiz == null) {
			return new Nodo(valor); // Usamos el constructor de Nodo
		}

		// Recorrido del árbol de acuerdo al valor
		if (valor < raiz.getValor()) {
			raiz.setIzquierdo(insertarRec(raiz.getIzquierdo(), valor));
		} else if (valor > raiz.getValor()) {
			raiz.setDerecho(insertarRec(raiz.getDerecho(), valor));
		}

		return raiz;
	}

	// Método para recorrer el árbol en orden (in-order traversal)
	public void recorridoInOrden() {
		recorridoInOrdenRec(raiz);
	}

	// Método recursivo para el recorrido en orden
	private void recorridoInOrdenRec(Nodo raiz) {
		if (raiz != null) {
			recorridoInOrdenRec(raiz.getIzquierdo()); // Primero, hijo izquierdo
			System.out.print(raiz.getValor() + " "); // Luego, el nodo actual
			recorridoInOrdenRec(raiz.getDerecho()); // Finalmente, hijo derecho
		}
	}

	// Método para buscar un número en el árbol
	public boolean buscar(int valor) {
		return buscarRec(raiz, valor);
	}

	// Método recursivo para buscar un valor en el árbol
	private boolean buscarRec(Nodo raiz, int valor) {
		if (raiz == null) {
			return false; // No se encontró el valor
		}

		if (raiz.getValor() == valor) {
			return true; // Valor encontrado
		}

		// Buscar en el subárbol izquierdo o derecho dependiendo del valor
		if (valor < raiz.getValor()) {
			return buscarRec(raiz.getIzquierdo(), valor);
		} else {
			return buscarRec(raiz.getDerecho(), valor);
		}
	}

}
