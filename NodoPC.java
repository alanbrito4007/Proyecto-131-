public class NodoPC {
    private ProductoCliente productoCliente;
    private NodoPC sig,ant;
    public NodoPC(){
        sig=ant=null;
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

    public NodoPC getAnt() {
        return ant;
    }

    public void setAnt(NodoPC ant) {
        this.ant = ant;
    }
}
