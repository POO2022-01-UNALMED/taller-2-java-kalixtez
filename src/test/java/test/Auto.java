package taller;

public class Auto 
{
	public String modelo;
	public int precio;
	
	public Asiento asiento[];
	public String marca;
	public Motor motor;
	
	public int registro;
	public static int cantidadCreados;
	
	public int cantidadAsientos()
	{
		return this.asiento.length;
	}
	
	public String verificarIntegridad()
	{
		if(this.registro != this.motor.registro)
			return "Las piezas no son originales";
		
		for(int i = 0; i <= this.asiento.length; i++)
		{
			if(this.registro != this.asiento[i].registro)
				return "Las piezas no son originales";
		}
		
		return "Auto original";
	}
}
