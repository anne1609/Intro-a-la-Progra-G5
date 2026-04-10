
import java.util.Scanner;
public class SumaDigitos
{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int nro;
       do{
             System.out.println("Introduzca un nro");
             nro= sc.nextInt();
            if(nro!=0){
             int suma= sumarDigitos(nro);
             System.out.println("La suma es:" + suma);
            }
       }while(nro!=0);
       System.out.println("Fin");
    }
    
    static int sumarDigitos(int num){
        int suma=0;
        int digito=0;
        while(num>0){
         digito=num%10;
         if(digito<=5){
          suma=suma+digito;
         }
         num=num/10;
        }
        return suma;
    }
}
