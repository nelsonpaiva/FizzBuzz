package FizzBuzz.project;

public class ComputadorTest {

	@org.junit.Test
	public void testNegativo() {
		Computador computador = new Computador();
		
		assertEquals("-1", computador.verificarComputador(-1));
	}
	
	@org.junit.Test
	public void testZero() {
		Computador computador = new Computador();
		
		assertEquals("0", computador.verificarComputador(0));
	}
	
	@org.junit.Test
	public void testNumeroComum() {
		Computador computador = new Computador();
		
		assertEquals("1", computador.verificarComputador(1));
	}
	
	@org.junit.Test
	public void testNumeroFizz() {
		Computador computador = new Computador();
		
		assertEquals("fizz", computador.verificarComputador(3));
	}
	
	private void assertEquals(String string, String verificarComputador) {
		// TODO Auto-generated method stub
		
	}

	@org.junit.Test
	public void testNumeroBuzz() {
		Computador computador = new Computador();
		
		assertEquals("buzz", computador.verificarComputador(5));
	}
	
	@org.junit.Test
	public void testNumeroFizzBuzz() {
		Computador computador = new Computador();
		
		assertEquals("fizz buzz", computador.verificarComputador(15));
	}
}
