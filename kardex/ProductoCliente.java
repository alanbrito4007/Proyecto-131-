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
}
