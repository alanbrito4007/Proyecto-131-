import java.util.Scanner;

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
        Scanner lee=new Scanner(System.in);
        System.out.println("[ INTRODUZCA VENTA ]");
        ReciboCliente recb=new ReciboCliente();recb.leer();setReciboCliente(recb);
        System.out.print("fecha: "+recb.getFecha());setFecha(recb.getFecha());
    }
    public void mostrar(){
        System.out.println("VENTA");
        System.out.println("fecha: "+getFecha()+" nro de recibo: "+getReciboCliente().getNroRecibo());
    }

}
