public class PilaDePilasVMes {
    private int max=100, tope;
    private PilaVentasDia v[]= new PilaVentasDia[max+1];

    PilaDePilasVMes(){
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
    PilaVentasDia eliminar(){
        PilaVentasDia d=new PilaVentasDia();
        if(!esvacia()){
            d=v[tope];
            tope--;
        }
        else {
            System.out.println("Pila de compras vacia...");
        }
        return d;
    }
    void adicionar(PilaVentasDia x){
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
        System.out.println("[     PILA DE VENTAS MES    ]");
        System.out.println("-----------------------------");
        PilaDePilasVMes aux=new PilaDePilasVMes();
        while(!esvacia()){
            PilaVentasDia x=eliminar();
            System.out.println(x);
            aux.adicionar(x);
        }
        vaciar(aux);
    }

    void vaciar(PilaDePilasVMes z){
        while (!z.esvacia()){
            adicionar(z.eliminar());
        }
    }
}
