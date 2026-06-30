    //Aun falta:
    //agregar calcularMenor
    //agregar calcularPromedioGeneral
    //Histograma
    //Si quisieran se puede clasificar mejor los rangos
import java.util.Scanner;
public class Ejer3
{
    final static int Tam=5;
    int [] ocurrencias=new int[Tam];
    double [] promedios=new double[Tam];
    int [] mayores=new int[Tam];
    int [] menores=new int[Tam];
    int [] sumas=new int[Tam];
    int n;
    int nro;
    public Ejer3(){
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        for(int i=0;i<n;i++){
            nro=sc.nextInt();
            while(nro<0 || nro>100){
                System.out.println("Introdujiste un nro fuera del rango, introduce otro: ");
                nro=sc.nextInt();
            }
            realizarOperaciones();
        }
    
    }
    public void realizarOperaciones(){
      if(nro>=0 && nro<=20){ //Primer rango
        ocurrencias[0]++;
        calcularMayor(0);
        sumas[0]=sumas[0]+nro;
      }else if(nro>=21 && nro<=40){//2do rango
        ocurrencias[1]++;
        calcularMayor(1);
        sumas[1]=sumas[1]+nro;
     }else if(nro>=41 && nro<=60){//3er rango
        ocurrencias[2]++;
        calcularMayor(2);
        sumas[2]=sumas[2]+nro;
     }else if(nro>=61 && nro<=80){//4to rango
        ocurrencias[3]++;
        calcularMayor(3);
        sumas[3]=sumas[3]+nro;
     }else if(nro>=81 && nro<=100){//5to rango
        ocurrencias[4]++;
        calcularMayor(4);
        sumas[4]=sumas[4]+nro;
     }
     
    }
    public void calcularPromedios()
    {
        for(int i=0;i<Tam;i++){
           if(ocurrencias[i]!=0){
            promedios[i]=(double)sumas[i]/ocurrencias[i];
           }
        }
    }
    public void calcularMayor(int pos){ 
      if(mayores[pos]<nro){
        mayores[pos]=nro;
      }
    }
    
    public void mostrar(){
     for(int i=0; i<Tam;i++){
         System.out.print("Rango " +(i+1)+" : " + ocurrencias[i] + " ocurrencias");
         System.out.println();
     }
     for(int i=0; i<Tam;i++){
      System.out.print("Mayor del Rango" +(i+1)+" : " + mayores[i]);
      System.out.println();
     }
     for(int i=0; i<Tam;i++){
      System.out.print("Promedio del rango " +(i+1)+" : " + promedios[i]);
      System.out.println();
     }
    }
    public static void main(String args[]){
        Ejer3 ejer= new Ejer3();
        ejer.calcularPromedios();
        ejer.mostrar();
    }
}
