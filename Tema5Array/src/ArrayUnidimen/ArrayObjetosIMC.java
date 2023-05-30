package ArrayUnidimen;

import ArrayUnidimen.IndiceDeMasaCorporal;
import EntradaSalida.Tools;

public class ArrayObjetosIMC {
	private IndiceDeMasaCorporal datos[];
	private byte i;
	public ArrayObjetosIMC() {}
	public ArrayObjetosIMC(byte tam) {
		datos=new IndiceDeMasaCorporal[tam];
		i=-1;
	}
	public boolean arrayVacio() {
		return i==-1;
	}
	public boolean espacioArray() {
		return i<datos.length-1;
	}
	public IndiceDeMasaCorporal CreaObjeto() {
		IndiceDeMasaCorporal imc=new IndiceDeMasaCorporal(Tools.leerString("Nombre : "),Tools.leerByte("Edad : "),Tools.leerChar("Sexo : "),Tools.leerFloat("Peso : "),Tools.leerFloat("Altura : "));
		return imc;
	}
	public void insertaObjetoLectura() {
		if (espacioArray()) {
			i++;
			datos[i]=CreaObjeto();
		}
		else {
			Tools.salidaError("Array Unidimensional LLENO!");
		}
	}
	public String imprimeDatosArray() {
		int j;String cad="";
		for(j=0;j<=i;j++) {
			cad+=j+"["+datos[j].toString()+"]\n";
		}
		
		return cad;
	}
	public void ordenaBurbuja() {
		IndiceDeMasaCorporal aux=new IndiceDeMasaCorporal();
		byte k,l;
		for(k=0;k<datos.length-1;k++)
			for(l=(byte) (k+1);l<datos.length;l++) {
				if (datos[k]!=null && datos[l]!=null && datos[k].getNom().compareTo(datos[l].getNom())>0) {
					aux=datos[k];
					datos[k]=datos[l];
					datos[l]=aux;
				}
			}
	}
	public void buscarDato() {
		if (arrayVacio()) 
			Tools.salidaError("No hay datos registrados");
		else {
			byte n=Tools.leerByte("El numero de datos registrados es = "+(i+1)+"\n Dime el numero de posicion que deseas buscar");
			if (n>i-1)
				Tools.salidaError("Esta fuera del rango de datos capturados");
			else {
				Tools.imprimePantalla("El dato es: \n"+datos[n].toString());
			}
		}
	}
	public String Estadisticas() {
		String est="Estadisticas: \n\n";
		byte m=0,f=0,bp=0,pn=0,sp=0,o=0,os=0,om=0;
		for (byte l=0;l<i;l++) {
			switch(datos[l].getSex()) {
			case 'M':
			case 'm':m++;break;
			case 'F':
			case 'f':f++;break;
			}
		}
		for (byte k=0;k<i;k++) {
			switch(datos[k].getEstPeso()) {
			case "Bajo peso":bp++;break;
			case "Peso normal":pn++;break;
			case "Sobrepeso":sp++;break;
			case "Obesidad":o++;break;
			case "Obesidad Severa":os++;break;
			case "Obesidad Morbida":om++;break;
			}
		}
		est+="Total de personas del genero masculino: "+m+"\nTotal de personas del genero femenino: "+f+"\n\nTotal de personas con bajo peso: "+bp
				+"\nTotal de personas con peso normal: "+pn+"\nTotal de personas con sobrepeso: "+sp+"\nTotal de personas con obesidad: "+o
				+"\nTotal de personas con obesidad severa: "+os+"\nTotal de personas con obesidad morbida: "+om;
		return est;
	}
}
