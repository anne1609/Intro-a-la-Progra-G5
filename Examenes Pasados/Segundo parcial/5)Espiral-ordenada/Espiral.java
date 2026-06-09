

public class Espiral
{
    int mat[][];
    int tam;
    int copia[]; 
    public Espiral(int tam){
     this.tam=tam;
     mat=new int[tam][tam];
     copia=new int [tam*tam];
    }
    void llenarMatriz(){
       for(int i=0;i<tam;i++){
        for(int j=0;j<tam;j++){
            mat[i][j]=(int)(Math.random()*10);
        }
        }
    }
    void llenarCopia(){
     int x=0;
     for(int i=0;i<tam;i++){
        for(int j=0;j<tam;j++){
            copia[x]=mat[i][j];
            x++;
        }
     }
    }
    void ordenarBurbuja(){
        int total= tam*tam;
        for(int i=1; i<total;i++){
         for(int j=0;j<total-i;j++){
            if(copia[j]>copia[j+1]){
                int aux= copia[j];
                copia[j]=copia[j+1];
                copia[j+1]=aux;
            }
         }
        }
    }
    void mostrarMatriz(){
      for(int i=0;i<tam;i++){
        for(int j=0;j<tam;j++){
            System.out.print(mat[i][j] +"\t");
        }
        System.out.println();
      }
    }
    void mostrarArreglo(){
      for(int i=0;i<tam*tam;i++){
        System.out.print(copia[i] +" ");
        }
      }
    void llenarMatrizEspiral(){ 
     int ini=0;
     int fin=tam;
     int mitad=tam/2;
     int x=0;    
     if(tam%2!=0){
         mitad=tam/2+1;
      }
     for(int a=0;a<mitad;a++){
         //Izq-Der
         for(int j=ini; j<fin; j++){
             mat[ini][j]=copia[x];
             x++;
         }
         //Arri-Aba
         for(int i=ini+1; i<fin; i++){
             mat[i][fin-1]=copia[x];
             x++;
         }
         //der-Izq
         for(int j=fin-2; j>=ini; j--){
             mat[fin-1][j]=copia[x];
             x++;
         }
         //Aba-arri
         for(int i=fin-2; i>ini; i--){
             mat[i][ini]=copia[x];
             x++;
         }
         ini=ini+1;
         fin=fin-1;
        }
    }
    public static void main(String args[]){
     Espiral esp= new Espiral(8);
     esp.llenarMatriz();
     System.out.println("Matriz original: ");
     esp.mostrarMatriz();
     System.out.println();
     System.out.println("Mostrar arreglo sin ordenar: ");
     esp.llenarCopia();
     esp.mostrarArreglo();
     System.out.println();
     System.out.println("Mostrar arreglo  ordenado: ");
     esp.ordenarBurbuja();
     esp.mostrarArreglo();
     System.out.println();
     System.out.println("Matriz espiral ordenada: ");
     esp.llenarMatrizEspiral();
     esp.mostrarMatriz();
    }
}
