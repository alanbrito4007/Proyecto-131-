

public class MulticolaProducto {
    private int nc;
    private ColaProducto v[]=new ColaProducto[30];
    
    MulticolaProducto()
    {
        for (int i = 1; i < 30; i++) 
        {
            v[i]=new ColaProducto();
            
        }
    }
    boolean esvacia(int  i)
    {
        return v[i].esvacia();
    }
    boolean esllena(int i)
    {
        return v[i].esllena();
    }
    int nroelem(int i)
    {
        return v[i].nroelem();
    }
    void adicionar(int i,Producto elem)
    {
        v[i].adicionar(elem);
    }
    Producto eliminar(int i)
    {
        return v[i].eliminar();
    }
    void mostrar(int i)
    {
        v[i].mostrar();
    }
    void mostrar()
    {
        for (int i = 1; i <= nc; i++) 
        {
            System.out.println("---- COLA: "+i+" ----");
            mostrar(i);
        }
    }
    void vaciar(int i,ColaProducto z)
    {
        v[i].vaciar(z);
    }
    void vaciar(int i,int j)
    {
        v[i].vaciar(v[j]);
    }
    public void setNc(int nc) {
        this.nc = nc;
    }
    public int getNc() {
        return nc;
    }
    
}