public class PilaCompra {
    private int max=100, tope;
    private Compra v[]= new Compra[max+1];

    PilaCompra(){
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
        System.out.println("---------------------------");
        System.out.println("[     PILA DE COMPRAS     ]");
        System.out.println("---------------------------");
        PilaCompra aux=new PilaCompra();
        while(!esvacia()){
            Compra x=eliminar();
            System.out.println(x);
            aux.adicionar(x);
        }
        vaciar(aux);
    }

    void vaciar(PilaCompra z){
        while (!z.esvacia()){
            adicionar(z.eliminar());
        }
    }
}
