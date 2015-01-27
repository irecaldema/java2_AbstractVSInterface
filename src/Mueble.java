public abstract class Mueble{
    String modelo;
    int n_piezas;
    int stock;
    
    public mueble(String modelo, int n_piezas, int stock){
        this.modelo=modelo;
        this.n_piezas=n_piezas;
        this.stock=stock;
    }
    
    public existencias(stock){
        if (stock>0){
            return true;
        }
    }
    
    public montaje();
    
}