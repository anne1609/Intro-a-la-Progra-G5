
import java.util.Scanner;
public class Busqueda
{
    public static void main (String args[]){
        int notas [] = {80,90,100,50};
        Scanner sc= new Scanner(System.in);
        int nota= sc.nextInt();
        for(int i=0;i<notas.length;i++){
            if(nota==notas[i]){
                System.out.println("Nota encontrada");
            }else{
                System.out.println("Nota no encontrada");
            }
        }
    }
}
