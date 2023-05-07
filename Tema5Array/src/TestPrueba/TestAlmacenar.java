package TestPrueba;

import javax.swing.JOptionPane;
import ArrayUnidimen.AlmacenarDatos;
import EntradaSalida.Tools;
import java.util.Random;
import ArrayBidimensional.AlmacenarDatosTabla;

public class TestAlmacenar {
	public static String Boton(String menu) {
		String valores[]=menu.split(",");
		int n;
		n=JOptionPane.showOptionDialog(null, "M E N U","Seleccione dando clic",JOptionPane.NO_OPTION,
				JOptionPane.QUESTION_MESSAGE,null,valores,valores[0]);
		return valores[n];
	}
	public static void Menu1(String menu) {
		String sel="", cad="";
		int dato;
		AlmacenarDatos obj=new AlmacenarDatos(10);
		do {
			sel=Desplegable(menu);
			switch(sel) {
				case "Aleatorio":
					Random aleatorio=new Random();
					dato=aleatorio.nextInt(21);
					obj.añadirDato(dato);
					Tools.imprimePantalla("Datos almacenados:\n"+obj.imprimeDatosArray());
					break;
				case "Insertar":
					dato=Tools.leerEntero(Integer.MIN_VALUE+"> Dar entero <"+Integer.MAX_VALUE);
					obj.añadirDato(dato);
					Tools.imprimePantalla("Datos almacenados:\n"+obj.imprimeDatosArray());
					break;
				case "Constantes":
					int a[]= {35,-12,41,82,35,247,-71};
					Tools.imprimePantalla("Datos almacenados\n"+obj.sumaDigitos2(a));
					break;
				case "Ordena":
					if(obj.arrayVacio())Tools.salidaError("Array vacio... leer datos");
					else obj.ordenaBurbuja();
					Tools.imprimePantalla("Datos almacenados:\n"+obj.imprimeDatosArray());
				case "Primos":
					if(obj.arrayVacio())Tools.salidaError("Array vacio... leer datos");
					else cad=obj.imprimePrimos();
					break;
				case "Binario":
					if(obj.arrayVacio())Tools.salidaError("Array vacio... leer datos");
					else cad=obj.Binario();
					break;
				case "Imprimir":
					if(obj.arrayVacio()) Tools.salidaError("Array vacio... leer datos");
					else Tools.imprimePantalla("Datos almacenados:\n"+obj.imprimeDatosArray()+"\nNumeros Primos:\n"+obj.imprimePrimos()+
							"\n Binarios:\n"+obj.Binario()+"\nFrecuencias:\n"+obj.ImprimeFrecuenciaArreglo());
					break;
				case "Triangulo":
					if(obj.arrayVacio()) Tools.salidaError("Array vacio... leer datos");
					else obj.imprimeTriangulos();
					break;
				case "Frecuencia":
					if(obj.arrayVacio()) Tools.salidaError("Array vacio... leer datos");
					else Tools.imprimePantalla("Frecuencias\n"+obj.ImprimeFrecuenciaArreglo());
					break;
				case "Ver":
					Tools.imprimePantalla("In:\n"+obj.imprimeDatosArray());
					break;
				case "Salir":
			}
		}while(!sel.equalsIgnoreCase("Salir"));
	}
	public static void main(String[] args) {
		BuscaMenu("Primer Menu,Segundo Menu,Tercer Menu,Salir");
	}
	public static void BuscaMenu(String menu) {
		String sel="";
		do {
			sel=Boton(menu);
			switch(sel) {
			case "Primer Menu":
				Menu1("Aleatorio,Insertar,Constantes,Primos,Ordena,Binario,Imprimir,Triangulo,Frecuencia,Ver,Salir");
				break;
			case "Segundo Menu":
				Menu2("Aleatorios,Altura de personas,Cadenas al revéz,Taxista,Salir");
				break;
			case "Tercer Menu":
				MenuArrayMatriz("Aleatorio,Leer Filas,Leer Columnas,Suma Diagonal,Array Octal,Triangulo superior,Triangulo inferior,Imprimir,Salir");
				break;
			case "Salir":
			}
		}while(!sel.equalsIgnoreCase("Salir"));
	}
	public static void Menu2(String menu) {
		String sel="";
		AlmacenarDatos obj=new AlmacenarDatos(10);
		do {
			sel=Desplegable(menu);
			switch(sel) {
			case "Aleatorios":
				obj.datosAleatorios(Tools.leerEntero("Tamaño del arreglo para numeros aleatorios"));
				break;
			case "Altura de personas":
				obj.PersonasAltura(Tools.leerEntero("Numero de personas:"));
				break;
			case "Cadenas al revéz":
				obj.CadenasTexto(Tools.leerEntero("Numero de lineas de texto a introducir:"));
				break;
			case "Taxista":
				AlmacenarDatos tax=new AlmacenarDatos(30);
				tax.Taxista();
				break;
			case "Salir":
			}
		}while(!sel.equalsIgnoreCase("Salir"));
	}
	public static String Desplegable(String menu) {
		String valores[]=menu.split(",");
		String res=(String)JOptionPane.showInputDialog(null,"M E N U","SELECCIONA UNA OPCION",
				JOptionPane.QUESTION_MESSAGE,null,valores,valores[0]);
		return res;
	}
	public static void MenuArrayMatriz(String menu) {
		String sel="", cad="";
		int dato;
		AlmacenarDatosTabla mat=new AlmacenarDatosTabla((byte)4,(byte) 4);
		do {
			sel=Desplegable(menu);
			switch(sel) {
				case "Aleatorio":
					if (!mat.isSpacioMatriz()) Tools.salidaError("Matriz Llena");
					else {
						mat.Aleatorios();
						Tools.imprimePantalla("Datos almacenados:\n"+mat.verMatriz());
					}
					break;
				case "Leer Filas":
					if (!mat.isSpacioMatriz()) Tools.salidaError("Matriz Llena");
					else {
						mat.leerFilas();
						Tools.imprimePantalla("Datos almacenados:\n"+mat.verMatriz());
					}
					break;
				case "Leer Columnas":
					if (!mat.isSpacioMatriz()) Tools.salidaError("Matriz Llena");
					else {
						mat.leerColumnas();
						Tools.imprimePantalla("Datos almacenados:\n"+mat.verMatriz());
					}
					break;
				case "Suma Diagonal":
					if (!mat.isSpacioMatriz()) Tools.salidaError("Matriz Llena");
					else {
						mat.leerFilas();
						Tools.imprimePantalla("Datos almacenados:\n"+mat.verMatriz()+"\n\nLa suma de la diagonal es ="+mat.SumaDiagonal());
					}
					break;
				case "Array Octal":
					if (!mat.isSpacioMatriz()) Tools.salidaError("Matriz Llena");
					else {
						mat.leerFilas();
						Tools.imprimePantalla("Datos almacenados:\n"+mat.ImprimeOctal());
					}
					break;
				case "Triangulo superior":
					if (!mat.isSpacioMatriz()) Tools.salidaError("Matriz Llena");
					else {
						mat.leerFilas();
						Tools.imprimePantalla("Datos almacenados:\n"+mat.verMatriz()+"\n\n\n"+mat.MatrizTrianguloSuperior());
					}
					break;
				case "Triangulo inferior":
					if (!mat.isSpacioMatriz()) Tools.salidaError("Matriz Llena");
					else {
						mat.leerFilas();
						Tools.imprimePantalla("Datos almacenados:\n"+mat.verMatriz()+"\n\n\n"+mat.MatrizTrianguloInferior());
					}
					break;
				case "Imprimir":
					if(mat.matrizVacia()) Tools.salidaError("Array vacio... leer datos");
					else Tools.imprimePantalla("Datos almacenados:\n"+mat.verMatriz());
					break;
				case "Salir":
			}
		}while(!sel.equalsIgnoreCase("Salir"));
	}
}
