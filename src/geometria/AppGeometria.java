package geometria;

import java.util.ArrayList;
import java.util.Scanner;

public class AppGeometria {
		
		private static ArrayList<AreaRectangulo> AreaRectangulo = new ArrayList<>();
		private static ArrayList<Circulo> Circulo = new ArrayList<>();
		
		private static short opcionSeleccionada;
	    private final static short OPCION_AREA_RECTANGULO = 1;
	    private final static short OPCION_AREA_CIRCULO= 2;
	    private final static short OPCION_RADIO_CIRCULO= 3;
	    private final static short OPCION_PERIMETRO_CIRCULO= 4;
	    private final static short OPCION_SALIR= 5;
	    
	    
		public static void main(String[] args) {
			do {
				opcionSeleccionada = menu();
			}while(opcionSeleccionada!=OPCION_SALIR);
			
		}
		private static short menu(){
				
			System.out.println("MENU\n*******\n");
	        System.out.println("[1.] Calcular Area Rectangulo");
	        System.out.println("[2.] Calcular Area Circulo");
	        System.out.println("[3.] Calcular Radio Circulo");
	        System.out.println("[4.] Calcular Perimetro Circulo");
	        System.out.println("[5.] Salir");
	        
	        System.out.println("Seleccione opcion de Menu");
	        Scanner scannerAppGeometria = new Scanner(System.in);
	        opcionSeleccionada =(short) scannerAppGeometria.nextInt();
	        
	        switch( opcionSeleccionada ) {
	                case OPCION_AREA_RECTANGULO:
	                        calcularAreaRectangulo();
	                        break;  
	                case OPCION_AREA_CIRCULO:
	                    	calcularArea();
	                    	break;
	                case OPCION_RADIO_CIRCULO:
	                    	calcularRadio();
	                    	break;
	                case OPCION_PERIMETRO_CIRCULO:
	                		calcularPerimetro();
	                		break;    	
		}
			return opcionSeleccionada;
	}
		private static void calcularAreaRectangulo() {
			Scanner scanner = new Scanner(System.in);
			 System.out.println("Ingrese Altura del Rectangulo");
			 double altura = scanner.nextDouble();
			 System.out.println("Ingrese Base del Rectangulo");
			 double base = scanner.nextDouble();		 
			 AreaRectangulo areaRectangulo = new AreaRectangulo(base,altura);
			 double area= areaRectangulo.getAreaRectangulo();
			 System.out.printf("El Area del Rectangulo es: %f %n%n", area);
		}
		private static void calcularPerimetro() {
			Scanner scanner = new Scanner(System.in);
			 System.out.println("Ingrese Perimetro del Circulo");
			 double diametro = scanner.nextDouble();
	
			 Circulo circulo = new Circulo();
			 double perimetro= circulo.calcularPerimetro();
			 System.out.printf("El Perimetro del Circulo es: %f %n%n", perimetro);
			
		}
		private static void calcularRadio() {
			Scanner scanner = new Scanner(System.in);
			 System.out.println("Ingrese Radio del Circulo");
			 double diametro = scanner.nextDouble();
	
			 Circulo circulo = new Circulo();
			 double radio= circulo.calcularRadio();
			 System.out.printf("El Radio del Circulo es: %f %n%n", radio);
			
		}
		private static void calcularArea() {
			Scanner scanner = new Scanner(System.in);
			 System.out.println("Ingrese el Diametro del Circulo");
			 double diametro = scanner.nextDouble();
				 
			 Circulo circulo = new Circulo();
			 double area= circulo.calcularArea();
			 System.out.printf("El Area del Circulo es: %f %n%n", diametro);
		}
	
}
