public class Mueble extends Mueble implements Precio{
	
    int [] medidas;	
    String montaje;

    public Mueble (String modelo, int n_piezas,int [] medidas){
    	super.(modelo,medidas,n_piezas);
    	this.medidas=medidas;
    }
    
    public setMontaje (montaje){
    	this montaje=montaje;
    }
    
    public string getMontaje (){
    	return montaje;
    }
    
	public double precioconiva(precio) {
		p_iva = precio+precio*iva/100;
		return Math.round(p_iva);
	}
	public double descuento(rebaja){
		descuento=p_iva*rebaja;
		return Math.round(descuento);
	}
	public double preciofinal(p_iva,descuento){
		int p_final=0;
		p_final=p_iva-descuento;
		return p_final;
	}
    
}