public class Espiralv2
{
    int tam;

    public Espiralv2(int tam){
        this.tam=tam;
    }

    int[][] llenarMatriz(){
        int[][] mat=new int[tam][tam];
        for(int i=0;i<tam;i++){
            for(int j=0;j<tam;j++){
                mat[i][j]=(int)(Math.random()*10);
            }
        }
        return mat;
    }

    void mostrarMatriz(int[][] mat){
        for(int i=0;i<tam;i++){
            for(int j=0;j<tam;j++){
                System.out.print(mat[i][j] +"\t");
            }
            System.out.println();
        }
    }

    int[][] ordenarMatrizEspiral(int[][] mat){
        int total=tam*tam;

        // llenar copia
        int[] copia=new int[total];
        int x=0;
        for(int i=0;i<tam;i++){
            for(int j=0;j<tam;j++){
                copia[x]=mat[i][j];
                x++;
            }
        }

        // Ordenar la copia con burbuja
        for(int i=1;i<total;i++){
            for(int j=0;j<total-i;j++){
                if(copia[j]>copia[j+1]){
                    int aux=copia[j];
                    copia[j]=copia[j+1];
                    copia[j+1]=aux;
                }
            }
        }

        // Espiral
        int ini=0;
        int fin=tam;
        int mitad=tam/2;
        if(tam%2!=0){
            mitad=tam/2+1;
        }
        x=0;
        for(int a=0;a<mitad;a++){
            //Izq-Der
            for(int j=ini;j<fin;j++){
                mat[ini][j]=copia[x];
                x++;
            }
            //Arri-Aba
            for(int i=ini+1;i<fin;i++){
                mat[i][fin-1]=copia[x];
                x++;
            }
            //Der-Izq
            for(int j=fin-2;j>=ini;j--){
                mat[fin-1][j]=copia[x];
                x++;
            }
            //Aba-Arri
            for(int i=fin-2;i>ini;i--){
                mat[i][ini]=copia[x];
                x++;
            }
            ini=ini+1;
            fin=fin-1;
        }
        return mat;
    }

    public static void main(String args[]){
        Espiralv2 esp=new Espiralv2(8);
        int[][] mat=esp.llenarMatriz();
        System.out.println("Matriz original: ");
        esp.mostrarMatriz(mat);
        System.out.println();
        System.out.println("Matriz espiral ordenada: ");
        mat=esp.ordenarMatrizEspiral(mat);
        esp.mostrarMatriz(mat);
    }
}