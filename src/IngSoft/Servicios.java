package IngSoft;

public class Servicios {
	
	
	public static int puntuarPorSuma(int a,int b,int resultadoObtenido) {
		
		int resultadoVerdadero = a+b;
		if(resultadoVerdadero != resultadoObtenido) {
			System.out.println("El resultado Correcto es: "+resultadoVerdadero );
			return 0;
		
		}
		else {
			return 1;
		}
	}
	
	public static boolean logear(String usuario,String contraseña) {
		
		if(usuario==null || contraseña==null) {
			return false;
		}
		return true;
		
	}
	
	public static boolean accesoCalculadora(Usuario usuario) {
		
		if(usuario.getNivelUsuario() != 5) {
			System.out.println("Esta función se encuentra disponible a partir del nivel 5");
			return false;
		}
		else {
			
			return true;
		}
		
		
	}
	
	public static int verLimiteNivel(int nivel) {
		//Aca deberia ir a mapear a una BD
		int nivel1 = 15;
		int nivel2 = 25;
		int nivel3= 30;
		int nivel4= 50;
		int valorRequerido = 0;
		switch(nivel) {
		case 1: valorRequerido=nivel1;
			
		break;
		case 2: valorRequerido=nivel2;
		break;
		case 3: valorRequerido=nivel3;
		break;
		case 4: valorRequerido=nivel4;
		break;
			
		}
		return valorRequerido;
		
	}
	
	public static boolean modificarPuntajeLimiteNivel(int nivel, int nuevoLimite) {
		int nivel1 = 15;
		int nivel2 = 25;
		int nivel3= 30;
		int nivel4= 50;
		if(nuevoLimite<0) {
			System.out.println("No es posible asignar puntaje negativo");
			return false;
			
		}else {
			if(nivel == 2) {
				if(nuevoLimite>nivel3) {
					System.out.println("Debe ingresar un límite menor o cambiar los límites de niveles superiores");
					return false;
					
				}
				
			}
		}
		return true;
		
		
		
	}
	
	public static boolean accederProblema(Usuario usuario,int idProblema) {
		//Buscamos el problema por el id en la base de datos
		Problema problema = new Problema(3,5886);
		if(usuario.getNivelUsuario()==problema.getNivelProblema()) {
			
			return true;
		}
		return false;
		
	}
	
	public static int puntuarPorDivisionEntera(int a,int b,int resultadoObtenido) {
		
		int resultadoVerdadero = a/b;
		if(resultadoVerdadero != resultadoObtenido) {
			System.out.println("El resultado Correcto es: "+resultadoVerdadero );
			return 0;
		
		}
		else {
			System.out.println("Respuesta a la division correcta!");
			return 3;
		}
	}
	
	public static int puntuarPorResta(int a,int b,int resultadoObtenido) {
		
		int resultadoVerdadero = a-b;
		if(resultadoVerdadero != resultadoObtenido) {
			System.out.println("El resultado Correcto es: "+resultadoVerdadero );
			return 0;
		
		}
		else {
			System.out.println("Respuesta a la resta correcta!");
			return 1;
		}
	}
	public static int puntuarPorMultiplicacion(int a,int b,int resultadoObtenido) {
		
		int resultadoVerdadero = a*b;
		if(resultadoVerdadero != resultadoObtenido) {
			System.out.println("El resultado Correcto es: "+resultadoVerdadero );
			return 0;
		
		}
		else {
			System.out.println("Respuesta a la multiplicacion correcta!");
			return 2;
		}
	}
	
	public static int puntuarPorEcuacion(int a, int b, int c, int d, int e, int resultadoObtenido) {
		int resultadoVerdadero = a/e + (c-d)/b;
		if(resultadoVerdadero != resultadoObtenido) {
			System.out.println("El resultado Correcto es: "+ resultadoVerdadero );
			return 0;
		}
		else {
			System.out.println("Respuesta Correcta!");
			return 5;
		}
	}
	
	
	public static boolean accederCalculadora(Usuario usuario) {
		
		if(usuario.getNivelUsuario()>=5 || usuario.getTipoUsuario() == "profesor") {
			return true;
		}
		return false;
		
	}



}

	
