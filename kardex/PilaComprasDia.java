public class PilaComprasDia {
    private int max=100, tope;
    private Compra v[]= new Compra[max+1];

    PilaComprasDia(){
        tope=0;
    }
    boolean esvacia() {
        if (tope == 0) {
            return true;
        } else {
            return false;
        }
    }

    boolean esllena() {
        return tope == max;
    }

    int nroelem() {
        return tope;
    }
    Compra eliminar(){
        Compra d=new Compra();
        if(!esvacia()){
            d=v[tope];
            tope--;
        }
        else {
            System.out.println("Pila de compras vacia...");
        }
        return d;
    }
    void adicionar(Compra x){
        if(!esllena()){
            tope++;
            v[tope]=x;
        }
        else{
            System.out.println("Pila llena");
        }
    }
    void mostrar(){
        System.out.println("------------------------------");
        System.out.println("[     PILA DE COMPRAS DIA    ]");
        System.out.println("------------------------------");
        PilaComprasDia aux=new PilaComprasDia();
        while(!esvacia()){
            Compra x=eliminar();
            x.mostrar();
            aux.adicionar(x);
        }
        vaciar(aux);
    }

    void vaciar(PilaComprasDia z){
        while (!z.esvacia()){
            adicionar(z.eliminar());
        }
    }
}
