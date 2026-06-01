public class ListaProdCliente {
    private NodoPC p;
    public ListaProdCliente(){
        p=null;
    }

    public NodoPC getP() {
        return p;
    }

    public void setP(NodoPC p) {
        this.p = p;
    }
    public void adicionar(ProductoCliente productoCliente){
        NodoPC nue=new NodoPC();
        nue.setProductoCliente(productoCliente);
        if (getP()==null){
            setP(nue);
        }
        else {
            nue.setSig(getP());
            setP(nue);
        }
    }
    public void mostrar(){
        System.out.println();
        System.out.println("[ LISTA DE PRODUCTOS CLIENTE ]");
        getP().getProductoCliente().getProducto().mostrar();
    }
}
