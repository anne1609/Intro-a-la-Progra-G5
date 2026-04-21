import java.util.Scanner;
public class Ejer2
{
    public  static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int nro=0;
      do{
      nro=sc.nextInt();
     }while(nro<=0);
      int cont=0;
      while(nro!=1){
        System.out.print(nro + "->");
        if(nro%2==0){
            nro=nro/2;
        }else{
           nro=nro*3+1;
        }
        cont++;
     }
     System.out.print(1+".");
     System.out.println();
     System.out.println("Llegada a 1 en "+ cont + " pasos");
    }
}
