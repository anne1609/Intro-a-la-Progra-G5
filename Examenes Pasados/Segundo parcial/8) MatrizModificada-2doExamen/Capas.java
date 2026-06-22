

public class Capas
{
    int mat[][];
    int tam;
    public Capas(int tam){
     this.tam=tam;
     mat=new int[tam][tam];
    }
    public void llenarYmostrarMatriz(){
        int valor=1;
        for(int i=0;i<tam;i++){
         for(int j=0;j<tam;j++){
            mat[i][j]= valor;
            System.out.print(mat[i][j] + "\t");
         }
          System.out.println();
         valor++;
        }
    }
    void recorridoCapas(){
     int ini=0;
     int fin=tam;
     
     while(ini<fin){
         //izq-der
         for(int j=ini;j<fin;j++){
             System.out.print(mat[ini][j]+ "\t");
         }
         System.out.println();
         //arri-aba
         for(int i=ini+1;i<fin;i++){
             System.out.print(mat[i][fin-1]+ "\t");
         }
         System.out.println();
         //der-izq
         for(int j=fin-2;j>=ini;j--){
             System.out.print(mat[fin-1][j]+ "\t");
         }
         System.out.println();
         //Aba-arri
         for(int i=fin-2;i>ini;i--){
             System.out.print(mat[i][ini]+ "\t");
         }
         System.out.println();
         
          
         ini=ini+2;
         fin=fin-2;
     }
    }
    public static void main(String args[]){
        Capas mat= new Capas(5);
          System.out.println("Matriz original: ");
          mat.llenarYmostrarMatriz();
          System.out.println("Recorrido espiral modificado: ");
          mat.recorridoCapas();
    }
}