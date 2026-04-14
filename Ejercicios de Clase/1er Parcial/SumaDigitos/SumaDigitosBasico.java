import java.util.Scanner;
public class SumaDigitosBasico
{
 
    public static void main(String args[]){
        int num;
        int sumaDigitos;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un nro: ");
        num = sc.nextInt();
        if(num>99){
         sumaDigitos=sumarDigitos(num);
         System.out.println("La suma de digitos es:" +sumaDigitos);
        }else{
           System.out.println("El numero no tiene al menos 3 cifras"); 
        }
    }
    
    static int sumarDigitos(int nro){
        int sumaDigitos=0;
        int digito = 0;
        while(nro>0){
          digito= nro%10;   
          sumaDigitos=sumaDigitos+digito;
          nro=nro/10;  
        }
        return sumaDigitos;
    }
}





