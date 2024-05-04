package zooAnimales;
import gestion.*; 
import java.util.ArrayList;
import java.util.List;

public class Animal {
	public static int totalAnimales=0;
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private List<Zona> zona = new ArrayList<Zona>(1);
	
	public Animal(){
			Animal.totalAnimales++;
		}
	public Animal(String nombre, int edad, String habitat,String genero) {
		Animal.totalAnimales++;
		this.nombre=nombre;
		this.edad=edad;
		this.habitat=habitat;
		this.genero=genero;

		}
	public static int getTotalAnimales() {
		return totalAnimales;
	}
	public static void setTotalAnimales(int totalAnimales) {
		Animal.totalAnimales = totalAnimales;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getHabitat() {
		return habitat;
	}
	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public List<Zona> getZona() {
		return zona;
	} 
	public void setZona(List<Zona> zona) {
		this.zona = zona; 
	}
	public static int totalAnimales() {
		return Animal.totalAnimales;
	}
	public  static String  totalPorTipo() {
		 	int totalmamiferos = Mamifero.getListado().size();
			int totalaves = Ave.getListado().size();
			int totalreptiles = Reptil.getListado().size();
			int totalpeces = Pez.getListado().size();
			int totalanfibios = Anfibio.getListado().size();
			
			return ("Mamiferos: " + totalmamiferos + "\n" + 
			"Aves: " + totalaves + "\n" +
			"Reptiles: " + totalreptiles + "\n" +
			"Peces: " + totalpeces + "\n" +
			"Anfibios: " + totalanfibios);
    }
		 	
	@Override
	public String toString() { 
		if (this.zona.size() != 0) {
			
			return ("Mi nombre es " + this.nombre + 
					", tengo una edad de " + this.edad + 
					", habito en " + this.habitat + 
					" y mi genero es " + this.genero + 
					" la zona en la que me ubico es " + this.zona.get(0) + 
					", en el " + this.zona.get(0).getZoo());
			
		}
		
		else {
			
			return ("Mi nombre es " + this.nombre + 
					", tengo una edad de " + this.edad + 
					", habito en " + this.habitat + 
					" y mi genero es " + this.genero);
		}
        }

	public String  movimiento() {
		return "desplazarse";
	}
}

