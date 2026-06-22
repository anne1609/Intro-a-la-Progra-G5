

public class Pais
{
   String nombre;
   int cantFutbolistas;
   String colorCamiseta;
   int anioFundacion;
   String presidente;
   public Pais(String nombre, int cantFutbolistas, String colorCamiseta, int anioFundacion, String presidente){
    this.nombre=nombre;
    this.cantFutbolistas=cantFutbolistas;
    this.colorCamiseta=colorCamiseta;
    this.anioFundacion=anioFundacion;
    this.presidente=presidente;
  }
  public void mostrarPais(){
    System.out.println("El nombre del pais es:" + nombre);
    System.out.println("La cantidad de futbolistas es:" + cantFutbolistas);
    System.out.println("El color de la camiseta es:" + colorCamiseta);
    System.out.println("El anio de la fundacion es"+ anioFundacion);
    System.out.println("El presidente es: "+ presidente);
    }
}
