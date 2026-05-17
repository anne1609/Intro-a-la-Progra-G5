

public class Bolsa
{
   int [] numeros;
   int puntero;
   Bolsa(){
    numeros= new int[30];
    puntero = 0;
   }  
   void agregarElemento(int elemento){
     if(puntero<numeros.length){ 
      numeros[puntero] =elemento;
      puntero++;
     }else{
       System.out.println("La bolsa esta llena"); 
     }
    }
   void eliminarElemento(int elemento){
    for(int i=0;i<puntero;i++){
        if(elemento==numeros[i]){
           for(int j=i;j<puntero-1;j++){
               numeros[j]=numeros[j+1];
            }
            numeros[puntero-1]=0;
            puntero--;
            break;
        }
    }
   }
   boolean buscarElemento(int elemento){
       boolean buscado=false;
        for(int i=0;i<puntero;i++){
        if(elemento==numeros[i]){
           buscado=true;
        }
       }
        return buscado;
    }
   void mostrarBolsa(){
    for(int i=0;i<puntero;i++){
        System.out.print(numeros[i]+" ");
     }
    System.out.println();
    }
    public static void main(String args[]){
        Bolsa bolsa=new Bolsa();
        bolsa.agregarElemento(2);
        bolsa.agregarElemento(5);
        bolsa.agregarElemento(8);
        //bolsa antes de la eliminacion
        bolsa.mostrarBolsa();
        bolsa.eliminarElemento(5);
        if (bolsa.buscarElemento(8)) {
            System.out.println("El 8 pertenece a la bolsa.");
        } else {
            System.out.println("El 8 no pertenece a la bolsa.");
        }
        //bolsa despues de la eliminacion
        bolsa.mostrarBolsa();
    }
}
