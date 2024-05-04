package zooAnimales;
import gestion.*;
import java.util.ArrayList;

public class Reptil extends Animal{
	private static ArrayList<Reptil>listado=new ArrayList<>();
	public static int iguanas=0;
	public static int serpientes=0;
	private String colorEscamas;
	private int largoCola;
	public Reptil() {
		super();
		 Reptil.listado.add(this);
	}
	public Reptil(String nombre, int edad, String habitat, String genero,String colorEscamas,int largoCola) {
		super(nombre, edad, habitat, genero);
		this.colorEscamas=colorEscamas;
		this.largoCola=largoCola;
		Reptil.listado.add(this);
	}
	public static ArrayList<Reptil> getListado() {
		return listado;
	}
	public static void setListado(ArrayList<Reptil> listado) {
		Reptil.listado = listado;
	}
	public static int getIguanas() {
		return iguanas;
	}
	public static void setIguanas(int iguanas) {
		Reptil.iguanas = iguanas;
	}
	public static int getSerpientes() {
		return serpientes;
	}
	public static void setSerpientes(int serpientes) {
		Reptil.serpientes = serpientes;
	}
	public String getColorEscamas() {
		return colorEscamas;
	}
	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}
	public int getLargoCola() {
		return largoCola;
	}
	public void setLargoCola(int largoCola) {
		this.largoCola = largoCola;
	}
	public String movimiento(){
		return "reptar";	
	}	
	public static Reptil crearIguana(String nombre,int edad,String genero){
		Reptil iguana= new Reptil(nombre,edad,"humedad",genero,"verde",3);
		Reptil.iguanas++;
		return iguana;
	}
	public static Reptil crearSerpiente(String nombre,int edad,String genero){
		Reptil serpiente= new Reptil(nombre,edad,"jungla",genero,"blanco",1);
		Reptil.serpientes++;
		return serpiente;
	}
	public static int cantidadReptiles() {
		return Reptil.listado.size();
		}
}
