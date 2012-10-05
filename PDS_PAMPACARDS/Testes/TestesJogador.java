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
 * Este arquivo e parte do programa Jogo
 * 
 * Jogo e um software livre; voce pode redistribui-lo e/ou modifica-lo dentro dos termos da Licenca Publica Geral Menor GNU 
 * como publicada pela Fundacao do Software Livre (FSF); na versao 2 da Licenca, ou (na sua opiniao) qualquer versao.
 * 
 *  Este programa e distribuido na esperanca que possa ser util, mas SEM NENHUMA GARANTIA; sem uma garantia implicita de ADEQUACAO a qualquer
 *  MERCADO ou APLICACAO EM PARTICULAR. Veja a Licenca Publica Geral Menor GNU para maiores detalhes.
 *  
 *  Voce deve ter recebido uma copia da Licenca Publica Geral Menor GNU junto com este programa, se nao, escreva para a Fundacao do Software
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
	 * Metodo que obtem o nome do jogador.
	 * @return	nome do jogador
	 */
	public String getNome() {
		return nome;
	}


	/**
	 * Metodo que determina o nome do jogador.
	 * @param nome
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}


	/**
	 * Metodo que determina o monte de cartas de cada jogador.
	 * @param monte
	 */
	public void setMonte(ArrayList<Cartas> monte) {
		this.monte = monte;
	}


	/**
	 * Metodo que imprime o monte de cartas de cada jogador.
	 * Esse monte e composto pelas cartas que o jogador obteve atraves das comparacoes entre suas cartas e as de seu oponente.
	 */
	@Test
	public void testimprimeMonteDescarte() {
		System.out.println("\nMonte acumulado de "+this.getNome());
		for (Cartas c: monteDescarte){
			System.out.println(c.imprimecarta());
				
		}
		Assert.assertNotNull(monteDescarte);//Verifica se nesse ponto, o monte descarte não esta vazio
		System.out.println("\n");
		
	}		
}
