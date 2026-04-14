
import java.util.Scanner;
public class CuadradoAsteriscos
{
   public static void main(String args[]){
       Scanner sc= new Scanner(System.in);
       System.out.println("Introduce el numero de filas: ");
       int filas = sc.nextInt();
       dibujarCuadrado(filas);
  }
  static void dibujarCuadrado(int filas){
      for(int i=0;i<filas;i++){
         for(int j=0; j<filas;j++){
             System.out.print("*");
         } 
         System.out.println();
     }
  }
}
