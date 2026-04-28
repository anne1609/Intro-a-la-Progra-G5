import java.util.Scanner;
public class Primo
{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int nro= sc.nextInt();
        boolean respuesta=esPrimo(nro);
        if(respuesta==true){
         System.out.println("Es primo");
        }else{
            System.out.println("No es primo");
        }
    }
    
    static boolean esPrimo(int nro){
      boolean primo=true;
       for(int i=2;i<nro;i++){
           if(nro%i==0){
               primo=false;
            }
       }
      return primo;
    }
}
