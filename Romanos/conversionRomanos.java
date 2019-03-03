import java.util.Scanner;
public class conversionRomanos {
    public static void main(String[] args) {
      int numeros;
      //creamos todos los arrays que ocuparemos con los valores de unidad, decena y centena
      String Unidad[]={"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
      String Decena[]={"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
      String Centena[]={"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM","M"};

      System.out.println("CONVERTIDOR DE NUMEROS ENTEROS A ROMANOS");
      System.out.println("Introduce numero entero entre 1 a 1000");
      Scanner teclado=new Scanner(System.in);
      numeros = teclado.nextInt();
//condición para que el usuario no ingrese mas de la cifra de 1000
      if (numeros>1000) {
          System.out.print("has alcanzado el valor maximo para convertir");        
        }else{
          if(numeros>=100){    
          //en la parte de centena se hace una division entre 100 para saber en que posicion del array se encuentra 
          //el dato ingresado, si el resultado da 2 entonces se hara una busqueda en el array de centena en la posicion 2
              System.out.println(Centena[numeros/100]+Decena[(numeros/10)%10]+Unidad[numeros%10]);
          }else{
              if(numeros>=10){
                //en la decenena se hace exactamente lo mismo que en la centena con la diferencia que este se divide entre 10 y se le saca el residuo para saber la posición 
                // y en la unidad se le saca el reciduo del numero introducido y asi sabemos que es una unidad y por lo tanto hace la busqueda en el array de unidad
                  System.out.println(Decena[(numeros/10)%10]+Unidad[numeros%10]);          
              }else{
                  System.out.println(Unidad[numeros]);          
              }
                   
        }       
     }
  }
}

