package test;

public class Motor {
	public int numeroCilindros;
    public String tipo;
    public int registro;

    public void cambiarRegistro(int registro) {
        this.registro = registro;
    }

    public void asignarTipo(String tipo) {
        if ("electrico".equals(tipo)) {
            this.tipo = tipo;
        } else if ("gasolina".equals(tipo)) {
            this.tipo = tipo;
        }

    }
}
