import java.util.Scanner;
public class ProductoDigitosBasicos
{
     public static void main(String args[]){
        int num;
        int productoDigitos;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un nro: ");
        num = sc.nextInt();
        if(num>99){
         productoDigitos=calcularProductoDigitos(num);
         System.out.println("El producto de digitos es:" +productoDigitos);
        }else{
           System.out.println("El numero no tiene al menos 3 cifras"); 
        }
    }
    
    static int calcularProductoDigitos(int nro){
        int productoDigitos=1;
        int digito = 0;
        while(nro>0){
          digito= nro%10;   
          productoDigitos=productoDigitos*digito;
          nro=nro/10;  
        }
        return productoDigitos;
    }
}
