package ArrayUnidimen;

public class Rectangulo {
	private double base;
	private double altura;
	private double area;
	private double perimetro;
	public Rectangulo() {}
	public Rectangulo(double base, double altura) {
		this.base=base;
		this.altura=altura;
		this.area=AreaRectangulo();
		this.perimetro=PerimetroRectangulo();
	}
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getArea() {
		return area;
	}
	public double getPerimetro() {
		return perimetro;
	}
	@Override
	public String toString() {
		return "Rectangulo [base=" + base + ", altura=" + altura + ", area=" + area + ", perimetro=" + perimetro + "]";
	}
	public double AreaRectangulo() {
		return base*altura;
	}
	public double PerimetroRectangulo() {
		return (base*altura)*2;
	}
	public static String AreaCubierta(Rectangulo salon, Rectangulo alf1, Rectangulo alf2) {
		String a="";
		if ((alf1.AreaRectangulo()+alf2.AreaRectangulo())-salon.AreaRectangulo()==salon.AreaRectangulo()) 
			a="Toda el area esta cubierta";
		else 
			a="El area cubierta es= "+(alf1.AreaRectangulo()+alf2.AreaRectangulo())+
				"\nEl area descubierta es= "+(salon.AreaRectangulo()-(alf1.AreaRectangulo()+alf2.AreaRectangulo()));
		return a;
	}
}
