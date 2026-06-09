
public class ListaDobleCircularVenta {
    private NodoReciboCliente p;
    public ListaDobleCircularVenta(){
        p=null;
    }
    public NodoReciboCliente getP() {
        return p;
    }

    public void setP(NodoReciboCliente p) {
        this.p = p;
    }
    public void adicionar(ReciboCliente rc){
        NodoReciboCliente nue=new NodoReciboCliente();
        nue.setReciboCliente(rc);
        if (getP()==null){
            setP(nue);
            nue.setSig(nue);
            nue.setAnt(nue);
        }
        else {
            NodoReciboCliente u=getP();
            while (u.getSig()!=getP()){
                u=u.getSig();
            }
            nue.setSig(getP());
            getP().setAnt(nue);
            setP(nue);
            nue.setAnt(u);
            u.setSig(getP());
        }
    }
    public void mostrar(){
        NodoReciboCliente r=getP();
        System.out.println("[ LISTA DE RECIBOS ]");
        while (r.getSig()!=getP()){
            System.out.println("   "+r.getReciboCliente());
            r=r.getSig();
        }
        System.out.println("   "+r.getReciboCliente());
    }
}