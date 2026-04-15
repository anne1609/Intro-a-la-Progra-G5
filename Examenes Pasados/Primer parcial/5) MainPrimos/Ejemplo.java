
import java.util.Scanner;
public class Ejemplo
{
    
    public static void main (String args[]){
     Scanner LT= new Scanner(System.in);
     System.out.println("INGRESE UN NUMERO");
     int n = LT.nextInt();
     int p=n+1;
     boolean esp=false;
     
     while(esp==false){
         esp=true;
         for(int d=2;d<=p-1;d++){
             if(p%d==0){
                 esp=false;
             }
         }
         
         if(esp==false){
           p+=1;
         }
     } 
     System.out.println("El resultado es: " + p);
    }
}
