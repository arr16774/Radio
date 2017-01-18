
public class Radio implements intrad  {
	
		private boolean estado;
		private boolean frecuencia;
		private float emisoraFM;
		private float emisoraAM;
		private float estacionesGuardadasFM[];
		private float estacionesGuardadasAM[];

	public Radio() {
		estado = true;
		frecuencia = true;
		emisoraFM = 87.9f;
		emisoraAM = 530;
		estacionesGuardadasFM = new float [12];
		estacionesGuardadasAM = new float [12];
	}
	
	@Override
	public void  Estado(){
		if (estado == true){
			estado = false;
		}
		else estado = true;
		
	}
	
	@Override
	public void Frecuencia() {
		if (frecuencia == true){
			frecuencia = false;
		}
		else frecuencia = true;
		
	}
	@Override
	public void Guardar(int posicion) {
		//Se ha definido que "frecuencia" se refiere a AM cuando el booleno es falso y FM cuando el booleano es verdadero
		if (this.frecuencia){
			estacionesGuardadasFM[posicion] = emisoraFM;
		}else{
			estacionesGuardadasAM[posicion] = emisoraAM;
		}
		
	}
	
	@Override
	public float Seleccionar(int posicion) {
		if (this.frecuencia){
			return estacionesGuardadasFM[posicion];
		}else{
			return estacionesGuardadasAM[posicion];
		}
	}
	
	@Override
	public void Cambiar(boolean cambio) {
		// Se acepta que "verdadero" significa cambiar hacia arriba y "falso" hacia abajo
		//subir
		if (cambio){
			if (this.frecuencia){
				if(emisoraFM<107.9){
					this.emisoraFM=this.emisoraFM+0.2f;
				}else{
					this.emisoraFM=87.9f;
				}
				
			}else{
				if(emisoraAM<1610){
					this.emisoraAM=this.emisoraAM+10;
				}else{
					this.emisoraAM=530;
				}
			}
		//bajar
		}else{
			if (this.frecuencia){
				if(emisoraFM<87.9f){
					this.emisoraFM=this.emisoraFM-0.2f;
				}else{
					this.emisoraFM=107.9f;
				}
				
			}else{
				if(emisoraAM>530){
					this.emisoraAM=this.emisoraAM-10;
				}else{
					this.emisoraAM=1610;
				}
			}
		}
	}
	


}

