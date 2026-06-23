import java.util.Scanner;
 public class Fifa
{
    final static int TAM_MAX =200;
    Pais paises[];
    int indice; //o puntero
    Fifa(){
        paises=new Pais[TAM_MAX];
        indice=0;
        paises=new Pais[TAM_MAX];
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
        }
        
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

    public void visualizarPaises() {
        if (indice >0) {
            for (int i = 0; i < indice; i++) {
                paises[i].mostrarPais();
            }
        }else{
         System.out.println("No hay países registrados.");
        }
    }

    public void añadirPais() {
        Scanner sc = new Scanner(System.in);

     if (indice < TAM_MAX) {
        String nombre;
        boolean existe;

        do {
            System.out.print("Nombre del país: ");
            nombre = sc.nextLine();

            existe = existePais(nombre);

            if (existe) {
                System.out.println("Ese país ya está registrado.");
            }

        } while (existe);

        System.out.print("Cantidad de futbolistas: ");
        int cantFutbolistas = sc.nextInt();
        sc.nextLine();

        System.out.print("Color de camiseta: ");
        String colorCamiseta = sc.nextLine();

        System.out.print("Año de fundación: ");
        int anioFundacion = sc.nextInt();
        sc.nextLine();

        System.out.print("Nombre del presidente: ");
        String nombrePresi = sc.nextLine();

        paises[indice] = new Pais(
                nombre,
                cantFutbolistas,
                colorCamiseta,
                anioFundacion,
                nombrePresi
        );

        indice++;

        System.out.println("País añadido");
      }else{
       System.out.println("No se pueden añadir más países");  
      }
    }

    public int buscarPais(String nombre) {
        int pos=-1;
        for (int i = 0; i < indice; i++) {
            if (paises[i].nombre.equalsIgnoreCase(nombre)) {
                pos=i;
                break;
            }
        }
        return pos;
    }
    
    public void eliminarPais(String nombre) {
       int pos = buscarPais(nombre);
        if (pos == -1) {
            System.out.println("País no encontrado.");
        }else{

        for (int i = pos; i < indice - 1; i++) {
            paises[i] = paises[i + 1];
        }

        paises[indice - 1] = null;
        indice--;

        System.out.println("País eliminado correctamente.");
       }
    }
}

