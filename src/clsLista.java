import javax.swing.DefaultListModel;

public class clsLista {
	public clsNodo inicio;
	private DefaultListModel<String> modelo = new DefaultListModel<String>();
	
	public clsLista() 
	{
		inicio=null;
	}
	public void agregar(String numero) 
	{
		if (inicio==null) 
		{
			inicio=new clsNodo(numero);
		}
		else {
			clsNodo aux;
			aux = inicio;
			inicio=new clsNodo(numero,aux);
			
		}
	}
	public String eliminar(int index) 
	{	
		clsNodo aux=inicio;
		String num="";
		num = inicio.getNumero();
		inicio = inicio.getReferencia();
		
		return num;
	}
   	public DefaultListModel<String> desplegar() {
		modelo.clear();
		clsNodo aux = inicio;
		
		while (aux != null) {
			modelo.addElement(aux.getNumero());
			aux=aux.getReferencia();
		}
		return modelo;
	}
}
