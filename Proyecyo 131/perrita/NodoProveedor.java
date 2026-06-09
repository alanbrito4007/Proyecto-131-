public class NodoProveedor 
{
    private Proveedor proveedor;
    private NodoProveedor sig;
    public NodoProveedor(){
        sig=null;
    }
    public Proveedor getProveedor() {
        return proveedor;
    }
    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }
    public NodoProveedor getSig() {
        return sig;
    }
    public void setSig(NodoProveedor sig) {
        this.sig = sig;
    }
    
}
