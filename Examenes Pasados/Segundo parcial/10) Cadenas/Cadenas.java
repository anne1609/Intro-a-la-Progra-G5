

public class Cadenas
{
   public static void cadena2(String cadenaCompleta, char caracter){
       String cadResultado="";
       for(int i=0; i<cadenaCompleta.length();i++){
           if(cadenaCompleta.charAt(i)!=caracter){
               cadResultado=cadResultado + cadenaCompleta.charAt(i);
           }
        }
        System.out.println("La cadena resultado es " + cadResultado);
    } 
    
   public static void main (String args[]){
       cadena2("casa campestre",'a');
   }
}
