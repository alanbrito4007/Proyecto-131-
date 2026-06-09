public class NodoReciboCliente 
{
    private ReciboCliente reciboCliente;
    private NodoReciboCliente sig,ant;
    public NodoReciboCliente(){
        sig=ant=null;
    }
    public ReciboCliente getReciboCliente() {
        return reciboCliente;
    }
    public void setReciboCliente(ReciboCliente reciboCliente) {
        this.reciboCliente = reciboCliente;
    }
    public NodoReciboCliente getSig() {
        return sig;
    }
    public void setSig(NodoReciboCliente sig) {
        this.sig = sig;
    }
    public NodoReciboCliente getAnt() {
        return ant;
    }
    public void setAnt(NodoReciboCliente ant) {
        this.ant = ant;
    }
    
    
}
