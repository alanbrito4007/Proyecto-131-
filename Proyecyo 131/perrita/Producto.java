import java.util.Scanner;

public class Producto {
    private String Nombre,Tipo;
    private float Precio;
    private String Caducidad;
    private int Candidad;
    private int ProductoID;


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
    public int getCandidad() {
        return Candidad;
    }
    public void setCandidad(int candidad) {
        Candidad = candidad;
    }
    public void setProductoID(int productoID) {
        ProductoID = productoID;
    }
    public int getProductoID() {
        return ProductoID;
    }

    public void mostrar(){
        System.out.println("    nombre: "+getNombre()+'\n'+"    tipo: "+getTipo()+'\n'+"    precio: "+getPrecio()+'\n'+"    caducidad: "+getCaducidad()+'\n'+"    cantidad: "+getCandidad()+'\n'+"    productoID: "+getProductoID());
    }
    public void leer(){
        Scanner lee=new Scanner(System.in);
        System.out.println("[PRODUCTO] ");
        System.out.print("    Nombre: ");String nomb=lee.nextLine();setNombre(nomb);
        System.out.print("    Tipo: ");String tipo=lee.nextLine();setTipo(tipo);
        System.out.print("    Precio: ");float prec=lee.nextInt();setPrecio(prec);
        System.out.print("    Caducidad: ");String caduc=lee.next();setCaducidad(caduc);
        System.out.print("    Cantidad: ");int cant=lee.nextInt();setCandidad(cant);
        System.out.print("    Producto ID: ");int id=lee.nextInt();setProductoID(id);
    }
}
