public class PilaDePilasDePilasVAño {
    private int max=100, tope;
    private PilaDePilasVMes v[]= new PilaDePilasVMes[max+1];

    PilaDePilasDePilasVAño(){
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
    PilaDePilasVMes eliminar(){
        PilaDePilasVMes d=new PilaDePilasVMes();
        if(!esvacia()){
            d=v[tope];
            tope--;
        }
        else {
            System.out.println("Pila de compras vacia...");
        }
        return d;
    }
    void adicionar(PilaDePilasVMes x){
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
        System.out.println("[     PILA DE VENTAS DE AÑO     ]");
        System.out.println("---------------------------------");
        PilaDePilasDePilasVAño aux=new PilaDePilasDePilasVAño();
        while(!esvacia()){
            PilaDePilasVMes x=eliminar();
            System.out.println(x);
            aux.adicionar(x);
        }
        vaciar(aux);
    }
    void vaciar(PilaDePilasDePilasVAño z){
        while (!z.esvacia()){
            adicionar(z.eliminar());
        }
    }
}
