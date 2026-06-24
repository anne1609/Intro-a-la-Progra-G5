import java.util.Scanner;

public class Fifa {

    final static int TAM_MAX = 200;
    String[] nombres = new String[TAM_MAX];
    int[] futbolistas = new int[TAM_MAX];
    String[] colores = new String[TAM_MAX];
    int[] anios = new int[TAM_MAX];
    String[] presidentes = new String[TAM_MAX];
    int indice = 0;
 
    Fifa() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduzca la cantidad de paises iniciales: ");
    int cantidadInicial = sc.nextInt();
    sc.nextLine();
    
    
    if ((cantidadInicial > TAM_MAX )|| (cantidadInicial<0)) {
        //Control de que cantidad inicial, nunca se pase del tamanio maximo del arreglo y tambien que siempre sea positivo 
        System.out.println("Cantidad inicial de paises no valida");
    }else{

        for (int i = 0; i < cantidadInicial; i++) {
            System.out.println("Registro de paises iniciales");
    
            String nombre;
            boolean existe;
            
            //antes de agregar verifica que no exista el pais en el arreglo
            do {
                System.out.println("Nombre del pais: ");
                nombre = sc.nextLine();
    
                existe = existePais(nombre);
    
                if (existe == true) {
                    System.out.println("Este pais ya existe, ingrese otro");
                }
    
            } while (existe == true);
            
            nombres[indice] = nombre;
            System.out.println("Cantidad de futbolistas: ");
            futbolistas[indice] = sc.nextInt();
            sc.nextLine();
            
            System.out.println("Color de camiseta: ");
            colores[indice] = sc.nextLine();
            
            System.out.println("Anio de fundacion: ");
            anios[indice] = sc.nextInt();
            sc.nextLine();
            
            System.out.println("Nombre del presidente: ");
            presidentes[indice] = sc.nextLine();
            
            indice++;                                            
            
        }
     }
   }
   

    public boolean existePais(String nombre) {
        boolean esta=false;
        for (int i = 0; i < indice; i++) {
            if (nombres[i].equalsIgnoreCase(nombre)) {
                esta=true;
            }
        }
        return esta;
    }

    public void anadirPais() {
        Scanner sc = new Scanner(System.in);
        if (indice < TAM_MAX) {
        String nombre;
        boolean existe;
        System.out.println("Agregar un nuevo pais: ");
        //antes de agregar verifica que no exista el pais en el arreglo
        do {
            System.out.print("Nombre del pais: ");
            nombre = sc.nextLine();

            existe = existePais(nombre);

            if (existe==true) {
                System.out.println("Ese pais ya esta registrado.");
            }

        } while (existe==true);

            nombres[indice] = nombre;
            System.out.println("Cantidad de futbolistas: ");
            futbolistas[indice] = sc.nextInt();
            sc.nextLine();
            
            System.out.println("Color de camiseta: ");
            colores[indice] = sc.nextLine();
            
            System.out.println("Anio de fundacion: ");
            anios[indice] = sc.nextInt();
            sc.nextLine();
            
            System.out.println("Nombre del presidente: ");
            presidentes[indice] = sc.nextLine();
            
            indice++;                                            
            
            System.out.println("Pais añadido correctamente");
      }else{
          System.out.println("No se pueden añadir mas paises, ya se alcanzo el limite");
      }
    }
    
    // en este se muestran todos los paises del arreglo
    public void mostrarPaises() {
      if (indice>0) {
        for (int i = 0; i < indice; i++) {
            mostrarPais(i);
        }
       }else{
        System.out.println("No hay paises registrados.");
      }
    }
    //en el sgte solo se muestra un solo pais, dada una posicion
    public void mostrarPais(int pos){
        System.out.println("-----------------------------------------" );
        System.out.println("Nombre del pais: " + nombres[pos]);
        System.out.println("Cantidad de futbolistas: " + futbolistas[pos]);
        System.out.println("Color de camiseta: " + colores[pos]);
        System.out.println("Anio de fundacion: " + anios[pos]);
        System.out.println("Presidente: " + presidentes[pos]);
    }

    public int buscarPais(String nombre) {
        int pos=-1;
        for (int i = 0; i < indice; i++) {
            if (nombres[i].equalsIgnoreCase(nombre)) {
                pos=i;
            }
        }
        
        return pos;
    }

    public void paisAntiguo() {
     if (indice >0) {
        int pos = 0;
        for (int i = 1; i < indice; i++) {
            if (anios[i] < anios[pos]) {
                pos = i;
            }
        }
        System.out.println("El pais mas antiguo es:");
        mostrarPais(pos);
     }else{
         System.out.println("No hay paises registrados.");
     }
    }
    public void eliminarPais(String nombre) {
     int pos = buscarPais(nombre);

        if (pos == -1) {
            System.out.println("Pais no encontrado.");
        } else {
            for (int i = pos; i < indice - 1; i++) {
                nombres[i] = nombres[i + 1];
                futbolistas[i] = futbolistas[i + 1];
                colores[i] = colores[i + 1];
                anios[i] = anios[i + 1];
                presidentes[i] = presidentes[i + 1];
            }
            indice--;
            System.out.println("Pais eliminado correctamente.");
        }
    }
    //Ejemplo con un main corto
    public static void main(String[] args) {
      Fifa Fifa= new Fifa();
      Fifa.mostrarPaises();
      Fifa.anadirPais();
      int pos=Fifa.buscarPais("Bolivia");
      if(pos!=-1){
          Fifa.mostrarPais(pos);
      }else{
          System.out.println("No se encontro ese pais");
      }
      Fifa.paisAntiguo();
      Fifa.eliminarPais("Bolivia");
      Fifa.mostrarPaises();
    }
    
   //Ejemplo de un main largo
   /*
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    Fifa fifa = new Fifa();

    int opcion;

    do {
        System.out.println("\n===== MENU FIFA =====");
        System.out.println("1. Visualizar paises");
        System.out.println("2. Añadir pais");
        System.out.println("3. Buscar pais");
        System.out.println("4. Pais mas antiguo");
        System.out.println("5. Eliminar pais");
        System.out.println("6. Salir");
        System.out.print("Opcion: ");

        opcion = sc.nextInt();
        sc.nextLine();

        switch (opcion) {
            case 1:
                fifa.mostrarPaises();
                break;

            case 2:
                fifa.anadirPais();
                break;

            case 3:
                System.out.print("Ingrese nombre del pais: ");
                String nombreBuscar = sc.nextLine();

                int pos = fifa.buscarPais(nombreBuscar);

                if (pos == -1) {
                    System.out.println("Pais no encontrado.");
                } else {
                    fifa.mostrarPais(pos);
                }
                break;

            case 4:
                fifa.paisAntiguo();
                break;

            case 5:
                System.out.print("Ingrese nombre del pais a eliminar: ");
                String nombreEliminar = sc.nextLine();
                fifa.eliminarPais(nombreEliminar);
                fifa.mostrarPaises();
                break;

            case 6:
                System.out.println("Se salio con exito");
                break;

            default:
                System.out.println("Opcion incorrecta");
        }

    } while (opcion != 6);
  }*/



}