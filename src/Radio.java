
public class Radio implements Interfaz  {
	
		private boolean estado;
		private boolean frecuencia;
		private float emisoraFM;
		private float emisoraAM;
		private float estacionesGuardadasFM[];
		private float estacionesGuardadasAM[];

	public Radio() {
		estado = true;
		frecuencia = true;
		emisoraFM = 88.2f;
		emisoraAM = 510;
		estacionesGuardadasFM = new float [12];
		estacionesGuardadasAM = new float [12];
	}
	public void  Estado(){
		if (estado == true){
			estado = false;
		}
		else estado = true;
		
	}
	
	public void Seleccionar()

}
