
public class clsNodo {
	private String numero;
	private clsNodo referencia;
	
	public clsNodo(){ //Constructores
		this.numero="";
		this.referencia=null;
	}
	public clsNodo(String numero1, clsNodo referencia1) {
		this.numero=numero1;
		this.referencia=referencia1;
	}
	public clsNodo(String numero2) {
		this.numero=numero2;
		this.referencia=null;
	}
	
	public String getNumero() {
		return numero;
	}
	public clsNodo getReferencia() {
		return referencia;
	}
	public void setNumero(String numero3) {
		this.numero=numero3;
		
	}
	public void setReferencia(clsNodo referencia2) {
		this.referencia=referencia2;
	}
	
}


