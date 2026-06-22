import java.util.Scanner;
 public class Fifa
{
    final static int TAM_MAX =200;
    Pais paises[];
    int indice; //o puntero
    Fifa(){
        paises=new Pais[TAM_MAX];
        indice=0;
        /*paises=new Pais[TAM_MAX];
        indice=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduzca la cantidad de paises iniciales: ");
        int cantidadInicial=sc.nextInt();
        sc.nextLine();
        if(cantidadInicial> TAM_MAX){
           cantidadInicial=TAM_MAX;
        }
        for(int i=0;i<cantidadInicial;i++){
            System.out.println("Registro de paises");
            String nombre;
            boolean existe;
            do{
             System.out.println("Nombre del pais: ");
             nombre=sc.nextLine();
             existe=existePais(nombre);
             if(existe==true){
                  System.out.println("Este pais ya existe, ingrese otro");
             }
            }while(existe==true);
            System.out.println("Cantidad de futbolistas: ");
            int cantFutbolistas=sc.nextInt();
            sc.nextLine();
            
            System.out.println("Color de camiseta: ");
            String colorCamiseta=sc.nextLine();
            
            System.out.println("Anio de fundacion ");
            int anioFundacion=sc.nextInt();
            sc.nextLine();
            
            System.out.println("Nombre del presidente ");
            String nombrePresidente=sc.nextLine();
           
            paises[indice]=new Pais(nombre,cantFutbolistas,colorCamiseta,anioFundacion,nombrePresidente);
            indice++;
        }*/
        
        } 
    public  boolean existePais(String nombre){
            boolean esta=false;
            for(int i=0;i<indice;i++){
               
             if(paises[i].nombre.equalsIgnoreCase(nombre)){
                esta=true; 
             }
            }
            return esta;
    }
    public void paisAntiguo(){
        if(indice>0){
            int pos=0;
         for(int i=0;i<indice;i++){
            if(paises[i].anioFundacion<paises[pos].anioFundacion){
                pos=i;
            }
        }
        System.out.println("El pais mas antiguo es: ");
        paises[pos].mostrarPais();
    }else{
        System.out.println("No hay paises para mostrar");
    }
}
}

