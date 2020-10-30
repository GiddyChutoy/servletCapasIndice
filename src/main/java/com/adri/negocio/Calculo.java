/**
 * 
 */
package com.adri.negocio;

import java.io.IOException;

import com.adri.datos.Personas;

/**
 * @author Giddy
 *
 */
public class Calculo {
	Personas p1 = new Personas();
	
	
	public double calcularIndice(String nombre) throws IOException {
		p1.cogerDatos(nombre);
		double resultado = (p1.getPeso()/((p1.getAltura())/100));
		return resultado;
	}
}
