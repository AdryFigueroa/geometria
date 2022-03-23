package Geometria;

public class Rectangulo {

		private double base;
		private double altura;
		private double areaRectangulo;
	

public Rectangulo() {
	
}
public Rectangulo(double base,double altura) {
	this.base = base;
	this.altura = altura;
	this.areaRectangulo = base*altura;

}
public double getBase() {
	return base;
}
public void setBase(int base) {
	this.base = base;
}
public double getAltura() {
	return altura;
}
public void setAltura(int altura) {
	this.altura = altura;
}
public double getAreaRectangulo() {
	return areaRectangulo;
}
public void setAreaRectangulo(int areaRectangulo) {
	this.areaRectangulo = areaRectangulo;
}

public double areaRectangulo(int base,int altura) {
return base*altura;
}

}
