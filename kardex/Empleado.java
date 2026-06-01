public class Empleado extends Persona{
    private String Cargo;
    private int IdEmpleado;
    private float Sueldo;
    private int Edad;
    public Empleado(String Nombres, String pat, String mat, int ci, String cargo, int idEmpleado,
                    float sueldo, int edad){
        super(Nombres,pat,mat,ci);
        Cargo=cargo;
        IdEmpleado=idEmpleado;
        Sueldo=sueldo;
        Edad=edad;
    }
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
}
