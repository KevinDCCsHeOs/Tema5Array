package ArrayBidimensional;

import EntradaSalida.Tools;
import ArrayUnidimen.Metodos;

public class AlmacenarDatosTabla {
	private Object matriz[][];
	private byte i, j; //i filas y j columnas
	public AlmacenarDatosTabla(byte m, byte n) {
		matriz = new Object[m][n];
		i=-1;j=-1;
	}
	public boolean matrizVacia() {
		return (i==-1 && j==-1);
	}
	public boolean isSpacioMatriz() {
		return (i<matriz.length && j<matriz[0].length);
	}
	public void leerFilas() {
		byte k=0,l=0;
		if (isSpacioMatriz()) {
			for(k=(byte) (i+1);k<matriz.length;k++) {
				for (l=(byte) (j+1);l<matriz[0].length;l++) {
					matriz[k][l]=Tools.leerEntero("Introduce el valor que se almacenara en \nla columna "+k+
							" y fila "+l+"\n"+"entre "+Integer.MIN_VALUE+" y"+Integer.MAX_VALUE);
				}
			}
			i=k;j=l;
		}
	}
	public String verMatriz() {
		String cad="";
		for(byte k=0;k<matriz.length;k++) {
			for (byte l=0;l<matriz[0].length;l++) {
				cad+="|  "+matriz[k][l]+"  |";
			}
			cad+="\n";
		}
		return cad;
	}
	public void leerColumnas() {
		byte k=0,l=0;
		if (isSpacioMatriz()) {
			for(l=(byte) (i+1);l<matriz[0].length;l++) {
				for (k=(byte) (j+1);k<matriz.length;k++) {
					matriz[k][l]=Tools.leerEntero("Introduce el valor que se almacenara en \nla columna "+k+
							" y fila "+l+"\n"+"entre "+Integer.MIN_VALUE+" y"+Integer.MAX_VALUE);
				}
			}
			i=k;j=l;
		}
	}
	public void Aleatorios() {
		byte k=0,l=0;
		if (isSpacioMatriz()) {
			for(k=(byte) (i+1);k<matriz.length;k++) {
				for (l=(byte) (j+1);l<matriz[0].length;l++) {
					matriz[k][l]=(byte)(1+Math.random()*100);
				}
			}
			i=k;j=l;
		}
	}
	/*Diseñar un metodo que tenga la suma de la diagonal principal de un arreglo bidimensional----
	 * diseñar un metodo que imprima solo los elementos de la triangular inferior y otro con el superior
	 * diseñar un metodo que imprima los datos de un arreglo bidimensional y su respectivo valor en octal----
	 */
	public int SumaDiagonal() {
		int sum=0;
		for(byte k=0;k<matriz.length;k++) {
			for (byte l=0;l<matriz[0].length;l++) {
				if (k==l) sum+=(int)matriz[k][l];
			}
		}
		return sum;
	}
	public String ImprimeOctal() {
		String cad="";
		for(byte k=0;k<matriz.length;k++) {
			for (byte l=0;l<matriz[0].length;l++) {
				cad+="("+Metodos.Octal((int)matriz[k][l])+")  ";
			}
			cad+="\n";
		}
		return cad;
	}
	public String MatrizTrianguloSuperior() {
		String cad="";byte t=0,p=0;
		for(byte k=0;k<matriz.length;k++) {
			for (byte l=0;l<matriz[0].length;l++) {
				if (t>p)
					cad+="|  "+matriz[k][l]+"  |";
				else 
					cad+="        ";
				t++;
			}
			p++;
			t=0;
			cad+="\n";
		}
		return cad;
	}
	public String MatrizTrianguloInferior() {
		String cad="";byte t=0,p=0;
		for(byte k=0;k<matriz.length;k++) {
			for (byte l=0;l<matriz[0].length;l++) {
				if (t<p)
					cad+="|  "+matriz[k][l]+"  |";
				t++;
			}
			p++;
			t=0;
			cad+="\n";
		}
		return cad;
	}
	/*Diseñar un metodo que permita visualizar los datos de una matriz llamada matriz2 que almacena valore constantes, debera de imprimir la matriz original
	 * y la matriz con los datos ordenados
	 */
	
}
