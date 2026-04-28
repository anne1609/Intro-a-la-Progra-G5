
import java.util.Scanner;
public class NroAleatorio
{
  public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.println("Introduce un nro a adivinar: ");
      int nro;
      int numeroAleatorio = (int)(Math.random()*999+1);
      int intentos=0;
      do{
       nro=sc.nextInt();
       if(nro>numeroAleatorio){
          System.out.println("El nro es mayor al aleatorio");
        }else if(nro<numeroAleatorio){
           System.out.println("El nro es menor al aleatorio");
        }
       
       intentos++;
      }while(nro!=numeroAleatorio);
      System.out.println("Adivinaste el nro en " + intentos + "intentos");    
  }
}

