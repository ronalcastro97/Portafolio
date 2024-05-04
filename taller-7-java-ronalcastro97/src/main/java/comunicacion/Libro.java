package comunicacion;

public class Libro extends Escrito{
	private String co_autor;
	private String editorial;
	private String edicion;
	private String interpretacion;

	public Libro(String origen, String titulo, String autor, int paginas,String co_autor,String editorial,String edicion,String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.co_autor=co_autor;
		this.editorial=editorial;
		this.edicion=edicion;
		this.interpretacion=interpretacion;

	}

	public String getCo_autor() {
		return co_autor;
	}

	public void setCo_autor(String co_autor) {
		this.co_autor = co_autor;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public String getEdicion() {
		return edicion;
	}

	public void setEdicion(String edicion) {
		this.edicion = edicion;
	}

	public String getInterpretacion() {
		return interpretacion;
	}

	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}	
	public int palabrasTotales(int parametro) {	
		return getPaginas()*parametro*2;
	}
	public String interpretacion() {
		return this.getInterpretacion();
	}
	public String toString() {
		return this.getOrigen() + "\n"+
				this.getTitulo()+ "\n"+
				this.getAutor() +"\n" +
				this.getPaginas() + "\n"+
				this.getCo_autor() + "\n"+
				this.getEditorial() + "\n"+
				this.getEdicion();	
	}
	
	
}
