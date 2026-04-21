import java.util.Scanner;
public class DoWhile
{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int nro=0;
        do{
            System.out.println("Digite un nro entre 1-5:");
            nro=sc.nextInt();
        }while(!(nro>0 && nro<=5));
      
      } 
}
