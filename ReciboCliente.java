public class ReciboCliente {
    private int NroRecibo;
    private String Nombre, Fecha;
    private int CostoTotal;
    private ListaProdCliente lpc;
    public ReciboCliente(int nroRecibo, String nombre, String fecha, int costoTotal, ListaProdCliente listaCli){
        NroRecibo=nroRecibo;
        Nombre=nombre;
        CostoTotal=costoTotal;
        lpc=listaCli;
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

    public ListaProdCliente getLpc() {
        return lpc;
    }

    public void setLpc(ListaProdCliente lpc) {
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
}
