package ArrayUnidimen;

import javax.swing.JOptionPane;
import EntradaSalida.Tools;

public class Metodos {
	public static int numArmstrong(int valor) {
		int c=0,a;
		int n=valor;
		while(n>0) {
			a=n%10;
			n=n/10;
			c=c+(a*a*a);
		}
		return c;
	}
	public static String binario(int decimal) {
		String binario=""; int mod; int div=decimal;
		while (div>=1) {
			mod=div%2;
			div=div/2;
			binario = mod+binario;
		}
		return binario;
	}
	public static int numDigitos(int valor) {
		int contador=0; int num=valor;
		while(num>0) {
			contador=contador+1;
			num=num/10;
		}
		return contador;
	}
	public static int sumapares(int valor) {
		int sumapar=0;
		for (int i=1;i<=valor;i++) {
			if (i%2==0) {
				sumapar=sumapar+i;
			}
		}
		return sumapar;
	}
	public static int sumaimpares(int valor,int n) {
		int sumaimpar=0;
		for (int i=0;i<=valor;i++) {
			if (i%2!=0 && i<=n) {
				sumaimpar=sumaimpar+i;
			}
		}
		return sumaimpar;
	}
	public static int sumaDigitos(int valor) {
		int suma=0;
		while(valor!=0) {
			suma+=valor%10;
			valor/=10;
		}
		return suma;
	}
	public static boolean numPrimo(int valor) {
		int contador=0;
		if (valor==1) {
			contador=0;
		}
		else {
			for(int i=1;i<=valor;i++) {
				if(valor%i==0) {
					contador++;
				}
			}
		}
		return contador==2;
	}
	public static int sumaDeProductos(int valor1, int valor2) {
		int producto=0;
		for(int i=1;i<=valor2;i++) {
			producto=producto+valor1;
		}
		return producto;
	}
	public static String tresDatos(int valor1, int valor2, int valor3) {
		String a="";
		if (valor1 == valor2 && valor2 == valor3 && valor3 == valor1) {
			a="Los enteros "+valor1+", "+valor2+" y "+valor3+" son iguales";
		}	
		else if (valor1>valor2 && valor1>valor3) {
			a="El entero "+valor1+" es mayor que los enteros "+valor2+" y "+valor3;
		}	
		else if (valor1<valor2 && valor2>valor3) {
			a="El entero "+valor2+" es mayor que los enteros "+valor1+" y "+valor3;
		}	
		else if (valor1<valor3 && valor2<valor3) {
			a="El entero "+valor3+" es mayor que los enteros "+valor1+" y "+valor2;
		}
		return a;
	}
	public static boolean numeroPerfecto(int num) {
		int sum=0;
		for(int i=1;i<num;i++) {
			if(num%i==0) {
				sum+=i;
			}
		}
		return(sum==num);
	}
	public static double consumoDeAgua(double aguaC) {
		double pagar=0; double monto=0;
		if (aguaC<100) {
			pagar=aguaC*40;
		}
		else if(aguaC>=100 && aguaC<=499) {
			pagar=aguaC*60;
		}
		else if(aguaC>=500 && aguaC<=600) {
			pagar=aguaC*80;
		}
		else if(aguaC>600 && aguaC<=1000) {
			monto=(aguaC*80)*0.02;
			pagar=(aguaC*80)+monto;
		}
		else if(aguaC>1000) {
			monto=(aguaC*100)*0.02;
			pagar=(aguaC*100)+monto;
		}
		else {
			JOptionPane.showMessageDialog(null, "Solo se pueden usar numeros enteros");
		}
		return pagar;
	}
	public static String pagosUniversidad(String nombre, String cat, double prom) {
		double pago=0,des=0;
		cat=cat.toUpperCase();
		switch(cat) {
		case "A":
			pago=1200;
			if(prom>80 && prom<=100) {
				des=1200*0.15;
				pago=1200-des;
			}
			else if(prom>75 && prom<=80) {
				des=1200*0.15;
				pago=1200-des;
			}
			break;
		case "B":
			pago=1000;
			if(prom>80 && prom<=100) {
				des=1000*0.15;
				pago=1000-des;
			}
			else if(prom>75 && prom<=80) {
				des=1000*0.15;
				pago=1000-des;
			}
			break;
		case "C":
			pago=900;
			if(prom>80 && prom<=100) {
				des=900*0.15;
				pago=900-des;
			}
			else if(prom>75 && prom<=80) {
				des=900*0.15;
				pago=900-des;
			}
			break;
		case "D":
			pago=600;
			if(prom>80 && prom<=100) {
				des=600*0.15;
				pago=600-des;
			}
			else if(prom>75 && prom<=80) {
				des=600*0.15;
				pago=600-des;
			}
			break;
		}
		return "Nombre:"+nombre+"\n"+"Pago sin descuento"+des+"\n El pago total es: "+pago;
	}
	public static void Triangulo(int filas) {
		String cadena=" ";
		if(ValidaPosNeg(filas)) Tools.salidaError(filas+" es un numero negativo");
		else {
		for(byte j=0;j<filas;j++) {
			for(byte i=0;i<=j;i++) {
				cadena+=i+" ";
			}
			cadena+="\n";
		}
		Tools.imprimePantalla(cadena);
		}
	}
	public static int multiplicacionRusa(int mul,int multi) {
		int suma=0;
		while(mul!=1) {
			if(mul%2==1) {
				suma+=multi;
			}
			mul/=2;
			multi*=2;
			System.out.println(mul+" "+multi+"\n");
		}
		return multi+suma;
	}
	public static String imprimeFrecuencia(int n) {
		String cad=" ";
		if (ValidaPosNeg(n)) {
			Tools.salidaError("El valor es negativo");
			cad="Numero negativo";
		}
		else {for(int i=1;i<=n;i++) {
			cad+="*";
		}
		}
		return cad;
	}
	public static void cuentaVocales(String cadena) {
		byte a=0,e=0,i=0,o=0,u=0;
		byte f=0; String cad=" ";
		while(f<cadena.length()) {
			switch(cadena.charAt(f)) {
			case 'A':a++;break;
			case 'a':a++;break;
			case 'E':e++;break;
			case 'e':e++;break;			
			case 'I':i++;break;
			case 'i':i++;break;			
			case 'O':o++;break;
			case 'o':o++;break;
			case 'U':u++;break;
			case 'u':u++;break;
			}
			f++;
		}
		cad="a= "+imprimeFrecuencia(a)+"\n"+
			"e= "+imprimeFrecuencia(e)+"\n"+
			"i= "+imprimeFrecuencia(i)+"\n"+
			"o= "+imprimeFrecuencia(o)+"\n"+
			"u= "+imprimeFrecuencia(u);
		Tools.imprimePantalla("Frecuencia de vocales\n"+cad);
	}
	
	public static void mayorNum(int dato1,int dato2,int dato3) {
		int a =Math.max(dato1,dato2);
		Tools.imprimePantalla("El número mayor es: "+(Math.max(a, dato3)));
	}
	public static boolean palindrome(String cadena) {
		cadena=cadena.toLowerCase();
		int i, j=cadena.length()-1;
		for (i=0;i<=j;i++) {
			for (j=cadena.length()-1;j>=i;j--) {
				if(cadena.charAt(i)!=cadena.charAt(j))
					return false;
			}
		}
		return true;
	}
	public static boolean ValidaPosNeg(int num) {
		return num<=0;
	}
	public static boolean validaPar(int num) {
		return num%2==0;
	}
	public static boolean validaImpar(int num) {
		return num%2!=0;
	}
	public static boolean validaCero(int num) {
		return num==0;
	}
	public static String CadenaAlRevez(String cad) {
		String x="";
		for (short i=0;i<cad.length();i++) {
			x=cad.charAt(i)+x;
		}
		return "["+x+"] Numero de caracteres: "+cad.length();
	}
	public static int PrecioDeCarreras(int n) {
		int cant=0;
		if (n<=10) cant=n*1500;
		else if (n>=11 && n<30) cant=n*3500;
		else if (n>=30) cant=n*5000;
		return cant;
	}
	public static String Octal(int decimal) {
		String octal=""; int mod; int div=decimal;
		while (div>=1) {
			mod=div%8;
			div=div/8;
			octal = mod+octal;
		}
		return octal;
	}
}
