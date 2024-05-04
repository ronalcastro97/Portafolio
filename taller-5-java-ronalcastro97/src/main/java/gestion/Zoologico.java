package gestion;
import java.util.ArrayList;
public class Zoologico {
	private String nombre;
	private String ubicacion;
	private ArrayList<Zona>Zona;
	public Zoologico() {
		if(Zona==null)
			Zona=new ArrayList<>();
	}
	
	public Zoologico(String nombre,String ubicacion) {
		this.nombre=nombre;
		this.ubicacion=ubicacion;
		if(Zona==null)
			this.Zona=new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public ArrayList<Zona> getZona() {
		return Zona;
	}

	public void setZona(ArrayList<Zona> zonas) {
		Zona = zonas;
	}
	public void agregarZonas(Zona zona) {
		this.Zona.add(zona);
	}
    public int cantidadTotalAnimales(){
        int total = 0;
        for (int i = 0;i<Zona.size();i++)
            total = total + Zona.get(i).cantidadAnimales();
        
        return total;
    }
}
