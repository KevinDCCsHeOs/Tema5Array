package EntradaSalida;

import javax.swing.JOptionPane;

public class Tools {
	public static void imprimeSalida(String msje) {
		JOptionPane.showMessageDialog(null,msje,"Salida de datos",JOptionPane.QUESTION_MESSAGE);
	}
	public static void salidaError(String msje) {
		JOptionPane.showMessageDialog(null, msje,"",JOptionPane.ERROR_MESSAGE);
	}
	public static short leerShort(String msje) {
		return (Short.parseShort(JOptionPane.showInputDialog(null,msje,"Dato de entrada",JOptionPane.INFORMATION_MESSAGE)));
	}
	public static byte leerByte(String msje) {
		return (Byte.parseByte(JOptionPane.showInputDialog(null,msje,"Dato de entrada",JOptionPane.INFORMATION_MESSAGE)));
	}
	public static int leerInt(String msje) {
		return (Integer.parseInt(JOptionPane.showInputDialog(null,msje,"Dato de entrada",JOptionPane.INFORMATION_MESSAGE)));
	}
	public static long leerLong(String msje) {
		return (Long.parseLong(JOptionPane.showInputDialog(null,msje,"Dato de entrada",JOptionPane.INFORMATION_MESSAGE)));
	}
	public static float leerFloat(String msje) {
		return (Float.parseFloat(JOptionPane.showInputDialog(null,msje,"Dato de entrada",JOptionPane.INFORMATION_MESSAGE)));
	}
	public static char leerChar(String msje) {
		return (JOptionPane.showInputDialog(null,msje,"Dato de entrada",JOptionPane.INFORMATION_MESSAGE).charAt(0));
	}
	public static String leerString(String msje) {
		return(JOptionPane.showInputDialog(null,msje,"Dato de entrada",JOptionPane.INFORMATION_MESSAGE));
	}
	public static double leerDouble(String msje) {
		return (Double.parseDouble(JOptionPane.showInputDialog(null,msje,"Dato de entrada",JOptionPane.INFORMATION_MESSAGE)));
	}
	public static int seguirSino() {
		return JOptionPane.showConfirmDialog(null,"Deseas continuar","Capturando datos",JOptionPane.YES_NO_OPTION);
	}
	public static int leerEntero(String msje) {
		return (Integer.parseInt(JOptionPane.showInputDialog(null,msje,"Lectura int: ",JOptionPane.INFORMATION_MESSAGE)));
	}
	public static void imprimePantalla(String msje) {
		JOptionPane.showMessageDialog(null, msje, "Salida",JOptionPane.INFORMATION_MESSAGE);
	}
}
