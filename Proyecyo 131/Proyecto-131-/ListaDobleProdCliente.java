public class ListaDobleProdCliente {
    private NodoPC p;
    public ListaDobleProdCliente(){
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
            getP().setAnt(nue);
            setP(nue);
        }
    }
    public void mostrar(){
        System.out.println();
        System.out.println("[ LISTA DE PRODUCTOS CLIENTE ]");
        getP().getProductoCliente().getProducto().mostrar();
    }
    public void leer(){
        ProductoCliente productoCliente=new ProductoCliente();
        productoCliente.leer();
        NodoPC nue=new NodoPC();
        nue.setProductoCliente(productoCliente);
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
