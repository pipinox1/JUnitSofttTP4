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
		String contraseña = null;
		boolean resultadoObtenido = Servicios.logear(usuario, contraseña);
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

	
	@Test
	public void testPuntuarPorMultiplicacion() {
		int numero1 = 5;
		int numero2 = 4;
		int respuesta=20;
		int puntosAOtorgar = 2;
		int puntosObetindo =Servicios.puntuarPorMultiplicacion(numero1,numero2, respuesta);
		assertEquals(puntosObetindo, puntosAOtorgar);
		
	}
	@Test
	public void testPuntuarPorResta() {
		int numero1 = 10;
		int numero2 = 3;
		int respuesta=6;
		int puntosAOtorgar = 0;
		int puntosObetindo =Servicios.puntuarPorResta(numero1,numero2, respuesta);
		assertEquals(puntosObetindo, puntosAOtorgar);
		
	}
	@Test
	public void testPuntuarPorDivisionEntera() {
		int numero1 = 20;
		int numero2 = 4;
		int respuesta=5;
		int puntosAOtorgar = 3;
		int puntosObetindo =Servicios.puntuarPorDivisionEntera(numero1,numero2, respuesta);
		assertEquals(puntosObetindo, puntosAOtorgar);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Test
	public void testPuntuarPorEcuacion() {
		int numero1 = 10;
		int numero2 = 3;
		int numero3 = 20;
		int numero4 = 5;
		int numero5 = 2;
		int respuesta=10;
		int puntosAOtorgar = 5;
		int puntosObetindo =Servicios.puntuarPorEcuacion(numero1,numero2,numero3, numero4,numero5, respuesta);
		assertEquals(puntosObetindo, puntosAOtorgar);
}
	
	
	@Test
	public void testAccederCalculadora() {
		boolean resultadoEsperado = true;
		Usuario usuario = new Usuario();
		usuario.setTipoUsuario("tutor");
		boolean resultadoObtenido = Servicios.accederCalculadora(usuario);
		assertEquals(resultadoEsperado,resultadoObtenido);
	}

	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}




