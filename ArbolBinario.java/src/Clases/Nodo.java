package Clases;

public class Nodo {
	int valor;
	Nodo izquierdo;
	Nodo derecho;

	// Constructor que inicializa solo el valor del nodo
	public Nodo(int valor) {
		this.valor = valor;
		this.izquierdo = null;
		this.derecho = null;
	}

	// Constructor que inicializa con valor y nodos hijos
	public Nodo(int valor, Nodo izquierdo, Nodo derecho) {
		this.valor = valor;
		this.izquierdo = izquierdo;
		this.derecho = derecho;
	}

	// Getters y setters para el atributo 'valor'
	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	// Getters y setters para el nodo izquierdo
	public Nodo getIzquierdo() {
		return izquierdo;
	}

	public void setIzquierdo(Nodo izquierdo) {
		this.izquierdo = izquierdo;
	}

	// Getters y setters para el nodo derecho
	public Nodo getDerecho() {
		return derecho;
	}

	public void setDerecho(Nodo derecho) {
		this.derecho = derecho;
	}

	// Método que verifica si el nodo es hoja (no tiene hijos)
	public boolean esHoja() {
		return (this.izquierdo == null && this.derecho == null);
	}

	// Método para representar el nodo como cadena
	@Override
	public String toString() {
		return "Nodo{" + "valor=" + valor + ", izquierdo=" + (izquierdo != null ? izquierdo.valor : "null")
				+ ", derecho=" + (derecho != null ? derecho.valor : "null") + '}';
	}

}
