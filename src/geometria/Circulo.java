package geometria;

public class Circulo {
	
	private double diametro;
	private double radio;//diametro/2
	private double perimetro;//Math.PI*this.diametro;
	private double area; //Math.PI*radio2;
	

//Constructor
public Circulo() {
	
}
public Circulo(double diametro,double radio,double perimetro,double area) {
	
	this.area = area;
	this.diametro = diametro;
	this.radio = radio;
	this.perimetro = perimetro;
	
}

//Getters - Setters

public double getDiametro() {
	return diametro;
}

public void setDiametro(double diametro) {
	this.diametro = diametro;
}
public double calcularRadio() {
return this.diametro / 2;
}
public double calcularPerimetro() {
return Math.PI * this.diametro / 2;
}
public double getRadio() {
	return radio;
}
public void setRadio(double radio) {
	this.radio = radio;
}
public double getPerimetro() {
	return perimetro;
}
public void setPerimetro(double perimetro) {
	this.perimetro = perimetro;
}
public double getArea() {
	return area;
}
public void setArea(double area) {
	this.area = area;
}

//Métodos
public double calcularArea() {
double radio = this.calcularRadio();
return Math.PI * Math.pow(radio,2);
}


}