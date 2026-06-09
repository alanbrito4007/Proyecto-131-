import java.util.Scanner;

public class ReciboCliente {
    private int NroRecibo;
    private String Nombre, Fecha;
    private int CostoTotal;
    private ListaDobleProdCliente lpc;
    public ReciboCliente(int nroRecibo, String nombre, String fecha, int costoTotal, ListaDobleProdCliente listaCli){
        NroRecibo=nroRecibo;
        Nombre=nombre;
        CostoTotal=costoTotal;
        lpc=listaCli;
    }
    public ReciboCliente(){
    }
    public int getCostoTotal() {
        return CostoTotal;
    }

    public void setCostoTotal(int costoTotal) {
        CostoTotal = costoTotal;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String fecha) {
        Fecha = fecha;
    }

    public ListaDobleProdCliente getLpc() {
        return lpc;
    }

    public void setLpc(ListaDobleProdCliente lpc) {
        this.lpc = lpc;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getNroRecibo() {
        return NroRecibo;
    }

    public void setNroRecibo(int nroRecibo) {
        NroRecibo = nroRecibo;
    }
    public void mostrar(){
        System.out.println();
        System.out.println("RECIBO CLIENTE: nroRecibo: "+getNroRecibo()+", nombre: "+getNombre()+", fecha: "+getFecha()+", costo total: "+getCostoTotal());
        getLpc().mostrar();
    }
    public void leer(){
        Scanner lee=new Scanner(System.in);
        System.out.println("[ Recibo Cliente ]");
        System.out.print("nro de recibo: ");int nro= lee.nextInt();setNroRecibo(nro);
        System.out.print("nombre: ");String nom= lee.next();setNombre(nom);
        System.out.print("fecha: ");String fecha= lee.next();setFecha(fecha);
        ListaDobleProdCliente prodCliente=new ListaDobleProdCliente();prodCliente.leer();setLpc(prodCliente);
        System.out.print("costo total: ");float total=getLpc().getP().getProductoCliente().getCantidad()*getLpc().getP().getProductoCliente().getCosto();System.out.println(total);
    }

}
