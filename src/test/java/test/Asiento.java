package test;

public class Asiento
{
	public int registro;
	public String color;
	public int precio;
	
	public enum Colores 
	{
		ROJO, 
		VERDE, 
		AMARILLO, 
		NEGRO, 
		BLANCO
	}
	
	public void cambiarColor(String ncolor)
	{
		for(Colores s : Colores.values())
		{
			if(ncolor == s.name())
				this.color = ncolor;
		}
	}
}
