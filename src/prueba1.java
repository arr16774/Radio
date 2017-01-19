import static org.junit.Assert.*;

import org.junit.Test;

public class prueba1 {

	@Test
	public void test() {
		Radio radio = new Radio();
		//radio.Estado();
		//radio.Frecuencia();
		radio.Cambiar(true);
		radio.Cambiar(true);
		radio.Guardar(3);
		float x = radio.Seleccionar(3);
		assertEquals(88.3f,x,0.01);
	}

}
