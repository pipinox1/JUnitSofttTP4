package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import IngSoft.Servicios;
import IngSoft.Usuario;

public class TestUser {

	@Test
	public void testpuntuarPorSuma() {
		int numero1 = 5;
		int numero2 = 3;
		int respuesta=10;
		int puntosAOtorgar = 0;
		int puntosObetindo =Servicios.puntuarPorSuma(numero1,numero2, respuesta);
		assertEquals(puntosObetindo, puntosAOtorgar);
		
		
	}
	
	@Test
	public void testLogear() {
		String usuario = null;
		String contrase�a = null;
		boolean resultadoObtenido = Servicios.logear(usuario, contrase�a);
		boolean resultadoEsperado = false;
		assertEquals(resultadoEsperado, resultadoObtenido);
		
	}
	
	@Test
	public void testAccesoCalculadora() {
		Usuario usuarioPrueba =  new Usuario();
		usuarioPrueba.setNivelUsuario(4);
		boolean resultadoEsperado = false;
		boolean resultadoObtenido = Servicios.accesoCalculadora(usuarioPrueba);
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	
	@Test
	public void testVerLimiteNivel() {
		int resultadoObtenido = Servicios.verLimiteNivel(4);
		int resultadoEsperado = 50;
		assertEquals(resultadoEsperado,resultadoObtenido);
	}
	
	@Test
	public void testModificarPuntajeLimiteNivel() {
		boolean resultadoEsperado = false;
		boolean resultadoObtenido = Servicios.modificarPuntajeLimiteNivel(5, -100);
		assertEquals(resultadoEsperado,resultadoObtenido);
	}
	
	@Test
	public void testModificarPuntajeLimiteNivel2() {
		boolean resultadoEsperado = false;
		boolean resultadoObtenido = Servicios.modificarPuntajeLimiteNivel(2, 50);
		assertEquals(resultadoEsperado,resultadoObtenido);
	}
	
	@Test
	public void testAccederProblema() {
		boolean resultadoEsperado = false;
		Usuario usuario = new Usuario();
		usuario.setNivelUsuario(2);
		boolean resultadoObtenido = Servicios.accederProblema(usuario, 5886);
		assertEquals(resultadoEsperado,resultadoObtenido);
		
	}
}
