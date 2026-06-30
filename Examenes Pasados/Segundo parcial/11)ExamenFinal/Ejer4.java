
import java.util.Scanner;
public class Ejer4
{
    int mat[][];
    int n;
    int m;
    public Ejer4(){
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        mat=new int[n][m];
        for (int i=0; i<n; i++)
            for (int j=0; j<m; j++)
                mat[i][j]=(int)(Math.random()*20);
    
    }
    public boolean esPrimo(int nro){
       boolean es=true;
       if(nro==0 || nro==1){
           es=false;
       }else{
           for(int i=2;i<nro;i++){
               if(nro%i ==0){
                es=false;
               }
            }
        }
        return es;
    }
    public int[] devolverPrimos(){
        int pos=0;
        int cont=0;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(esPrimo(mat[i][j])==true){
                 //Si solo quisieras imprimir
                  //System.out.print(mat[i][j]);  
                  cont++;
                }
            }
        }
        int nrosPrimos[]=new int[cont];
          for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(esPrimo(mat[i][j])==true){
                 nrosPrimos[pos]=mat[i][j];
                 pos++;
                }
            }
        }
        return nrosPrimos;
    }
    public void mostrarPrimos(){
        int numerosPrimos[]=devolverPrimos();
        for(int i=0;i<numerosPrimos.length;i++){
           System.out.println(numerosPrimos[i]); 
        }
    }
    public void mostrarMatriz(){
      for (int i=0; i<n; i++){
            for (int j=0; j<m; j++){
               System.out.print(mat[i][j] + "\t");
            }
            System.out.println();
      }
      System.out.println();
    }
    public static void main(String args[]){
        Ejer4 ejer=new Ejer4();
        ejer.mostrarMatriz();
        ejer.mostrarPrimos();
    }
}
