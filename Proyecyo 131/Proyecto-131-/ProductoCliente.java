import java.util.Scanner;

public class ProductoCliente {
    private Producto Producto;
    private int Cantidad;
    private float Costo;
    public ProductoCliente(){
    }
    public ProductoCliente(Producto producto, int cantidad, float costo){
        Producto=producto;
        Cantidad=cantidad;
        Costo=costo;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int cantidad) {
        Cantidad = cantidad;
    }

    public float getCosto() {
        return Costo;
    }

    public void setCosto(float costo) {
        Costo = costo;
    }

    public Producto getProducto() {
        return Producto;
    }

    public void setProducto(Producto producto) {
        Producto = producto;
    }
    public void mostrar(){
        System.out.println();
        System.out.println("     PRODUCTO CLIENTE");
        getProducto().mostrar();
        System.out.println("     cantidad: "+getCantidad());
        System.out.println("     costo: "+getCantidad());
    }
    public void leer(){
        Scanner lee=new Scanner(System.in);
        System.out.println("PRODUCTO CLIENTE");
        Producto pro=new Producto();pro.leer();setProducto(pro);
        System.out.print("cantidad: ");int can= lee.nextInt();setCantidad(can);
        System.out.print("costo: ");float costo= pro.getPrecio();setCosto(costo);System.out.println(pro.getPrecio());
    }
}
