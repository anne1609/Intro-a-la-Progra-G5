
import java.util.Scanner;
public class Factorial
{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int nro=sc.nextInt();
        int factorial=calcularFactorial(nro);
        System.out.println("El factorial es:" + factorial);
    }
    static int calcularFactorial(int nro){
        if(nro==0 || nro ==1){
           nro=1;
        }else{
            for(int i=nro-1; i>=1;i--){
                nro=nro*i;
            }
        }
        return nro;
    }
    
}
