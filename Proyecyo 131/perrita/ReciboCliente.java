import java.util.Scanner;

public class ReciboCliente extends Persona{
    private int NroRecibo;
    private String Fecha;
    private double CostoTotal;
    private ListaDobleProducto lpc=new ListaDobleProducto();
    
    
    public double getCostoTotal() {
        return CostoTotal;
    }

    public void setCostoTotal(double costoTotal) {
        CostoTotal = costoTotal;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String fecha) {
        Fecha = fecha;
    }

    public ListaDobleProducto getLpc() {
        return lpc;
    }

    public void setLpc(ListaDobleProducto lpc) {
        this.lpc = lpc;
    }


    public int getNroRecibo() {
        return NroRecibo;
    }

    public void setNroRecibo(int nroRecibo) {
        NroRecibo = nroRecibo;
    }
    public void mostrar(){
        System.out.println();
        System.out.println("RECIBO CLIENTE:\n    nroRecibo: "+getNroRecibo()+'\n'+"    fecha: "+getFecha()+'\n'+"    costo total: "+getCostoTotal());
        super.mostrar();
        lpc.mostrar();
    }
    public double CalculoDelCostoTotal(ListaDobleProducto lpc){
        double total=0;
        NodoPC r=lpc.getP();
        while(r!=null)
        {
            total+=r.getProducto().getPrecio()*r.getProducto().getCandidad();
            r=r.getSig();
        }
        return total;
    }
    public void leer(){
        Scanner lee=new Scanner(System.in);
        super.leer();
        System.out.println("[ RECIBO CLIENTE ]");
        System.out.print("    nro de recibo: ");int nro= lee.nextInt();setNroRecibo(nro);
        System.out.print("    fecha: ");String fecha= lee.next();setFecha(fecha);     
        System.out.print("    Cantidad de productos: "); 
        int n= lee.nextInt();
        for(int i=0;i<n;i++)
        {
            Producto p=new Producto();
            p.leer();
            lpc.adicionar(p);
        }
        CostoTotal=CalculoDelCostoTotal(getLpc());
    }

}
