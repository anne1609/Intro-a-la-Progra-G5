
import java.util.Scanner;
public class Farmaciav2
{
   Producto [] productos;
   int puntero;
   Farmaciav2(int cantIni){
       Scanner sc= new Scanner(System.in);
       productos= new Producto[200];
    puntero = 0;
    for(int i=0;i<cantIni;i++){
        System.out.println("Nombre del medicamento:");
        String nombre=sc.nextLine();
        System.out.println("Nombre del laboratorio:");
        String labo=sc.nextLine();
        
        System.out.println("Precio:");
        double precio=sc.nextDouble();
        sc.nextLine();
         System.out.println("Fecha de vencimiento:");
        String fecha=sc.nextLine();
        System.out.println("Cantidad de productos:");
        int cantProductos=sc.nextInt();
        sc.nextLine();
        
        productos[puntero]=new Producto(nombre,labo,precio, fecha, cantProductos);
        puntero++;
    }
    
   } 
   
   void agregarMedicamento(Producto producto){
     if(puntero<productos.length){ 
      productos[puntero] =producto;
      puntero++;
     }else{
       System.out.println("La farmacia esta completa"); 
     }
    }
    
   void eliminarMedicamento(String nombre){
       
    for(int i=0;i<puntero;i++){
        if(productos[i].nombre.equals(nombre)){
           for(int j=i;j<puntero-1;j++){
               productos[j]=productos[j+1];
            }
            productos[puntero-1]=null;
            puntero--;
            break;
        }
    }
   }
    void buscarMedicamento(String nombre){
    boolean encontro=false;
    for(int i=0;i<puntero;i++){
        if(productos[i].nombre.equals(nombre)){
           encontro=true;
        }
    }
    if(encontro){
     System.out.println("El producto esta");
    }else{
     System.out.println("El producto no esta");
    }
   }
   

   void mostrarMedicamentos(){
    for(int i=0;i<puntero;i++){
        productos[i].mostrarProducto();
     }
    
    }
    
    public static void main(String args[]){
        Farmacia farm=new Farmacia();
        Producto prod1=new Producto("Paracetamol","Ifar",2,"12/12/2027",100);
        Producto prod2=new Producto("Ibuprofeno","Ifar",4,"12/12/2027",100);
        farm.agregarMedicamento(prod1);
        farm.agregarMedicamento(prod2);
        //farmacia antes de la eliminacion
        farm.mostrarMedicamentos();
         System.out.println();
        farm.eliminarMedicamento("Ibuprofeno");
        farm.buscarMedicamento("Ibuprofeno");
        //farmacia despues de la eliminacion
       farm.mostrarMedicamentos();
    }
    
}
