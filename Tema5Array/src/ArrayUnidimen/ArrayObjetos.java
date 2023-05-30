package ArrayUnidimen;

import EntradaSalida.Tools;

public class ArrayObjetos {
	private Rectangulo datos[];
	private byte i;
	public ArrayObjetos() {}
	public ArrayObjetos(byte tam) {
		datos=new Rectangulo[tam];
		i=-1;
	}
	public boolean arrayVacio() {
		return i==-1;
	}
	public boolean espacioArray() {
		return i<datos.length-1;
	}
	public Rectangulo creaObjeto() {
		Rectangulo rec=new Rectangulo(Tools.leerFloat("Base del rectangulo: "),Tools.leerFloat("Altura del rectangulo: "));
		//rec.setAltura(Tools.leerFloat("Altura del rectangulo: "));
		//rec.setBase(Tools.leerFloat("Base del rectangulo: "));
		return rec;
	}
	public void insertaObjetoLectura() {
		if (espacioArray()) {
			i++;
			datos[i]=creaObjeto();
		}
		else 
			Tools.salidaError("Array Unidimensional LLENO!");
	}
	public String imprimeDatosArray() {
		int j;String cad="";
		for(j=0;j<=i;j++) {
			cad+=j+"["+datos[j].toString()+"]\n";
		}
		return cad;
	}
	public void ordenaBurbuja() {
		Rectangulo aux=new Rectangulo();
		byte k,l;
		for(k=0;k<datos.length-1;k++)
			for(l=(byte) (k+1);l<datos.length;l++) {
				if (datos[k].getArea()>datos[l].getArea()) {
					aux=datos[k];
					datos[k]=datos[l];
					datos[l]=aux;
				}
			}
	}
}
