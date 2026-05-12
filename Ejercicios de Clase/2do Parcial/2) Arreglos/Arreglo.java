
public class Arreglo {

    // ===== ATRIBUTOS =====
    // Estas variables pertenecen al objeto

    // Arreglo atributo de la clase
    public int[] numeros;

    // Valor inicial para llenar el arreglo
    public int valor;

    // Acumulador de la suma
    public int suma;


    // ===== CONSTRUCTOR =====
    public Arreglo() {

        // Inicialización de atributos
        numeros = new int[6];
        valor = 5;
        suma = 0;
    }


    // ===== METODO PARA LLENAR EL ARREGLO =====
    // Usa atributos de la clase
    public void llenarArreglo() {

        for (int i = 0; i < numeros.length; i++) {

            // Se llena el arreglo atributo
            numeros[i] = valor;

            // Se incrementa el atributo valor
            valor++;
        }
    }


    // ===== METODO PARA SUMAR LOS ELEMENTOS =====
    // Usa el arreglo "numeros" atributo y el atributo "suma"
    public void suma() {

        for (int i = 0; i < numeros.length; i++) {

            // Acumula la suma de los elementos
            suma = suma + numeros[i];
        }
    }


    // ===== METODO PARA BUSCAR UN NUMERO =====
     // Usa el arreglo "numeros" atributo
    // nro es un PARAMETRO del metodo
    public boolean buscarNro(int nro) {

        // Variable local
        boolean seEncontro = false;

        for (int i = 0; i < numeros.length; i++) {

            // Busca el parametro nro dentro del arreglo "numeros" atributo
            if (numeros[i] == nro) {
                seEncontro = true;
                //si lo encontro ya no sigue buscando se sale con el break
                break;
            }
        }

        // Retorna true o false
        return seEncontro;
    }


    // ===== METODO PARA CONTAR OCURRENCIAS =====
    // numeros2 es un PARAMETRO del metodo
    public void contarOcurrencias(int[] numeros2) {

        // Variables locales contadoras
        int cont5 = 0;
        int cont6 = 0;
        int cont7 = 0;
        int cont8 = 0;
        int cont9 = 0;

        for (int i = 0; i < numeros2.length; i++) {

            // Cuenta ocurrencias de cada numero
            if (numeros2[i] == 5) {
                cont5++;
            }

            if (numeros2[i] == 6) {
                cont6++;
            }

            if (numeros2[i] == 7) {
                cont7++;
            }

            if (numeros2[i] == 8) {
                cont8++;
            }

            if (numeros2[i] == 9) {
                cont9++;
            }
        }
        System.out.println("El nuevo arreglo  que recibi por parametro es: ");
         // Imprime el arreglo "numeros2" que es mi parametro del metodo
        for (int i = 0; i < numeros2.length; i++) {
            System.out.print(numeros2[i] + " ");
        }
        System.out.println();
        // Impresion de resultados
        System.out.println("Las ocurrencias de 5 son: " + cont5);
        System.out.println("Las ocurrencias de 6 son: " + cont6);
        System.out.println("Las ocurrencias de 7 son: " + cont7);
        System.out.println("Las ocurrencias de 8 son: " + cont8);
        System.out.println("Las ocurrencias de 9 son: " + cont9);
    }


    // ===== METODO PARA IMPRIMIR RESULTADOS =====
    public void imprimir() {

        System.out.println("Elementos del arreglo:");

        // Imprime el arreglo "numeros" atributo
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }

        System.out.println();

        // Imprime el atributo suma
        System.out.println("La suma es: " + suma);

        // Llamada al metodo buscarNro
        // Se envia 7 como argumento
        if (buscarNro(7) == true) {

            System.out.println("El numero 7 si existe en el arreglo.");

        } else {

            System.out.println("El numero 7 no existe en el arreglo.");
        }
    }


    // ===== METODO MAIN =====
    public static void main(String args[]) {

        // Creacion de un objeto
        Arreglo arreglo = new Arreglo();

        // Llamada a metodos
        arreglo.llenarArreglo();

        arreglo.suma();

        arreglo.imprimir();
        
        // Se envia un arreglo como argumento
        arreglo.contarOcurrencias(new int[]{2, 5, 5, 7, 0, 1});
    }
}
