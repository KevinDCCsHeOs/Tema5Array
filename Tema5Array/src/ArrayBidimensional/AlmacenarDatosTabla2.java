package ArrayBidimensional;

import EntradaSalida.Tools;

public class AlmacenarDatosTabla2 {
	int matriz2[][]= {
			{18,-3,14},
			{35,4,20},
			{4,-16,70},
			{24,3,10}
	};
	public AlmacenarDatosTabla2() {}
	public String verMatriz() {
		String cad="";
		for(byte k=0;k<matriz2.length;k++) {
			for (byte l=0;l<matriz2[0].length;l++) {
				cad+="|  "+matriz2[k][l]+"  |";
			}
			cad+="\n";
		}
		
		ordenaBurbuja();
		return cad;
	}
	public void ordenaBurbuja() {
		byte k,f,l;
		Object aux;
		for(k=0;k<4;k++) {
			l=0;f=1;
			do{
				if ((int)matriz2[k][l]>(int)matriz2[k][f]) {
					aux=matriz2[k][l];
					matriz2[k][l]=matriz2[k][f];
					matriz2[k][f]=(int) aux;
				}
				f++;
				l++;
			}while(f<matriz2[0].length);
		}
	}
	public static void main(String[] args) {
		AlmacenarDatosTabla2 mat=new AlmacenarDatosTabla2();
		Tools.imprimeSalida("Matriz:\n"+mat.verMatriz()+"\n\n"+mat.verMatriz());
	}
}
