

public class Matriz
{
  int matriz[][];
  int tamanio;
  public Matriz(int tamanio){
      this.tamanio=tamanio;
      matriz= new int[tamanio][tamanio];
    }
  boolean esPar(int num){
    boolean par=false;
    if(num%2==0){
        par=true;
    }
    return par;
  }
  void llenarYmostrarMatriz(){
     int valor=1;
    for(int i=0;i<tamanio;i++){
     for(int j=0;j<tamanio;j++){
         matriz[i][j]=valor;
         valor++;
         System.out.print(matriz[i][j]+"\t");
      }
      System.out.println();
    }
    
  }
  void recorridoAjedrez(){
    for(int i=0;i<tamanio;i++){
     for(int j=0;j<tamanio;j++){
         if(esPar(i) && esPar(j)){
             System.out.print(matriz[i][j]+"\t");            
         }else if(!esPar(i) && !esPar(j)){
            System.out.print(matriz[i][j]+"\t");   
         }
        
      }
      System.out.println();
    }
  }
  void recorridoBordesReloj(){
      //arriba abajo
      for(int i=tamanio-1;i>=0;i--){
         System.out.print(matriz[i][0]+"\t"); 
      }
       System.out.println();
      //diagonal principal
      for(int i=1;i<tamanio-1;i++){
         System.out.print(matriz[i][i]+"\t"); 
      }
       System.out.println();
      //arriba abajo
      for(int i=tamanio-1;i>=0;i--){
         System.out.print(matriz[i][tamanio-1]+"\t"); 
      }
       System.out.println();
      //diagonal secundaria
      for(int i=1;i<tamanio-1;i++){
         System.out.print(matriz[i][tamanio-i-1]+"\t"); 
      }
  }
  public static void main(String args[]){
      Matriz mat=new Matriz(5);
      System.out.println("Matriz original: ");
      mat.llenarYmostrarMatriz();
      System.out.println("Matriz ajedrez: ");
      mat.recorridoAjedrez();
      System.out.println("Recorrido bordes reloj: ");
      mat.recorridoBordesReloj();
    }
}


