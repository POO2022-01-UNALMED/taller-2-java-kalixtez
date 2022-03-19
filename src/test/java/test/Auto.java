package test;

public class Auto 
{
	public String modelo;
	public int precio;
	
	public Asiento asientos[];
	public String marca;
	public Motor motor;
	
	public int registro;
	public static int cantidadCreados;
	
	public int cantidadAsientos()
	{
		return this.asientos.length;
	}
	
	public String verificarIntegridad()
	{
		if(this.registro != this.motor.registro)
			return "Las piezas no son originales";
		
		for(int i = 0; i <= this.asientos.length; i++)
		{
			if (this.asientos[i] != null)
			{
			   if(this.registro != this.asientos[i].registro)
				 return "Las piezas no son originales";
                        }
		}
		
		return "Auto original";
	}
}
