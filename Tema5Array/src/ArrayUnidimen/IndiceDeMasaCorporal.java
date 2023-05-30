package ArrayUnidimen;

public class IndiceDeMasaCorporal {
	private static short numFol=1000;
	private String nom;
	private byte edad;
	private char sex;
	private float peso;
	private float altura;
	private double imc;
	private String estPeso;
	public IndiceDeMasaCorporal() {}
	public IndiceDeMasaCorporal(String nom, byte edad, char sex, float peso, float altura) {
		this.nom=nom;
		this.edad=edad;
		this.sex=sex;
		this.peso=peso;
		this.altura=altura;
		this.imc=calculaIMC();
		this.estPeso=determinaEstadoIMC();
		numFol++;
	}
	public static short getNumFol() {
		return numFol;
	}
	public String getNom() {
		return nom;
	}
	public byte getEdad() {
		return edad;
	}
	public char getSex() {
		return sex;
	}
	public float getPeso() {
		return peso;
	}
	public float getAltura() {
		return altura;
	}
	public String getEstPeso() {
		return estPeso;
	}
	public double getImc() {
		return imc;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public void setEdad(byte edad) {
		this.edad = edad;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public double calculaIMC() {
		return peso/(altura/100);
	}
	public String determinaEstadoIMC() {
		double x=calculaIMC();String v="";
		if (x<18.5) v="Bajo peso";
		else if (x>=18.5 && x<=24.9) v="Peso normal";
		else if (x>=25 && x<=29.9) v="Sobrepeso";
		else if (x>=30 && x<=34.9) v="Obesidad";
		else if (x>=35 && x<=39) v="Obesidad Severa";
		else if (x>=40) v="Obesidad Morbida";
		return v;
	}
	@Override
	public String toString() {
		return "IndiceDeMasaCorporal [nom=" + nom + ", edad=" + edad + ", sex=" + sex + ", peso=" + peso + ", altura="
				+ altura + ", imc=" + imc + ", estPeso=" + estPeso + "]";
	}
	/*crear un arreglo que almacene objetos de tipo IMC (Indice de masa corporal) Deberan de presentar un menu con las siguientes opciones:
	* ---Captura Datos
	* ---Ordenar los datos por el campo del nombre 
	* Presenta las siguientes estadisticas : total de personas del genero masculino y femenino, total de personas bajos de peso, total de personas con sobrepeso, 
	* 	total de personas con obesidad, total de personas con obesidad severa
	* ---consulta individual solicitando al usuario el valor de la posicion para imprimir sus datos
	*/
}
