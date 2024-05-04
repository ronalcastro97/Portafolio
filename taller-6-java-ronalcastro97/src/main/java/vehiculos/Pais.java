package vehiculos;
import java.util.ArrayList;

public class Pais {
    private String nombre;
    public int cantidadVendidos;
    private static ArrayList<Pais> paises = new ArrayList<>();


    public Pais(String nombre) {
        this.nombre = nombre;
        paises.add(this);
    }

    public Pais() {
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidadVendidos() {
        return cantidadVendidos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCantidadVendidos(int cantidadVendidos) {
        this.cantidadVendidos = cantidadVendidos;
    }

    public static Pais paisMasVendedor() {
        int mayor = 0;
        Pais pais = null;
        for (Pais p : paises) {
            if (p.getCantidadVendidos() > mayor) {
                mayor = p.getCantidadVendidos();
                pais = p;
            }
        }
        return pais;
    }
}
