
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
		for (int i=0;i<12;i++){
			estacionesGuardadasFM[i]=87.9f;
		}
		estacionesGuardadasAM = new float [12];
		for (int j=0;j<12;j++){
			estacionesGuardadasAM[j]=530;
		}
	}
	
	@Override
	public void  Estado(){
		this.estado=!this.estado;
		
	}
	
	@Override
	public void Frecuencia() {
		this.frecuencia=!this.frecuencia;
		
	}
	@Override
	public void Guardar(int posicion) {
		//Se ha definido que "frecuencia" se refiere a AM cuando el booleno es falso y FM cuando el booleano es verdadero
		
		if(estado){
		if (this.frecuencia){
			estacionesGuardadasFM[posicion] = emisoraFM;
		}else{
			estacionesGuardadasAM[posicion] = emisoraAM;
		}
	}
		
}
	
	@Override
	public float Seleccionar(int posicion) {
		
		if(estado){
		if (this.frecuencia){
			this.emisoraFM = estacionesGuardadasFM[posicion];
			return estacionesGuardadasFM[posicion];

		}else{
			this.emisoraAM = estacionesGuardadasAM[posicion];
			return estacionesGuardadasAM[posicion];
		}
		}
		else{
			return 0.0f;
		}
	}
	
	@Override
	public boolean getFrecuencia(){
		return frecuencia;
	}

	@Override
	public boolean getEstado(){
		return estado;
	}
	
	@Override
	public float getEmisora(){
		if(frecuencia){
			return emisoraFM;
		}else{
			return emisoraAM;
		}
		
	}
	@Override
	public void Cambiar(boolean cambio) {
		// Se acepta que "verdadero" significa cambiar hacia arriba y "falso" hacia abajo
		//subir
		if(estado){
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
				if(emisoraFM>87.9f){
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

}

