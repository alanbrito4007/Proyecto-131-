import java.util.Scanner;
public class Proveedor extends Persona
{
    private String lugar;
    private ListaDobleProducto ldp=new ListaDobleProducto();
    private String Universidad;
    private String fecha;
    private int ProveedorID;
    Proveedor(){}
    public void setLugar(String lugar) {
        this.lugar = lugar;
    }
    public String getLugar() {
        return lugar;
    }
    public void setUniversidad(String universidad) {
        Universidad = universidad;
    }
    public String getUniversidad() {
        return Universidad;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    public String getFecha() {
        return fecha;
    }
    public void setProveedorID(int proveedorID) {
        ProveedorID = proveedorID;
    }
    public int getProveedorID() {
        return ProveedorID;
    }
    
    public void mostrar()
    {
        System.out.println("--- [PROVEEDOR] ---");
        super.mostrar();
        System.out.println("--- [DATOS DEL PRODUCTO] ---");
        System.out.println("    lugar: " + getLugar());
        System.out.println("    fecha: " + getFecha());
        System.out.println("    universidad: " + getUniversidad());
        System.out.println("    proveedorID: " + getProveedorID());

    }
    public void leer()
    {
        System.out.println("--- [REGISTRO PROVEEDOR] --- ");
        Scanner lee=new Scanner(System.in);
        super.leer();
        System.out.print("    lugar: ");String lugar=lee.nextLine();setLugar(lugar);
        System.out.print("    fecha: ");String fecha=lee.nextLine();setFecha(fecha);
        System.out.print("    universidad: ");String universidad=lee.nextLine();setUniversidad(universidad);
        System.out.print("    proveedorID: ");int proveedorID=lee.nextInt();setProveedorID(proveedorID);
    }
}
