// Rodrigo Alvarado
// Carlos Arroyave
// Samantha Duarte

public interface intrad {
	
	
	public void Estado();
	public void Frecuencia();
	
	
	/**
	 * @param posicion
	 */
	public void Guardar(int posicion);
	
	/**
	 * @param posicion
	 * @return
	 */
	public float Seleccionar(int posicion);
	
	/**
	 * @param cambio
	 */
	public void Cambiar (boolean cambio);
	
	public boolean getFrecuencia();
	public boolean getEstado();
	public float getEmisora();
}
	
