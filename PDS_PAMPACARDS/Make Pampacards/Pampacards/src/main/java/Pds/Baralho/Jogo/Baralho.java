package Jogo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import Jogo.Cartas;

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
 * Classe que implementa funcionalidades como:
 * embaralhar, cortar em duas partes, retirar uma carta do inicio ou do final,
 * passar uma carta do inicio para o final, al�m da cria��o do monte de descarte.
 * Tamb�m s�o implementadas as fun��es b�sicas do jogo, relacionadas ao baralho de cada jogador.
 * @author Anderson Fortes
 * @author Francis Diego Almeida
 * @author Jader Saldanha
 * @author Luiza Bagesteiro 
 * @author Ricardo Pasqualotti
 * @author Vinicius Bittencourt
 */
public class Baralho {
	
		public ArrayList<Cartas> baralho = new ArrayList<Cartas>(52);
		public ArrayList<Cartas> descartadas = new ArrayList<Cartas>();
		ArrayList<Cartas> temporario = new ArrayList<Cartas>();	
		ArrayList<Cartas> temporario2 = new ArrayList<Cartas>();	
		
		Scanner is = new Scanner(System.in);
		Jogador a = new Jogador();
		Jogador b = new Jogador();

		
		/**
		 * M�todo construtor da classe Baralho,onde o baralho � instanciado e preenchido
		 */
		public Baralho(){
			
			baralho = new ArrayList<Cartas>(52);

			for(int i=0; i<52; i++){				
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
		}	
		
		
		/**
		 * M�todo que imprime todas as 52 cartas do baralho.
		 */
		public void imprimeBaralho() {
			System.out.println("\n" + "O baralho:");
			for (int count=0; count<baralho.size(); count++){
				System.out.println(baralho.get(count).imprimecarta());
	        }
	    }
		
		
		/**
	     * M�todo que embaralha o baralho.
	     */
	    public void embaralhaBaralho(){
	        Collections.shuffle(baralho);
	        System.out.println("\n"+"Embaralhado.");
	   }
	    
	    
	    /**
	     * M�todo que corta o baralho na posi��o definida pelo usu�rio, e divide os montes entre os dois jogadores.
	     * Neste jogo, o baralho � cortado na posi��o 26, que corresponde a metade do baralho.
	     * @param posicao	local do corte do baralho
	     */
		public void cortaEmDois(int posicao) {
			
			for(int i=posicao; i<baralho.size(); i++)
				temporario.add(baralho.get(i));
	            
	        for(int i=0; i<posicao; i++)
	        	temporario2.add(baralho.get(i));
	            
	        criaJogadores(temporario,temporario2);	        
	    }	
		
		
		/**
		 * M�todo que cria os jogadores, que possuem um nome e um monte de cartas para jogar.
		 * @param one	array list com 26 cartas
		 * @param two	array list com 26 cartas
		 */
		void criaJogadores(ArrayList one, ArrayList two){
				
			System.out.println("Digite o nome do jogador 1: ");
			String nome1= is.nextLine();
			a.setNome(nome1);
			a.setMonte(one);
			
			System.out.println("Digite o nome do jogador 2: ");
			String nome2= is.nextLine();
			b.setNome(nome2);
			b.setMonte(two);				
		}	
		
		
		/**
		 * M�todo que imprime o monte de cada jogador no in�cio do jogo, composto por 26 cartas.
		 */
		public void imprimeMonte(){
			
			System.out.println("\nCartas de "+a.getNome()+":");
			for (Cartas c: a.monte){
				System.out.println(c.imprimecarta());
			}
			
			System.out.println("\nCartas de "+b.getNome()+":");
			for (Cartas c: b.monte){
				System.out.println(c.imprimecarta());
			}
			System.out.println("\n");
		}
			

		  /**
		   * M�todo para visualizar todas as cartas que est�o no monte de descarte.
		   */
		  public void verCartasDescartadas() {
			  
			  System.out.println("\nCartas do descarte: ");
			  for(int i=0; i<descartadas.size(); i++)
				  System.out.println(descartadas.get(i).imprimecarta());
		  }
		  
		  
		  /**
		   * M�todo que remove as cartas do descarte, quando existentes.
		   * O jogador que perde a rodada leva as cartas do monte de descarte.
		   * @param i	inteiro correspondente a posi��o do array que est� sendo lida
		   */
		  public void removeDoDescarte(int i){
			  
			  if (a.monte.get(i).getNumCarta()<b.monte.get(i).getNumCarta()){				  
				  if (descartadas.size()!=0){
					  System.out.println(a.getNome()+" tamb�m leva as cartas do monte de descarte, que s�o as seguintes: ");
					  for (i=0; i<descartadas.size(); i++){
						  a.monteDescarte.add(descartadas.get(i));
						  System.out.println(descartadas.get(i).imprimecarta());
						  descartadas.remove(i);
						  i = i-1;
					  }			  
				  }		  
			  }
			  
			  else if (a.monte.get(i).getNumCarta()>b.monte.get(i).getNumCarta()){
				  if (descartadas.size()!=0){
					  System.out.println(b.getNome()+" tamb�m leva as cartas do monte de descarte, que s�o as seguintes: ");
					  for (i=0; i<descartadas.size(); i++){
						  b.monteDescarte.add(descartadas.get(i));
						  System.out.println(descartadas.get(i).imprimecarta());
						  descartadas.remove(i);
						  i = i-1;
					  }			  
				  }	
			  }
			  
			  else {
				  System.out.println("ERRO");
			  }
			  
		  }
		  
		  
		  /**
		   * M�todo que compara as cartas dos dois jogadores.
		   * A compara��o � feita verificando os valores dos n�meros da carta de cada jogador.
		   */
		  public void comparaCartas(){
			  
			  for(int i=0; i<a.monte.size(); i++){
				  
				  System.out.println("\n"+a.getNome()+" jogou: "+a.monte.get(i).imprimecarta());
				  System.out.println(b.getNome()+" jogou: "+b.monte.get(i).imprimecarta());
				  
				  if (a.monte.get(i).getNumCarta()<b.monte.get(i).getNumCarta()){
					  System.out.println(a.getNome()+" perdeu, portanto leva "+a.monte.get(i).imprimecarta()+" e "+b.monte.get(i).imprimecarta()+" para o seu monte.");
					  a.monteDescarte.add(a.monte.get(i));
					  a.monteDescarte.add(b.monte.get(i));					  
					  removeDoDescarte(i);					  
				  }
				  
				  else if (a.monte.get(i).getNumCarta()>b.monte.get(i).getNumCarta()){
					  System.out.println(b.getNome()+" perdeu, portanto leva "+a.monte.get(i).imprimecarta()+" e "+b.monte.get(i).imprimecarta()+" para o seu monte.");
					  b.monteDescarte.add(a.monte.get(i));
					  b.monteDescarte.add(b.monte.get(i));					  
					  removeDoDescarte(i);					  
				  }
				  
				  else{
					  System.out.println("Empataram. Portanto, essas cartas v�o para o monte de descarte.");
					  descartadas.add(a.monte.get(i));
					  descartadas.add(b.monte.get(i));
					  verCartasDescartadas();
				  }
			  }
		  }
		  
		  
		  /**
		   * M�todo que verifica o n�mero total de cartas de cada jogador, ap�s realizar todas as compara��es.
		   */
		  public void verificaMontesJogadores(){
			  
			  a.imprimeMonteDescarte();
			  System.out.println("Total de cartas acumuladas por "+ a.getNome()+" : "+a.monteDescarte.size());
			  
			  b.imprimeMonteDescarte();
			  System.out.println("Total de cartas acumuladas por "+ b.getNome()+" : " +b.monteDescarte.size());
			  
		  }
		  
		  
		  /**
		   * M�todo que imprime o resultado do jogo.
		   * Para isso, � verificado o tamanho do monte de cada jogador.
		   * O jogador que tiver o menor n�mero de cartas em seu poder � o vencedor.
		   */
		  public void imprimeResultado(){
			  
			  if (a.monteDescarte.size()>b.monteDescarte.size()){
				  System.out.println("Quem venceu o jogo foi "+ b.getNome());
			  }
			  
			  else if (b.monteDescarte.size()>a.monteDescarte.size()){
				  System.out.println("Quem venceu o jogo foi "+ a.getNome());
			  }
			  
			  else {
				  System.out.println("Ningu�m venceu! Os jogadores empataram.");
			  }
		  }

		  
		  /**
		   * M�todo que move a primera carta do baralho para o fim do baralho.
		   * @param	inteiro correspondente ao jogador que quer mover a carta, ou seja, jogador 1 ou jogador 2
		   */
		  public void moveCartaParaOFim(int i){
			  
			  if (i==1){
				  a.monte.add(a.monte.remove(0));
				  System.out.println("A carta foi movida para o fim."+"\n");
			  }
			  
			  else {
				  b.monte.add(b.monte.remove(0));
				  System.out.println("A carta foi movida para o fim."+"\n");
			  }
		  }		  


		  /**
		   * M�todo que retira a primeira carta do baralho.
		   * @param	inteiro correspondente ao jogador que quer retirar a carta, ou seja, jogador 1 ou jogador 2
		   */
		  public void retiraCartaInicio(int i){
			  
			  if (i==1){
				  descartadas.add(a.monte.get(0));
				  System.out.println("Descartada a carta " + a.monte.get(0).imprimecarta());
				  a.monte.remove(0);
			  }		
			  
			  else {
				  descartadas.add(b.monte.get(0));
				  System.out.println("Descartada a carta " + b.monte.get(0).imprimecarta());
				  b.monte.remove(0);
			  }		
		  }
			
		  
		  /**
		   * M�todo que retira a �ltima carta do baralho
		   * @param	inteiro correspondente ao jogador que quer retirar a carta, ou seja, jogador 1 ou jogador 2
		   */
		  public void retiraCartaFim(int i){
			  
			  if (i==1){
				  descartadas.add(a.monte.get(25));
				  System.out.println("Descartada a carta " + a.monte.get(25).imprimecarta());
				  a.monte.remove(25);
			  }		
			  
			  else {
				  descartadas.add(b.monte.get(25));
				  System.out.println("Descartada a carta " + b.monte.get(25).imprimecarta());
				  b.monte.remove(25);
			  }		
		  }	  		  
		  
}