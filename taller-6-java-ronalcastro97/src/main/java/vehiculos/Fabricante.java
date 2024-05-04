package vehiculos;
import java.util.ArrayList;
public class Fabricante {
    private String nombre;
    private Pais pais;
    public int cantidadFabricado;
    private static ArrayList<Fabricante> fabricantes = new ArrayList<>();

    public Fabricante(String nombre, Pais pais) {
        this.nombre = nombre;
        this.pais = pais;
        fabricantes.add(this);

    }

    public Fabricante() {
    }

    public String getNombre() {
        return nombre;
    }

    public Pais getPais() {
        return pais;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }   

    public static Fabricante fabricaMayorVentas() {
        int mayor = 0;
        Fabricante fabricante = null;
        for (Fabricante f : fabricantes) {
            if (f.cantidadFabricado > mayor) {
                mayor = f.cantidadFabricado;
                fabricante = f;
            }
        }
        return fabricante;
    }
}
