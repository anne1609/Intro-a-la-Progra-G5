
import java.util.Scanner;
public class CuadradoAsteriscos
{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int filas= sc.nextInt();
        for(int i=1;i<=filas;i++){
         for(int j=1;j<=i;j++){
             if(j==i){
                System.out.print(1 + " "); 
             }else{
                System.out.print(j + " ");
             }
             
          }
          System.out.println();
        }
    }
}
