
import java.util.Scanner;
public class Serie
{
    public static void main (String args[]){
     Scanner sc= new Scanner (System.in);
     int nro = sc.nextInt();
     int n= -1;
     int incremento = 3;
     for(int i=1;i<=nro;i++){
         System.out.print(n+" ");
         n=n+incremento;
         incremento=incremento+2;
     }
}
}