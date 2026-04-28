import java.util.Scanner;
public class Digitos
{
   public static void main(String args[]){
       Scanner sc= new Scanner(System.in);
       int nro = sc.nextInt();
       int copia=nro;
       int digito=0;
       int mayor= nro%10;
       int menor=nro%10;
       int digito2=0;
       int contMayor=0;
       int contMenor=0;
       while (nro>0){
           digito=nro%10;
           nro=nro/10;
           if(mayor<digito){
             mayor=digito; 
           }else if(menor>digito){
               menor=digito;
            }
       }
       while (copia>0){
           digito2=copia%10;
           copia=copia/10;
           if(digito2==mayor){
             contMayor++; 
           }
           if(digito2==menor){
               contMenor++;
            }
       }
       System.out.println("El mayor es: "+mayor+"se repite " +contMayor);
       System.out.println("El menor es: "+menor+ "se repite" + contMenor);
   }
}
