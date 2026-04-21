import java.util.Scanner;
public class Ejer1v2
{
     public  static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      double temperatura=0;
      double suma=0;
      double mayor=0,menor=0;
      for(int i=1;i<=7;i++){
         temperatura = sc.nextDouble();
         suma=suma+temperatura;
         if(i==1){
            menor=temperatura;
            mayor=temperatura;
         }
         if(mayor<temperatura){
            mayor= temperatura;
        }
        if(menor>temperatura){
            menor=temperatura;
        }
     }
     double promedio= suma/7;
     System.out.println("El promedio es: "+ promedio);
     System.out.println("El mayor es: "+ mayor);
     System.out.println("El menor es:" + menor);
    }
}

