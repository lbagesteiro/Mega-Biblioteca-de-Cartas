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
//elementos que comp�e os m�todos.


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
	Assert.assertNotNull(baralho); //Testa se o baralho n�o � nulo

	}
	@Test
	 public void testembaralhaBaralho(){
		ArrayList<Cartas> baralho = new ArrayList<Cartas>(52);
		Collections.shuffle(baralho);
        System.out.println("Embaralhado.");
        Assert.assertNotNull(baralho); //Testa se o baralho n�o � nulo ap�s ordenar
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
	

