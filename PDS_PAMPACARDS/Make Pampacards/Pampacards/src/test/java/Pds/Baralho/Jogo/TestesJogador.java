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
 * Este arquivo é parte do programa Jogo
 * 
 * Jogo é um software livre; você pode redistribui-lo e/ou modifica-lo dentro dos termos da Licença Pública Geral Menor GNU 
 * como publicada pela Fundação do Software Livre (FSF); na versão 2 da Licença, ou (na sua opinião) qualquer versão.
 * 
 *  Este programa é distribuido na esperança que possa ser  util, mas SEM NENHUMA GARANTIA; sem uma garantia implicita de ADEQUAÇÂO a qualquer
 *  MERCADO ou APLICAÇÃO EM PARTICULAR. Veja a Licença Pública Geral Menor GNU para maiores detalhes.
 *  
 *  Você deve ter recebido uma cópia da Licença Pública Geral Menor GNU junto com este programa, se não, escreva para a Fundação do Software
 *  Livre(FSF) Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA
 * 
 */


//Como não havia métodos com retorno para a utilização de parâmetros de
//comparação para a realização de testes foram testados apenas alguns
//elementos que compõem os métodos.

public class TestesJogador extends TestCase {

	String nome = "cartas";	
	ArrayList<Cartas> monte = new ArrayList<Cartas>(); //monte inicial de cada um
	ArrayList<Cartas> monteDescarte = new ArrayList<Cartas>(); //monte de "descarte", formado pelas cartas que eles pegam do jogo

	/**
	 * Método que obtém o nome do jogador.
	 * @return	nome do jogador
	 */
	public String getNome() {
		return nome;
	}


	/**
	 * Método que determina o nome do jogador.
	 * @param nome
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}


	/**
	 * Método que determina o monte de cartas de cada jogador.
	 * @param monte
	 */
	public void setMonte(ArrayList<Cartas> monte) {
		this.monte = monte;
	}


	/**
	 * Método que imprime o monte de cartas de cada jogador.
	 * Esse monte é composto pelas cartas que o jogador obteve através das comparações entre suas cartas e as de seu oponente.
	 */
	@Test
	public void testimprimeMonteDescarte() {
		System.out.println("\nMonte acumulado de "+this.getNome());
		for (Cartas c: monteDescarte){
			System.out.println(c.imprimecarta());
				
		}
		Assert.assertNotNull(monteDescarte);//Verifica se nesse ponto, o monte descarte não está vazio
		System.out.println("\n");
		
	}		
}