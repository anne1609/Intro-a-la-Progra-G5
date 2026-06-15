

public class Busqueda
{
    int mat[][];
    int tam;
    public Busqueda(int tam){
     this.tam=tam;
     mat=new int[tam][tam];
    }
    public void llenarYmostrarMatriz(){
        
        for(int i=0;i<tam;i++){
         for(int j=0;j<tam;j++){
            mat[i][j]= (int)(Math.random()*12);
            System.out.print(mat[i][j] + "\t");
         }
          System.out.println();
    
        }
    }
    int buscarElemento(int buscado){
     int ini=0;
     int fin=tam;
     int ocurrencias=0;
     while(ini<fin){
         //izq-der
         for(int j=ini;j<fin;j++){
             if(buscado==mat[ini][j]){
              ocurrencias++;   
             }
         }
         
         //arri-aba
         for(int i=ini+1;i<fin;i++){
           if(buscado==mat[i][fin-1]){
              ocurrencias++;   
             }
         }
    
         //der-izq
         for(int j=fin-2;j>=ini;j--){
             if(buscado==mat[fin-1][j]){
                 ocurrencias++;
             }
         }
         //Aba-arri
         for(int i=fin-2;i>ini;i--){
              if(buscado==mat[i][ini]){
                ocurrencias++;
              }
         }
          
         ini=ini+1;
         fin=fin-1;
     }
     return ocurrencias;
    }
    public static void main(String args[]){
        Busqueda mat= new Busqueda(8);
          System.out.println("Matriz original: ");
          mat.llenarYmostrarMatriz();
          int ocurrencias=mat.buscarElemento(2);
          if(ocurrencias>0){
            System.out.println("Las ocurrencias de 2 son: " + ocurrencias);
          } else{
            System.out.println("El nro no esta presente en la matriz");
            }
          
    }
}
