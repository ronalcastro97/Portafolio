package gestion;

import java.util.ArrayList;
import zooAnimales.*;
import java.util.List;


public class Zona {
	private String nombre;
	private Zoologico Zoo;
	private List<Animal>animales;
	public Zona() {
		this.animales=new  ArrayList<>();
	}
	public Zona(String nombre, Zoologico Zoo) {
		this.nombre=nombre;
		this.Zoo=Zoo;
		this.animales=new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Zoologico getZoo() {
		return Zoo;
	}

	public void setZoo(Zoologico zoo) {
		this.Zoo = zoo;
	}

	public List<Animal> getAnimales() {
		return this.animales;
	}
	
	public void setAnimales(List<Animal> animales) {
		this.animales = animales;
	}
	public void agregarAnimales(Animal animal) {
		this.animales.add(animal);
	}
	public int cantidadAnimales() {
		return this.animales.size();
	}
}
