package test;

public class Asiento
{
	public int registro;
	public String color;
	public int precio;
	
	public enum Colores 
	{
		Rojo, 
		Verde, 
		Amarillo, 
		Negro, 
		Blanco
	}
	
	public void cambiarColor(String color)
	{
		for(Colores s : Colores.values())
		{
			if(color.toUpperCase().equals(s.name().toUpperCase()))
				this.color = color;
		}
	}
}
