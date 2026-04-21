import java.util.Scanner;
public class Ejer1v1
{
    public  static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      double lunes = sc.nextDouble();
      double martes = sc.nextDouble();
      double miercoles = sc.nextDouble();
      double jueves = sc.nextDouble();
      double viernes = sc.nextDouble();
      double sabado = sc.nextDouble();
      double domingo = sc.nextDouble();
      double promedio=calcularPromedio(lunes, martes, miercoles,jueves,viernes,  sabado,  domingo);
      System.out.println("El promedio es: "+ promedio);
      int cont= calcularDiasEncima(lunes, martes, miercoles,jueves,viernes,  sabado,  domingo, promedio);
      System.out.println("Son "+ cont + " dias que estan encima del promedio");
      double mayor= calcularLaMasAltaTemp(lunes, martes, miercoles,jueves,viernes,  sabado,  domingo);
      System.out.println("El mayor es: "+ mayor);
      double menor = calcularLaMasBajaTemp(lunes, martes, miercoles,jueves,viernes,  sabado,  domingo);
      System.out.println("El menor es:" + menor);
    }
    
    static double calcularPromedio(double lunes, double martes, double miercoles, double jueves, double viernes, double sabado, double domingo){
        double promedio=(lunes+ martes+miercoles+jueves+viernes+sabado+domingo)/7;
        return promedio;
    }
    static int calcularDiasEncima(double lunes, double martes, double miercoles, double jueves, double viernes, double sabado, double domingo, double promedio){
        int cont=0;
        
        if(lunes>promedio){
            cont++;
        }
        if(martes>promedio){
            cont++;
        } 
        if(miercoles>promedio){
            cont++;
        }
        if(jueves>promedio){
            cont++;
        }
        if(viernes>promedio){
         cont++;
        }
        if(sabado>promedio){
         cont++;
        }
        if(domingo>promedio){
         cont++;
        }
        return cont;  
    }
    static double calcularLaMasAltaTemp(double lunes, double martes, double miercoles, double jueves, double viernes, double sabado, double domingo){
        double mayor=lunes;
        if(mayor<martes){
            mayor=martes;
        }
        if(mayor<miercoles){
            mayor=miercoles;
        }
        if(mayor<jueves){
            mayor=jueves;
        }
        if(mayor<viernes){
            mayor=viernes;
        }
        if(mayor<sabado){
            mayor=sabado;
        }
        if(mayor<domingo){
            mayor=domingo;
        }
        return mayor;
    }
    static double calcularLaMasBajaTemp(double lunes, double martes, double miercoles, double jueves, double viernes, double sabado, double domingo){
        double menor=lunes;
        if(menor>martes){
            menor=martes;
        }
        if(menor>miercoles){
            menor=miercoles;
        }
        if(menor>jueves){
            menor=jueves;
        }
        if(menor>viernes){
            menor=viernes;
        }
        if(menor>sabado){
            menor=sabado;
        }
        if(menor>domingo){
            menor=domingo;
        }
        return menor;
    }
}


