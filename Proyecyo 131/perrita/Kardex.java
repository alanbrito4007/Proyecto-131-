import java.util.*;

public class Kardex {
    public static void main(String[] args) 
    {
        ColaCirEmpleado emp=new ColaCirEmpleado();
        ListaDobleCircularVenta ven=new ListaDobleCircularVenta();
        ListaSimpleCircularProveedor pro=new ListaSimpleCircularProveedor();
        Scanner lee=new Scanner(System.in);
        System.out.println("ELIGA UNA OPCION:");
        System.out.println("1. REGISTRAR EMPLEADO");
        System.out.println("2. REGISTRAR CLIENTE");
        System.out.println("3. REGISTRAR PROVEEDOR");
        do
        {
            int n=lee.nextInt();
            switch(n)
            {
                case 1:
                    Empleado empleado=new Empleado();
                    empleado.leer();
                    System.out.println("--- [REGISTRO COMPLETADO] ---");
                    emp.adicionar(empleado);
                    System.out.println("DATOS GUARDADOS:");
                    empleado.mostrar();
                    break;
                case 2:
                    ReciboCliente cli=new ReciboCliente();
                    cli.leer();
                    System.out.println("--- [RECIBO COMPLETADO] ---");
                    ven.adicionar(cli);
                    System.out.println("DATOS GUARDADOS:");
                    cli.mostrar();
                    break;
                case 3:
                    Proveedor proveedor=new Proveedor();
                    proveedor.leer();
                    System.out.println("--- [PROVEEDOR COMPLETADO] ---");
                    proveedor.mostrar();
                    pro.adicionarFinal(proveedor);
                    System.out.println("DATOS GUARDADOS:");
                    break;
                default:
                    System.out.println("OPCION INVALIDA");
            }
            System.out.println("ELIGA UNA OPCION:");
            System.out.println("1. REGISTRAR EMPLEADO");
            System.out.println("2. REGISTRAR CLIENTE");
            System.out.println("3. REGISTRAR PROVEEDOR");
        }while(lee.hasNextInt());

        
    }

}
