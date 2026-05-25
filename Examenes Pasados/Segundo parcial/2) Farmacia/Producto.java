

public class Producto  
{
    String nombre;
    String laboratorio;
    double precio;
    String fechaVencimiento;
    int cant;
    public Producto(String nom,String laboratorio,double precio,String fechaVencimiento,int cant){
      nombre=nom;
      this.laboratorio=laboratorio;
      this.precio=precio;
      this.fechaVencimiento=fechaVencimiento;
      this.cant=cant;
    }
    public void mostrarProducto(){
        System.out.println("El nombre es:" + nombre);
        System.out.println("La fecha de vencimiento:" + fechaVencimiento);
    }
}
