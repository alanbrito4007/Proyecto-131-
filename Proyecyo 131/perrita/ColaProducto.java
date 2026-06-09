import java.util.*;

public class ColaProducto 
{
    private int max=50;
    private Producto[] v=new Producto[max+1];
    private int ini,fin;

    ColaProducto()
    {
        ini=0;
        fin=0;
    }
    public boolean esvacia()
    {
        if(ini==0 && fin==0)
        {
            return true;
        }
        return false;
    }

    public boolean esllena()
    {
        if(fin==max)
        {
            return true;
        }
        return false;
    }
    public int nroelem()
    {
        return fin-ini;
    }
    public void adicionar(Producto elem)
    {
        if(!esllena())
        {
            v[fin+1]=elem;
            fin=fin+1;
        }
        else{
            System.out.println("Cola llena!!!");
        }
    }

    public Producto eliminar()
    {
        Producto elem = null;
        if(!esvacia())
        {
            elem=v[ini+1];
            ini=ini+1;
            if(ini==fin)
            {
                ini=0;
                fin=0;
            }
        }
        else{
            System.out.println("Cola vacia");
        }
        return elem;
    }

    public void llenar(int n)
    {
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < n; i++) 
        {
            Producto x=eliminar();
            x=new Producto();
            x.leer();
            adicionar(x);
        }
    }

    public void mostrar()
    {
        ColaProducto aux=new ColaProducto();
        while(!esvacia())
        {
            Producto p=eliminar();
            p.mostrar();
            aux.adicionar(p);
        }
        vaciar(aux);
    }
    public void vaciar(ColaProducto aux)
    {
        while(!aux.esvacia())
        {
            adicionar(aux.eliminar());
        }

    }
    
}