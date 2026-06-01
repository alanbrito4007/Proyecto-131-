public class Venta {
    private ReciboCliente ReciboCliente;
    private String Fecha;
    public Venta(ReciboCliente reciboCliente, String fecha){
        ReciboCliente=reciboCliente;
        Fecha=fecha;
    }
    public Venta(){
    }
    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String fecha) {
        Fecha = fecha;
    }

    public ReciboCliente getReciboCliente() {
        return ReciboCliente;
    }

    public void setReciboCliente(ReciboCliente reciboCliente) {
        ReciboCliente = reciboCliente;
    }

    public void leer(){

    }
    public void mostrar(){
        System.out.println("VENTA");
        System.out.println("fecha: "+getFecha()+" nro de recibo: "+getReciboCliente().getNroRecibo());
    }
}
