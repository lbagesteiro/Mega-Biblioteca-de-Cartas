package Jogo;

import java.util.ArrayList;
import org.junit.Test;
import junit.framework.Assert;
import junit.framework.TestCase;

/**
 * Copyright (c) 2012
 * Anderson Fortes
 * Francis Diego Almeida
 * Jader Saldanha
 * Luiza Bagesteiro 
 * Ricardo Pasqualotti
 * Vinicius Bittencourt
 * 
 * Este arquivo � parte do programa Jogo
 * 
 * Jogo � um software livre; voc� pode redistribui-lo e/ou modifica-lo dentro dos termos da Licen�a P�blica Geral Menor GNU 
 * como publicada pela Funda��o do Software Livre (FSF); na vers�o 2 da Licen�a, ou (na sua opini�o) qualquer vers�o.
 * 
 *  Este programa � distribuido na esperan�a que possa ser  util, mas SEM NENHUMA GARANTIA; sem uma garantia implicita de ADEQUA��O a qualquer
 *  MERCADO ou APLICA��O EM PARTICULAR. Veja a Licen�a P�blica Geral Menor GNU para maiores detalhes.
 *  
 *  Voc� deve ter recebido uma c�pia da Licen�a P�blica Geral Menor GNU junto com este programa, se n�o, escreva para a Funda��o do Software
 *  Livre(FSF) Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA
 * 
 */


//Como n�o havia m�todos com retorno para a utiliza��o de par�metros de
//compara��o para a realiza��o de testes foram testados apenas alguns
//elementos que comp�em os m�todos.

public class TestesJogador extends TestCase {

	String nome = "cartas";	
	ArrayList<Cartas> monte = new ArrayList<Cartas>(); //monte inicial de cada um
	ArrayList<Cartas> monteDescarte = new ArrayList<Cartas>(); //monte de "descarte", formado pelas cartas que eles pegam do jogo

	/**
	 * M�todo que obt�m o nome do jogador.
	 * @return	nome do jogador
	 */
	public String getNome() {
		return nome;
	}


	/**
	 * M�todo que determina o nome do jogador.
	 * @param nome
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}


	/**
	 * M�todo que determina o monte de cartas de cada jogador.
	 * @param monte
	 */
	public void setMonte(ArrayList<Cartas> monte) {
		this.monte = monte;
	}


	/**
	 * M�todo que imprime o monte de cartas de cada jogador.
	 * Esse monte � composto pelas cartas que o jogador obteve atrav�s das compara��es entre suas cartas e as de seu oponente.
	 */
	@Test
	public void testimprimeMonteDescarte() {
		System.out.println("\nMonte acumulado de "+this.getNome());
		for (Cartas c: monteDescarte){
			System.out.println(c.imprimecarta());
				
		}
		Assert.assertNotNull(monteDescarte);//Verifica se nesse ponto, o monte descarte n�o est� vazio
		System.out.println("\n");
		
	}		
}