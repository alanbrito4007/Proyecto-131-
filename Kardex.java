public class Kardex {
    public static void main(String[] args) {
        Producto P1=new Producto("nombre1","tipo1",1,"01/06/2026");
        Producto P2=new Producto("nombre2","tipo2",2,"02/06/2026");
        Producto P3=new Producto("nombre3","tipo3",3,"03/06/2026");
        Producto P4=new Producto("nombre4","tipo4",4,"04/06/2026");
        Producto P5=new Producto("nombre5","tipo5",5,"05/06/2026");

        Compra A1=new Compra(P1,"Cotacota",new Persona("n1","p1","m1",11),1);
        Compra A2=new Compra(P2,"Cotacota",new Persona("n2","p2","m2",22),2);
        Compra A3=new Compra(P3,"Cotacota",new Persona("n3","p3","m3",33),3);
        Compra A4=new Compra(P4,"Cotacota",new Persona("n4","p4","m4",44),4);
        Compra A5=new Compra(P5,"Cotacota",new Persona("n5","p5","m5",55),5);

        PilaComprasDia PilaCD=new PilaComprasDia();
        PilaCD.adicionar(A1);
        PilaCD.adicionar(A2);

        PilaComprasDia PilaCD2=new PilaComprasDia();
        PilaCD2.adicionar(A3);
        PilaCD2.adicionar(A4);
        PilaCD2.adicionar(A5);

        PilaDePilasCMes PilaCM=new PilaDePilasCMes();
        PilaCM.adicionar(PilaCD);
        PilaCM.adicionar(PilaCD2);

        PilaDePilasDePilasCAño PilaCA=new PilaDePilasDePilasCAño();
        PilaCA.adicionar(PilaCM);
        PilaCA.mostrar();
    }
}
