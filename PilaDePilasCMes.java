public class PilaDePilasCMes {
    private int max=100, tope;
    private PilaComprasDia v[]= new PilaComprasDia[max+1];

    PilaDePilasCMes(){
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
    PilaComprasDia eliminar(){
        PilaComprasDia d=new PilaComprasDia();
        if(!esvacia()){
            d=v[tope];
            tope--;
        }
        else {
            System.out.println("Pila de compras mes vacia...");
        }
        return d;
    }
    void adicionar(PilaComprasDia x){
        if(!esllena()){
            tope++;
            v[tope]=x;
        }
        else{
            System.out.println("Pila llena");
        }
    }
    void mostrar(){
        System.out.println("-----------------------------");
        System.out.println("[     PILA DE COMPRAS MES    ]");
        System.out.println("-----------------------------");
        PilaDePilasCMes aux=new PilaDePilasCMes();
        while(!esvacia()){
            PilaComprasDia x=eliminar();
            x.mostrar();
            aux.adicionar(x);
        }
        vaciar(aux);
    }

    void vaciar(PilaDePilasCMes z){
        while (!z.esvacia()){
            adicionar(z.eliminar());
        }
    }
}
