import java.util.Scanner;
import java.util.InputMismatchException;
	
class Figuras{ //clase padre llamada figura que tiene un solo valor que heredaran las demnas clases hijas 
	double calcularPerimetro;
}


class Cuadrado extends Figuras{// clase cuadrado que extiende de figuras 
	double calcularArea;
	double perimetro(){ // para poder realizar la operacion del prerimetro
		return calcularPerimetro*4;
}
	double area(){
		return calcularArea*calcularArea;
}

	}
class Cubo extends Figuras{// clase cubo que extiende de figuras 
	double calcularVolume;

	double volume(){
		return calcularVolume*calcularVolume*calcularVolume; //operacion para realizar el volume
}
	double perimetro(){
		return calcularPerimetro*12; // operacion para el perimetro
	}
	
}
class figurasObjetos{
public static void main(String[] args) {
	int menu;
	double valorU;
	boolean salir=false;
	Scanner teclado = new Scanner(System.in);

	System.out.println("APLICACION JAVA PARA CALCULAR EL AREA Y PERIMETRO DE UN CUADRADO TAMBIEN PARA CALCULAR EL VOLUME Y PERIMETRO DE UN CUBO");
	
	
	System.out.println("Introduzca la medida de un lado para realizar los diferentes  calculos ");
	Scanner teclado1 = new Scanner(System.in);
	valorU=Double.parseDouble(teclado1.nextLine());// para que acepte el punto decimal que el usuario ingrese




	while(!salir){// while para que al momento de seleccionar la opcion de salir se detenga el programa
		try { // try catch para que no ingresen letras en el apartado del menu
				
			//en este bloque de codigo instanciamos todas las variables para poder acceder a sus operaciones
			Cuadrado resA= new Cuadrado();
			resA.calcularArea=valorU;

			Cuadrado resP = new Cuadrado();
			resP.calcularPerimetro=valorU;

			Cubo resV = new Cubo();
			resV.calcularVolume=valorU;

			Cubo resPe = new Cubo();
			resPe.calcularPerimetro=valorU;

			System.out.println("Escoja entre las diferentes opciones del menu para realizar sus calculos ");
			System.out.println("1) Calcular el area del cuadrado. \n2) Calcular el perimetro del cuadrado. \n3) Calcular el volume del cubo \n4) Calcular el perimetro del cubo \n5) Cancelar \n6) Salir");
			
			menu=teclado.nextInt();
			if(menu ==5||menu==6 ){
				
			}else{
				System.out.println("el dato actual ingresado es:"+valorU+"\n");
			}
			
			switch(menu){// menu

				case 1: System.out.println("El area del cuadrado es: "+resA.area()+"\n");
				break;

				case 2: System.out.println("El perimetro del cuadrado es: "+ resP.perimetro()+"\n");
				break;

				case 3: System.out.println("El volumen del cubo es: "+resV.volume()+"\n");
				break;

				case 4: System.out.println("El perimetro del cubo es: "+resPe.perimetro()+"\n");
				break;
				//para que pida un nuevo numero
				case 5: System.out.println("Introduzca la medida de un lado para realizar los diferentes  calculos ");
				Scanner teclado2 = new Scanner(System.in);
				valorU=Double.parseDouble(teclado2.nextLine());// para que acepte el punto decimal

				break;
				case 6: 
				salir=true;
				System.out.println("Gracias por a ver utilizado nuestra aplicacion");
				break;

				}
		}catch (InputMismatchException e) {
                System.out.println("Debes insertar un numero");
                teclado.next();
            }
		
	    }


	}
}