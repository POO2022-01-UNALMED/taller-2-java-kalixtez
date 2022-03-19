package taller;

public class Motor 
{
	public int registro;
	public int numeroCilindros;
	public String tipo;
	
	public void cambiarRegistro(int nreg)
	{
		this.registro = nreg;
	}
	
	public void asignarTipo(String tipo) 
	{
		if(tipo == "electrico" || tipo == "gasolina")
			this.tipo = tipo;
	}
}
