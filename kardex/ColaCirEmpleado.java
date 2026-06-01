public class ColaCirEmpleado {
    private int max=100;
    private Empleado v[]=new Empleado[max+1];
    private int ini, fin;

    public ColaCirEmpleado() {
        max = 50;
        ini = fin = 0;
        v = new Empleado[max];
    }

    public int nroelem() {
        return ((max + fin - ini) % max);
    }

    public boolean esvacia() {
        if (nroelem() == 0)
            return (true);
        return (false);
    }

    public boolean esllena() {
        if (nroelem() == max - 1)
            return (true);
        return (false);
    }

    public void adicionar(Empleado elem) {
        if (!esllena()) {
            fin = (fin + 1) % max;
            v[fin] = elem;
        } else
            System.out.println("Cola circular llena");
    }

    public Empleado eliminar() {
        Empleado elem = new Empleado();
        if (!esvacia ())
        {
            ini = (ini + 1) % max;
            elem = v [ini];
            if (nroelem () == 0)
                ini = fin = 0;
        }
        else
            System.out.println ("Cola circular vacia");
        return (elem);

    }
    public void mostrar ()
    {
        Empleado elem=new Empleado();
        if (esvacia ())
            System.out.println ("Cola vacia");
        else
        {
            System.out.println("----------------------------");
            System.out.println ("[ COLA CIRCULAR EMPLEADOS ]");
            System.out.println("----------------------------");
            ColaCirEmpleado aux = new ColaCirEmpleado ();
            while (!esvacia ())
            {
                elem = eliminar ();
                aux.adicionar (elem);
                elem.mostrar();
            }
            vaciar(aux);
        }
    }

    public void vaciar (ColaCirEmpleado a)
    {
        while (!a.esvacia ())
            adicionar (a.eliminar ());
    }
}
