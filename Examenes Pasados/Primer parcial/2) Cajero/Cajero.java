
import java.util.Scanner;
public class Cajero
{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Introduce una cantidad de dinero: ");
        double dinero=sc.nextDouble();
        int dinero2=(int) dinero;
        int centavos =(int)(Math.round((dinero -dinero2)*100)); 
        int doscien= dinero2/200;
        dinero2= dinero2%200;
        int cien = dinero2/100;
        dinero2=dinero2%100;
        int cincuen = dinero2/50;
        dinero2=dinero2%50;
        int veinte= dinero2/20;
        dinero2=dinero2%20;
        int diez=dinero2/10;
        dinero2=dinero2%10;
        int cinco = dinero2/5;
        dinero2=dinero2%5;
        int dos = dinero2/2;
        dinero2=dinero2%2;
        int uno=dinero2;
        int cincuentaC= centavos/50;
        centavos=centavos%50;
        int veinteC= centavos/20;
        centavos=centavos%20;
        int diezC= centavos/10;
        centavos=centavos%10;
        if(doscien>0){
         System.out.println(doscien + " billete(s) de 200Bs" );
       }
       if(cien>0){
           System.out.println(cien + " billete(s) de 100Bs" );
        }
        if(cincuen>0){
            System.out.println(cincuen + " billete(s) de 50Bs" );
        }
        if(veinte>0){
            System.out.println(veinte + " billete(s) de 20Bs" );
        }
        if(diez>0){
            System.out.println(diez + " billete(s) de 10Bs" );
        }
        if(cinco>0){
             System.out.println(cinco + " moneda(s) de 5Bs" );
        }
        if(dos>0){
             System.out.println(dos + " moneda(s) de 2Bs" );
        }
        if(uno>0){
        System.out.println(uno + " moneda(s) de 1Bs" );
        }
        if(cincuentaC>0){
            System.out.println(cincuentaC + " moneda(s) de 50 centavos" );
        }
        if (veinteC>0){
            System.out.println(veinteC+ " moneda(s) de 20 centavos" );
        }
        if (diezC>0){
            System.out.println(diezC+ "moneda(s) de 10 centavos" );
        }
    }
}
