public class ListaSimpleCircularProveedor {
    private NodoProveedor p;

    public ListaSimpleCircularProveedor() {
        p = null;
    }

    public NodoProveedor getP() {
        return p;
    }

    public void setP(NodoProveedor p) {
        this.p = p;
    }

    public boolean esVacia() {
        return p == null;
    }

    public void adicionarFinal(Proveedor proveedor) {
        NodoProveedor nuevo = new NodoProveedor();
        nuevo.setProveedor(proveedor);

        if (p == null) {
            p = nuevo;
            nuevo.setSig(p);
        } else {
            NodoProveedor r = p;

            while (r.getSig() != p) {
                r = r.getSig();
            }

            r.setSig(nuevo);
            nuevo.setSig(p);
        }
    }

    public void mostrar() {
        if (p == null) {
            System.out.println("Lista vacia");
            return;
        }

        System.out.println("\n[ LISTA DE PROVEEDORES ]");

        NodoProveedor r = p;

        do {
            r.getProveedor().mostrar();
            System.out.println("--------------------");
            r = r.getSig();
        } while (r != p);
    }
}