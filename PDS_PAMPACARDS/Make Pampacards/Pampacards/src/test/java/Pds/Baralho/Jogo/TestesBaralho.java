package Jogo;

import java.util.ArrayList;
import java.util.Collections;
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
//elementos que compõe os métodos.


public class TestesBaralho extends TestCase {

	@Test
	public void testBaralho(){
		ArrayList<Cartas> baralho = new ArrayList<Cartas>(52);
		int i;
		for(i=0; i<52; i++){				
			if (i<13){
				baralho.add(new Cartas(i+1, "Copas"));
			}
			else if (i>=13 && i<26){
				baralho.add(new Cartas(i-12, "Espadas"));
			}
			else if (i>=26 && i<39){
				baralho.add(new Cartas(i-25, "Ouros"));
			}
			else if (i>=39 && i<52){
				baralho.add(new Cartas(i-38, "Paus"));
			}				
		}
	Assert.assertNotNull(baralho); //Testa se o baralho não é nulo

	}
	@Test
	 public void testembaralhaBaralho(){
		ArrayList<Cartas> baralho = new ArrayList<Cartas>(52);
		Collections.shuffle(baralho);
        System.out.println("Embaralhado.");
        Assert.assertNotNull(baralho); //Testa se o baralho não é nulo após ordenar
   }
    
	
	@Test
	public void testcortaEmDois(int posicao) {
		ArrayList<Cartas> baralho = new ArrayList<Cartas>(52);
		ArrayList<Cartas> temporario = new ArrayList<Cartas>();	
		ArrayList<Cartas> temporario2 = new ArrayList<Cartas>();	
		for(int i=posicao; i<baralho.size(); i++){
			temporario.add(baralho.get(i));
		}
		for(int i=0; i<posicao; i++){
			temporario2.add(baralho.get(i));
		}
		Assert.assertEquals(temporario.size(), temporario2.size());	//Verifica se os dois temporarios possuem o mesmo tamanho, se possuem foi dividido igualmente	
		//criaJogadores(temporario,temporario2);	        
	}
	
}
	

