public class NodoPC {
    private ProductoCliente productoCliente;
    private NodoPC sig;
    public NodoPC(){
        sig=null;
    }

    public ProductoCliente getProductoCliente() {
        return productoCliente;
    }

    public void setProductoCliente(ProductoCliente productoCliente) {
        this.productoCliente = productoCliente;
    }

    public NodoPC getSig() {
        return sig;
    }

    public void setSig(NodoPC sig) {
        this.sig = sig;
    }
}
