import java.util.Scanner;

public class Compra {
    private Producto Producto;
    private String Lugar;
    private Persona Persona;
    private int Cantidad;
    public Compra(){
    }
    public Compra(Producto producto, String lugar, Persona persona, int cantidad){
        Producto=producto;
        Lugar=lugar;
        Persona =persona;
        Cantidad=cantidad;
    }
    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int cantidad) {
        Cantidad = cantidad;
    }

    public String getLugar() {
        return Lugar;
    }

    public void setLugar(String lugar) {
        Lugar = lugar;
    }

    public Persona getPersona() {
        return Persona;
    }

    public void setPersona(Persona persona) {
        Persona = persona;
    }

    public Producto getProducto() {
        return Producto;
    }

    public void setProducto(Producto producto) {
        Producto = producto;
    }
    public void mostrar(){
        System.out.println("[ COMPRA ]");
        getProducto().mostrar();
        System.out.println("     lugar: "+getLugar());
        getPersona().mostrar();
        System.out.println("     cantidad: "+getCantidad());
    }
    public void leer(){
        Scanner lee=new Scanner(System.in);
        System.out.println("[ Introduzca una compra ]");
        Producto producto=new Producto();producto.leer();setProducto(producto);
        Persona persona=new Persona();persona.leer();setPersona(persona);
        System.out.print("Lugar de compra del producto: ");String lugar= lee.nextLine();setLugar(lugar);
        System.out.print("Cantidad comprada: ");int cant= lee.nextInt();setCantidad(cant);

    }
}
