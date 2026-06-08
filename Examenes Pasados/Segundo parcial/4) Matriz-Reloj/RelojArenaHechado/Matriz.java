

public class Matriz
{
   int mat[][];
   int tam;
   public Matriz(int tam){
       this.tam=tam;
       mat=new int[tam][tam];
  }
  void llenarMatrizYmostrar(){
   int valor=0;
   for(int i=0;i<tam;i++){
    for(int j=0;j<tam;j++){
     mat[i][j]=valor;
     valor++;
     System.out.print(mat[i][j] +"\t");
    }
    System.out.println();
    }  
  }
  void recorridoParteOscura(){
    int x=0;
    double mitad=tam/2.0;
    for(int j=0;j<tam;j++){
      for(int i=x;i<tam-x;i++){
        System.out.print(mat[i][j] +"\t");
       }
       if(j+1<mitad){
           x++;
        }else if(j+1>mitad){
          x--;
        }
       
       System.out.println();
     } 
   }
   void recorridoParteOscuraParada(){
    int x=0;
    double mitad=tam/2.0;
    for(int i=0;i<tam;i++){
      for(int j=x;j<tam-x;j++){
        System.out.print(mat[i][j] +"\t");
       }
       if(i+1<mitad){
           x++;
        }else if(i+1>mitad){
          x--;
        }
       
       System.out.println();
     } 
   }
   void recorridoParteClara(){
    //Parte superior
    int fin,ini;
    if(tam%2==0){
      fin=(tam/2)-1;
    }else{
     fin=tam/2;
    }
    ini=(tam/2)+1;
     int x=1;
    for(int i=0;i<fin;i++){
      for(int j=x;j<tam-x;j++){
        System.out.print(mat[i][j] +"\t");
       }
       x++;
       System.out.println();
     } 
     x--;
    //Parte inferior

    for(int i=ini;i<tam;i++){
      for(int j=x;j<tam-x;j++){
        System.out.print(mat[i][j] +"\t");
       }
       x--;
       System.out.println();
     } 
    }
  public static void main(String args[]){
      Matriz m1=new Matriz(8);
      System.out.println("Matriz original: ");
      m1.llenarMatrizYmostrar();
      System.out.println("Matriz reloj hechado: ");
      m1.recorridoParteOscura();
       System.out.println("Matriz reloj normal: ");
      m1.recorridoParteOscuraParada();
      System.out.println("Matriz parte clara: ");
      m1.recorridoParteClara();
  }
}
