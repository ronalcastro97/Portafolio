package test;

public class Auto {
	public String modelo;
    public int precio;
    public Asiento asientos[];
    public String marca;
    public Motor motor;
    public int registro;
    public int cantidadCreados;

    public int cantidadAsientos() {
    	int cont=0;
        for(Asiento asiento: this.asientos) {
        	if(asiento!=null) {
        		cont++;
        		
        	}
        }
        
    	return cont;
    }

    public String verificarIntegridad() {
    	 if (this.registro == this.motor.registro) {
             for (Asiento asiento : asientos) {
                 if (asiento != null) {
                     if (this.registro != asiento.registro) {
                         return ("Las piezas no son originales");
                     }
                 }

             }
             return ("Auto original");
         } else {
             return ("Las piezas no son originales");
         }

    }
}
