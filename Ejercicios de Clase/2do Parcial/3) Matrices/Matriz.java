
public class Matriz
{
    int matriz[][];
    int n;
    Matriz(int n){
       this.n=n;
       matriz=new int[n][n];
    }
    void llenarIzqDer(){
        int valor=1;
        for(int i=0;i<n;i++){
         for(int j=0;j<n;j++){
            matriz[i][j]=valor;
            valor++;
             System.out.print(matriz[i][j] + "\t");
         }
         System.out.println();
        } 
    }
    void recorridoAbajoArriba(){
        int valor=1;
        for(int j=0;j<n;j++){
         for(int i=n-1;i>=0;i--){
            System.out.print(matriz[i][j]+ "\t");
         }
         System.out.println();
        }
    }
    public static void main(String args[]){
        Matriz mat=new Matriz(4);
        mat.llenarIzqDer();
        System.out.println();
        mat.recorridoAbajoArriba();
    }
}
