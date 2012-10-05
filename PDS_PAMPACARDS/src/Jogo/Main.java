package Jogo;

import java.util.Scanner;
import Jogo.Baralho;

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
 *  Este programa e distribuido na esperanca que possa ser  util, mas SEM NENHUMA GARANTIA; sem uma garantia implicita de ADEQUACAO a qualquer
 *  MERCADO ou APLICACAO EM PARTICULAR. Veja a Licenca Publica Geral Menor GNU para maiores detalhes.
 *  
 *  Voce deve ter recebido uma copia da Licenca Publica Geral Menor GNU junto com este programa, se nao, escreva para a Fundacao do Software
 *  Livre(FSF) Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA
 * 
 */


/**
 * Classe que representa a manipulacao das cartas pelo jogador
 * Funcoes possiveis: mostrar baralho, embaralhar, cortar em duas partes, retirar uma carta do inicio ou do final,
 * passar uma carta do inicio para o final, adicionar carta ao monte de descarte.
 * @author Anderson Fortes
 * @author Francis Diego Almeida
 * @author Jader Saldanha
 * @author Luiza Bagesteiro 
 * @author Ricardo Pasqualotti
 * @author Vinicius Bittencourt
 */
public class Main {
   
	static Baralho baralho = new Baralho();
    static int option = 2;
    
    /**
     * Metodo de escolha das funcoes pelo jogador
     */
    public static void ManipulaCartas(){  
    	
    	Scanner is = new Scanner(System.in);
    	
    	System.out.println("Jogo de cartas para dois jogadores.");
        System.out.println("O objetivo do jogo e ficar com o menor numero de cartas no final.");
     
        baralho.imprimeBaralho(); //mostra baralho inicial
        
        baralho.embaralhaBaralho(); //embaralha
        
        baralho.imprimeBaralho(); //imprime baralho embaralhado
        
        baralho.cortaEmDois(26); //corta na metade 
        
        baralho.imprimeMonte(); //imprime o monte de cartas de cada jogador
        
        System.out.println("Jogadores, voces devem retirar uma carta do inicio ou do fim do seu monte para coloca-la no descarte, antes do jogo comecar."+"\n");
        
        System.out.println(baralho.a.getNome()+", de qual local voce quer retirar a carta?  1 - INICIO		2 - FIM");
        option = is.nextInt();
        if (option==1){
        	baralho.retiraCartaInicio(1);
        }  
        else if (option==2){
        	baralho.retiraCartaFim(1);
        }  
        else {
        	System.err.println("\nERRO. Voce digitou um numero invalido.\n");
        	System.exit(1);
        }  

        System.out.println(baralho.b.getNome()+", de qual local voce quer retirar a carta?  1 - INICIO		2 - FIM");
        option = is.nextInt();
        if (option==1){
        	baralho.retiraCartaInicio(2);
        }  
        else if (option==2){
        	baralho.retiraCartaFim(2);
        }  
        else {
        	System.err.println("\nERRO. Voce digitou um numero invalido.\n");
        	System.exit(1);
        } 
        
        System.out.println("\n"+baralho.a.getNome()+", deseja passar sua primeira carta para o final do seu monte?  1 - SIM		2 - NAO");
        option = is.nextInt();
        if (option==1){
        	baralho.moveCartaParaOFim(1);
        }                
        else if (option==2){       	
        }       
        else {
        	System.err.println("\nERRO. Voce digitou um numero invalido.\n");
        	System.exit(1);
        }
        
        System.out.println(baralho.b.getNome()+", deseja passar sua primeira carta para o final do seu monte?  1 - SIM		2 - NAO");
        option = is.nextInt();
        if (option==1){
        	baralho.moveCartaParaOFim(2);
        }        
        else if (option==2){        	
        }        
        else {
        	System.err.println("\nERRO. Voce digitou um numero invalido.\n");
        	System.exit(1);
        }
        
        baralho.comparaCartas(); //compara as cartas
        
        baralho.verificaMontesJogadores(); //verifica as cartas que cada jogador tem em seu poder
        
        baralho.imprimeResultado(); //mostra o resultado do jogo
   
    }
    
    
    /**
     * chama o metodo que manipula as cartas
     */
    public static void main(String[] args) {
    	ManipulaCartas();        
    }
    
}
