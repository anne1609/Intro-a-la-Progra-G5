
import java.util.Scanner;
public class PiramideSimple
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca nro de filas");
        int filas=sc.nextInt();
        for(int i=1;i<=filas;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        
    }
}
