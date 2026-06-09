public class ListaDobleProducto {
    private NodoPC p;
    public ListaDobleProducto(){
        p=null;
    }

    public NodoPC getP() {
        return p;
    }

    public void setP(NodoPC p) {
        this.p = p;
    }
    public void adicionar(Producto productoCliente){
        NodoPC nue=new NodoPC();
        nue.setProducto(productoCliente);
        if (getP()==null){
            setP(nue);
        }
        else {
            nue.setSig(getP());
            getP().setAnt(nue);
            setP(nue);
        }
    }
    public void mostrar()
    {

        NodoPC r=getP();
        int i=1;
        System.out.println("--- [PRODUCTOS REGISTRADOS] --- ");
        while(r!=null)
        {
            System.out.println("    PRODUCTO #"+(i++));
            r.getProducto().mostrar();
            r=r.getSig();
        }
    }
    public void leer(){
        Producto productoCliente=new Producto();
        productoCliente.leer();
        NodoPC nue=new NodoPC();
        nue.setProducto(productoCliente);
        if (getP()==null){
            setP(nue);
        }
        else {
            nue.setSig(getP());
            getP().setAnt(nue);
            setP(nue);
        }
    }
}
