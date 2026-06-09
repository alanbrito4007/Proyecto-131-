import java.util.Scanner;

public class Empleado extends Persona{
    private String Cargo;
    private int IdEmpleado;
    private float Sueldo;
    private int Edad;
    
    public Empleado(){
        super();
    }
    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String cargo) {
        Cargo = cargo;
    }

    public int getEdad() {
        return Edad;
    }

    public int getIdEmpleado() {
        return IdEmpleado;
    }
    public void setIdEmpleado(int idEmpleado) {
        IdEmpleado = idEmpleado;
    }
    public void setEdad(int edad) {
        Edad = edad;
    }
    public float getSueldo() {
        return Sueldo;
    }
    public void setSueldo(float sueldo) {
        Sueldo = sueldo;
    }
    public void mostrar()
    {
        super.mostrar();
        System.out.println("    Cargo: "+Cargo);
        System.out.println("    ID: "+IdEmpleado);
        System.out.println("    Sueldo: "+Sueldo);
        System.out.println("    Edad: "+Edad);
    }
    public void leer()
    {
        System.out.println("--- [REGISTRO EMPLEADO] --- ");
        Scanner Leer=new Scanner(System.in);
        super.leer();
        System.out.println("[DATOS EMPLEADO]: ");
        System.out.print("    cargo: ");
        Cargo=Leer.next();    
        System.out.print("    ID: ");
        IdEmpleado=Leer.nextInt();   
        System.out.print("    Sueldo: ");
        Sueldo=Leer.nextFloat();
        System.out.print("    Edad: ");
        Edad=Leer.nextInt();
    }
}
