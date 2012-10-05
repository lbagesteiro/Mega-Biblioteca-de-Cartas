package Jogo;

import java.util.*;

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


/**
 * Classe que representa o jogador, que possui um nome e um monte de 26 cartas
 * @author Anderson Fortes
 * @author Francis Diego Almeida
 * @author Jader Saldanha
 * @author Luiza Bagesteiro 
 * @author Ricardo Pasqualotti
 * @author Vinicius Bittencourt
 */

public class Jogador {
	
	String nome;	
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
	public void imprimeMonteDescarte() {
		System.out.println("\nMonte acumulado de "+this.getNome());
		for (Cartas c: monteDescarte){
			System.out.println(c.imprimecarta());
		}
		System.out.println("\n");
	}		
	
}