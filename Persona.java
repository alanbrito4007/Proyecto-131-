import java.util.Scanner;

public class Persona {
    private String Nombres,pat,mat;
    private int ci;
    public Persona(String nombre,String paterno,String materno,int CI){
        Nombres=nombre;
        pat=paterno;
        mat=materno;
        ci=ci;
    }
    public Persona(){
    }
    public String getMat() {
        return mat;
    }

    public void setMat(String mat) {
        this.mat = mat;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String nombres) {
        Nombres = nombres;
    }

    public String getPat() {
        return pat;
    }

    public void setPat(String pat) {
        this.pat = pat;
    }

    public int getCI() {
        return ci;
    }

    public void setCI(int CI) {
        this.ci = CI;
    }
    public void mostrar(){
        System.out.println("     PERSONA: nombres: "+getNombres()+", paterno: "+getPat()+", materno: "+getMat()+", CI: "+getCI());
    }
    public void leer(){
        Scanner lee=new Scanner(System.in);
        System.out.println("Persona: ");
        System.out.print("    Nombres: ");String nomb=lee.nextLine();setNombres(nomb);
        System.out.print("    Paterno: ");String pater=lee.nextLine();setPat(pater);
        System.out.print("    materno: ");String mater=lee.nextLine();setMat(mater);
    }
}
