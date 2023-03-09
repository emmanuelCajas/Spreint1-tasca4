package tasca4.N1ejercicio1;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class MesesTest {

	private Meses mes;
	
	@Before
	public void before() {
		mes = new Meses();
	}
	
	
	@Test
	public void verificaPosiciones(){	
		
		assertEquals(12,mes.cargarArray().size());

	}
	
	@Test
	public void verificaNoEsNula() {
		assertNotNull(mes.cargarArray().isEmpty());	
	}
	
	@Test
	public void verificaPosicionMes() {
		assertEquals("Agosto", mes.cargarArray().get(7));
	}
	

}
