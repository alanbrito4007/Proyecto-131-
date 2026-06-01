public class PilaVentasDia {
    private int max=100, tope;
    private Venta v[]= new Venta[max+1];

    PilaVentasDia(){
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
    Venta eliminar(){
        Venta d=new Venta();
        if(!esvacia()){
            d=v[tope];
            tope--;
        }
        else {
            System.out.println("Pila de compras vacia...");
        }
        return d;
    }
    void adicionar(Venta x){
        if(!esllena()){
            tope++;
            v[tope]=x;
        }
        else{
            System.out.println("Pila llena");
        }
    }
    void mostrar(){
        System.out.println("---------------------------------");
        System.out.println("[     PILA DE VENTAS DE DIA     ]");
        System.out.println("---------------------------------");
        PilaVentasDia aux=new PilaVentasDia();
        while(!esvacia()){
            Venta x=eliminar();
            System.out.println(x);
            aux.adicionar(x);
        }
        vaciar(aux);
    }

    void vaciar(PilaVentasDia z){
        while (!z.esvacia()){
            adicionar(z.eliminar());
        }
    }
}
