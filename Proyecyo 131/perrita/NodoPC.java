public class NodoPC {
    private Producto PC;
    private NodoPC sig,ant;
    public NodoPC(){
        sig=ant=null;
    }
    public Producto getProducto() {
        return PC;
    }
    public void setProducto(Producto productoCliente) {
        this.PC = productoCliente;
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
