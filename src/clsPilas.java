import javax.swing.DefaultListModel;

public class clsPilas {
	public clsLista miLista;
	int tamaño;

	public clsPilas() {
		miLista = new clsLista();
	}

	public void push(String dato) {
		miLista.agregar(dato);
		tamaño++;
	}

	public String pop() {
		// String eliminado= miLista.inicio.getNumero();
		tamaño--;
		return miLista.eliminar(0);
	}

	public String cima() {
		if (miLista.inicio == null) {
			return null;
		} else {
			return miLista.inicio.getNumero();
		}

	}

	public DefaultListModel recuperarPila() {
		return miLista.desplegar();
	}
}
