public class PilaDePilasDePilasCAño {
    private int max=100, tope;
    private PilaDePilasCMes v[]= new PilaDePilasCMes[max+1];

    PilaDePilasDePilasCAño(){
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
    PilaDePilasCMes eliminar(){
        PilaDePilasCMes d=new PilaDePilasCMes();
        if(!esvacia()){
            d=v[tope];
            tope--;
        }
        else {
            System.out.println("Pila de compras año vacia...");
        }
        return d;
    }
    void adicionar(PilaDePilasCMes x){
        if(!esllena()){
            tope++;
            v[tope]=x;
        }
        else{
            System.out.println("Pila llena");
        }
    }
    void mostrar(){
        System.out.println("-------------------------------");
        System.out.println("[     PILA DE COMPRAS AÑO     ]");
        System.out.println("-------------------------------");
        PilaDePilasDePilasCAño aux=new PilaDePilasDePilasCAño();
        while(!esvacia()){
            PilaDePilasCMes x=eliminar();
            x.mostrar();
            aux.adicionar(x);
        }
        vaciar(aux);
    }

    void vaciar(PilaDePilasDePilasCAño z){
        while (!z.esvacia()){
            adicionar(z.eliminar());
        }
    }
}
