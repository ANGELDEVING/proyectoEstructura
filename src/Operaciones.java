import java.lang.reflect.Method;
import java.rmi.server.Operation;
import java.util.Iterator;

public class Operaciones {
	// (1*(2-3))+(4+5)
	// 123-*45++
	clsPilas objpilas;

	public Operaciones() {
		objpilas = new clsPilas();
	}

	public double jerarquia(String datos) {
		double indiceEntrada = 0;
		switch (datos) {
		case "^":
			indiceEntrada = 10;
			break;
		case "(":
			indiceEntrada = 40;
			break;
		case "*":
		case "/":
			indiceEntrada = 20;
			break;
		case "+":
		case "-":
			indiceEntrada = 30;
			break;
		default:
			break;
		}
		return indiceEntrada;
	}

	public String Postfijo(String salidaPos) {
		String OperacionFinal = "";
		for (int i = 0; i < salidaPos.length(); i++) {
			char ubicacion = salidaPos.charAt(i);
			String pos;
			pos = Character.toString(ubicacion);

			if (ubicacion == '(' || ubicacion == ' ') {

				objpilas.push(pos);

			} else if (ubicacion == ')' || ubicacion == '(') {
				String aux = objpilas.cima();
				while (!aux.equals( "(")) {
					OperacionFinal = OperacionFinal + objpilas.pop();
					aux = objpilas.cima();
				}
				objpilas.pop();
			}

			else if (Character.isDigit(ubicacion)) {
				OperacionFinal += ubicacion;
			}

			else if (Character.isDigit(ubicacion) == false && ubicacion != ')') {
				if (objpilas.cima() != null) {
					double x = jerarquia(pos);
					double y = jerarquia(objpilas.cima());

					if (x <= y) {
						objpilas.push(pos);
					} else {
						while (x > y) {
							OperacionFinal = OperacionFinal + objpilas.pop();
							y = jerarquia(objpilas.cima());
						}
					}
				} else {
					objpilas.push(pos);

				}
			}

		}
		while (objpilas.tamaño != 0) {
			OperacionFinal += objpilas.pop();
		}
		return OperacionFinal;
	}

}