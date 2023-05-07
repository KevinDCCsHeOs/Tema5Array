package ArrayUnidimen;

import EntradaSalida.Tools;
import java.util.Random;

//arreglos homogeneos
public class AlmacenarDatos {
	private Object datos[];
	private byte i; //subindice que permite llevar el control de los datos
	public AlmacenarDatos(int max) {
		datos=new Object[max];
		i=-1;//p/indicar que el array esta vacio
	}
	public boolean arrayVacio() {
		return (i==-1);
	}
	public boolean isEspacio() {
		return (i<datos.length-1);
	}
	public void añadirDato(Object valor) {
		if (isEspacio()) {
			i++;
			datos[i]=valor;
		}
		else 
			Tools.salidaError("Array Unidimensional LLENO!");
	}
	public String imprimeDatosArray() {
		int j;String cad="";
		for(j=0;j<=i;j++) {
			cad+=j+"["+datos[j]+"]\n";
		}
		return cad;
	}
	public String imprimePrimos() {
		String cad="";
		for (byte j=0;j<=i;j++) {
			if (Metodos.numPrimo((int)datos[j])) cad+=j+" ["+datos[j]+"]\n";
		}
		return cad;
	}
	//agregar una opcion que se llame binario en la unidad ejecutable, usando la plantilla de almacenar 
	//datos recorra el arreglo tomando cada valor y convirtiedolo a su numero binario correspondiente, 
	//debera presentar en una ventana emergente la lista de los valores capturados y la lista de los numeros binarios
	public String Binario() {
		String cad="";
		for(byte j=0;j<=i;j++) {
			cad+=j+" ["+Metodos.binario((int)datos[j])+"]\n";
		}
		return cad;
	}

	public void imprimeTriangulos() {
		for (byte j=0;j<=i;j++) {
			Metodos.Triangulo((int)datos[j]);
		}
	}
	//agregar una opcion que imprima la frecuencia de los valores almacenados en un arreglo unidimensional
	public String ImprimeFrecuenciaArreglo() {
		String cad="";
		for (byte j=0;j<=i;j++) {
			cad+=j+" ["+Metodos.imprimeFrecuencia((int)datos[j])+"]\n";
		}
		return cad;
	}
	public String sumaDigitos2(int valor[]) {
		String cad="";
		for (byte j=0;j<valor.length-1;j++) {
			cad+=j+" ["+valor[j]+" suma de digitos es igual a "+Metodos.sumaDigitos(valor[j])+"]\n";
		}
		return cad;
	}
	public void ordenaBurbuja() {
		byte k,f;
		Object aux;
		for(k=0;k<i;k++)
			for(f=(byte) (k+1);f<i;f++) {
				if ((int)datos[k]>(int)datos[f]) {
					aux=datos[k];
					datos[k]=datos[f];
					datos[f]=aux;
				}
			}
	}
	public void datosAleatorios(int num) {
		int dat;byte par=0,impar=0,ceros=0;
		for (byte f=0;f<num;f++) {
			dat=(byte)(1+Math.random()*100);
			añadirDato(dat);
		}
		for(byte j=0;j<num;j++) {
			if(Metodos.validaCero((int)datos[j]))
				ceros+=1;
			else if(Metodos.validaPar((int)datos[j]))
				par+=1;
			else if (Metodos.validaImpar((int)datos[j]))
				impar+=1;
		}
		Tools.imprimePantalla(imprimeDatosArray()+"\n Numero de pares:"+par+"\n Numero de impares:"+impar+"\n Numero de ceros:"+ceros);
	}
	public void PersonasAltura(int n) {
		float x,sumAltura=0,media;byte alSup=0,alMen=0;
		if (Metodos.ValidaPosNeg(n)) Tools.salidaError("Solo se permiten enteros positivos");
		else {
			for (byte j=0;j<n;j++) {
				x=Tools.leerFloat("Introduce la altura en centimetros de la persona "+j);
				añadirDato(x);
			}
			for (byte k=0;k<n;k++) {
				sumAltura+=(float)datos[k];
			}
			media=sumAltura/n;
			for (byte l=0;l<n;l++) {
				if ((float)datos[l]>media) alSup++;
				else alMen++;
			}
			Tools.imprimePantalla("Los datos capturados son:\n"+imprimeDatosArray()+"\nAltura Media: "+media+
					"\nPersonas mayores a la altura media:"+alSup+"\nPersonas menores a la altura media:"+alMen);
		}
	}
	public void CadenasTexto(int n) {
		String x,cad="";
		for (byte j=0;j<n;j++) {
			x=Tools.leerString("Introduce la cadena "+j);
			añadirDato(x);
		}
		for (byte k=0;k<n;k++) {
			cad+=Metodos.CadenaAlRevez((String)datos[k])+"\n";
		}
		Tools.imprimePantalla("Datos capturados:\n"+imprimeDatosArray()+"\n\nCadenas invertidas y tamaño de las mismas:\n"+cad);
	}
	public void Taxista() {
		int x,sum=0,carr = 0,dia,diaEsp = 0;
		for (byte j=0;j<30;j++) {
			x=Tools.leerEntero("Introduce el numero de carreras del dia "+j);
			añadirDato(x);
			sum+=Metodos.PrecioDeCarreras((int)datos[j]);
			carr+=(int)datos[j];
		}
		dia=(int)datos[0];
		for (byte k=1;k<30;k++) {
			if(dia<(int)datos[k]) {
				dia=(int)datos[k];
				diaEsp=k;
			}
		}
		Tools.imprimePantalla("Datos capturados:\n"+imprimeDatosArray()+"\nEl dia que mas carreras hizo: "+diaEsp+"\nDinero ganado en todo el mes: "+sum
				+"\nPromedio de carreras hechas por dia: "+(carr/30));
	}
}
