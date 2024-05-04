package zooAnimales;
import gestion.*; 
import java.util.ArrayList;

public class Ave extends Animal{
	private static ArrayList<Ave>listado=new ArrayList<>();
	public static int halcones=0;
	public static int aguilas=0;
	private  String colorPlumas;
	public Ave() {
		super();
		  Ave.listado.add(this);
	}
	public Ave(String nombre, int edad, String habitat, String genero,String colorPlumas) {
		super(nombre, edad, habitat, genero);
		this.colorPlumas=colorPlumas;
		Ave.listado.add(this);
	}
	public static ArrayList<Ave> getListado() {
		return listado;
	}
	public static void setListado(ArrayList<Ave> listado) {
		Ave.listado = listado;
	}
	public static int getHalcones() {
		return halcones;
	}
	public static void setHalcones(int halcones) {
		Ave.halcones = halcones;
	}
	public static int getAguilas() {
		return aguilas;
	}
	public static void setAguilas(int aguilas) {
		Ave.aguilas = aguilas;
	}
	public String getColorPlumas() {
		return colorPlumas;
	}
	public void setColorPlumas(String colorPlumas) {
		this.colorPlumas = colorPlumas;
	}
	@Override
	public String movimiento() {
		return "volar";
	}
	public static Ave crearHalcon(String nombre,int edad,String genero) {
		Ave halcon= new Ave(nombre,edad,"montanas",genero,"cafe glorioso"); 
		Ave.halcones++;
		return halcon 	;	 
	}
	
	public static Ave crearAguila(String nombre,int edad,String genero) {
		Ave aguila=new Ave(nombre,edad,"montanas",genero,"blanco y amarillo");
		Ave.aguilas++;
		return aguila;
	}
	public static int cantidadAves() {
		return Ave.listado.size();
	}
}
