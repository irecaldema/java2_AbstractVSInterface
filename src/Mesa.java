public class Mueble extends Mueble implements Precio{
	

    public Mueble (String modelo,int [] medidas, int n_piezas){
    	super.(modelo,medidas,n_piezas);
    }
    
	public double precioconiva() {
		precioIva = precio+precio*iva/100;
		return Math.round(precioIva*Math.pow(10, 2))/Math.pow(10, 2);
	}
    
}