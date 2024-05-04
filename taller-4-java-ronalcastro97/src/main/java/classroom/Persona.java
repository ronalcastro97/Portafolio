package classroom;

public class Persona {

    public int cedula;
    String nombre;
    public int totalPersonas;
    
    public Persona() {
    	this.cedula=0;
    }
    public Persona(int cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
        totalPersonas++;
    }
    
    public Persona(String nombre, int cedula) {
        this.cedula = cedula;
        this.nombre = nombre;
        totalPersonas++;
    }

    public Persona(int cedula) {
        this.cedula = cedula;
        this.nombre = "";
    
    }

    public Persona(String nombre) {
        this.nombre = nombre;
        this.cedula=1;
    
    }
    
    public long getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
