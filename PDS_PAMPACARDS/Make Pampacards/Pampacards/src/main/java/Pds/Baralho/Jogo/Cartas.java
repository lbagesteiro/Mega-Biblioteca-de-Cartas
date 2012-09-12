package Jogo;

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

/**
 * Classe que representa uma carta do jogo: numero + naipe
 * @author Anderson Fortes
 * @author Francis Diego Almeida
 * @author Jader Saldanha
 * @author Luiza Bagesteiro 
 * @author Ricardo Pasqualotti
 * @author Vinicius Bittencourt
 */

public class Cartas {

    private int numCarta;
    private String naipeCarta;

    /**
     * Define os atributos da carta simultaneamente: número e naipe.
     * @param numero	inteiro referente ao numero da carta
     * @param naipe		string referente ao naipe da carta
     */    
    public Cartas(int numero, String naipe) {
    	this.numCarta = numero;
    	this.naipeCarta = naipe;
    }
    
    /**
     * Método que obtém o número de uma carta.
     * @return	inteiro referente ao número da carta
     */
    public int getNumCarta() {
        return numCarta;
    }

    /**
     * Método que obtém o naipe de uma carta.
     * @return	string referente ao naipe da carta
     */
    public String getNaipeCarta() {
        return naipeCarta;
    }

    /**
     * Método que determina o número de uma carta.
     * @param numeroCarta	inteiro referente ao número da carta
     */
    public void setNumCarta(int numeroCarta) {
        this.numCarta = numeroCarta;
    }

    /**
     * Método que determina o naipe de uma carta.
     * @param naipes	string referente ao naipe da carta
     */
    
    public void setNaipeCarta(String naipes) {
        this.naipeCarta = naipes;
    }
    
    /**
     * Método que retorna uma string referente ao número e naipe da carta.
     * @return	string referente ao nome da carta, composto por número + naipe
     */
    public String imprimecarta() {
        return this.getNumCarta() + " de " + this.getNaipeCarta();
    }
  
}