import java.util.Scanner;

public class Producto {
    private String Nombre,Tipo;
    private float Precio;
    private String Caducidad;
    public Producto(String nombre, String tipo, float precio,String caducidad){
        Nombre=nombre;
        Tipo=tipo;
        Precio=precio;
        Caducidad=caducidad;
    }
public Producto(){
}
    public String getCaducidad() {
        return Caducidad;
    }

    public void setCaducidad(String caducidad) {
        Caducidad = caducidad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public float getPrecio() {
        return Precio;
    }

    public void setPrecio(float precio) {
        Precio = precio;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }

    public void mostrar(){
        System.out.println("     PRODUCTO: nombre: "+getNombre()+", tipo: "+getTipo()+", precio: "+getPrecio()+", caducidad: "+getCaducidad());
    }
    public void leer(){
        Scanner lee=new Scanner(System.in);
        System.out.println("Producto ");
        System.out.print("    Nombre: ");String nomb=lee.nextLine();setNombre(nomb);
        System.out.print("    Tipo: ");String tipo=lee.nextLine();setTipo(tipo);
        System.out.print("    Precio: ");float prec=lee.nextInt();setPrecio(prec);
        System.out.print("    Caducidad: ");String caduc=lee.next();setCaducidad(caduc);
    }
}
