import java.util.Scanner;
public class conversionMorse{
public static void main(String[] args) {
	int menu;
	boolean salir=false;
	String texto = " ";
    String salida = " ";
    String palabraM =" ";
	//arrays con las letras y las claves morse
	String[] morse = {" ",".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--..",".----","..---","...--","....-",".....","-....","--...","---..","----.","-----" };
	char[] letras = {' ','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','1','2','3','4','5','6','7','8','9','0'};
	//letras1 de tipo String para la conversion de clave morse a numeros 
	String[] letras1 = {" ","a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","1","2","3","4","5","6","7","8","9","0"};
	
	System.out.println("Escoja entre las opciones del menu");
	System.out.println("1) Palabras a morse "+"\n"+"2) Morse a letras");
	Scanner entrada = new Scanner(System.in);
	menu = entrada.nextInt();
	//menu para elegir entre palabras a clave morse o viceversa

		switch(menu){

		case 1://opcion 1, palabras a clave morse
			System.out.print("Introduce palabra a convertir a morse "+"\n");
			Scanner teclado = new Scanner(System.in);
			texto= teclado.nextLine();

			 for (int i = 0; i < texto.length(); i++) {// for para recorrer todas las letras de la palabra ingresada por el usuario
		      for (int j = 0; j < 37; j++) { // se recorren los 37 datos que tienen los arrays
		        if (texto.charAt(i) == letras[j]) { //condición para comprar que el texto ingresado sea igual al array de letras y se convierte de char a string
		          salida += morse[j];
		          salida += "   ";//para que sea separado por 3 espacios
		            
		        }    
		      }
		    }
		    System.out.println("Su conversion es: "+salida);// se imprime el resultado convertido
			break;
		case 2: //opcion2, clave morse a palabras
			System.out.println("Introduce el codigo morse para convertir en palabras ");
			Scanner teclado1 = new Scanner(System.in);
			palabraM= teclado1.nextLine();

		 	String clave[] = palabraM.split(" ");//se crea un nuevo array y se le asigana la la palabra que el usuario ingrese, se le hace un split para separar la palabra
		    int tamano=clave.length;//se crea una nueva variable y se le asigna la clave.length para que sepa cuantas clave morse hay ingresadas 
		      for (int i = 0; i < tamano; i++) {
		        for (int j = 0; j < 37; j++) {
		          if (clave[i].equals(morse[j])) {//condición para comparar clave con morse 
		            salida +=letras1[j];
		            salida += "   ";//para que sea separado por 3 espacios
		          }    
		        }
		      }
		    
		    System.out.println("Su conversion es: "+ salida);  //se imprime la conversión 
			break;
			
		}
	}
}