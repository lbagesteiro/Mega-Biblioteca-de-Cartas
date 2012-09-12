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
 * Classe que representa a manipulação das cartas pelo jogador
 * Funções possíveis: mostrar baralho, embaralhar, cortar em duas partes, retirar uma carta do inicio ou do final,
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
     * Método de escolha das funções pelo jogador
     */
    public static void ManipulaCartas(){  
    	
    	Scanner is = new Scanner(System.in);
    	
    	System.out.println("Jogo de cartas para dois jogadores.");
        System.out.println("O objetivo do jogo é ficar com o menor número de cartas no final.");
     
        baralho.imprimeBaralho(); //mostra baralho inicial
        
        baralho.embaralhaBaralho(); //embaralha
        
        baralho.imprimeBaralho(); //imprime baralho embaralhado
        
        baralho.cortaEmDois(26); //corta na metade 
        
        baralho.imprimeMonte(); //imprime o monte de cartas de cada jogador
        
        System.out.println("Jogadores, vocês devem retirar uma carta do início ou do fim do seu monte para colocá-la no descarte, antes do jogo começar."+"\n");
        
        System.out.println(baralho.a.getNome()+", de qual local você quer retirar a carta?  1 - INICIO		2 - FIM");
        option = is.nextInt();
        if (option==1){
        	baralho.retiraCartaInicio(1);
        }  
        else if (option==2){
        	baralho.retiraCartaFim(1);
        }  
        else {
        	System.err.println("\nERRO. Você digitou um número inválido.\n");
        	System.exit(1);
        }  

        System.out.println(baralho.b.getNome()+", de qual local você quer retirar a carta?  1 - INICIO		2 - FIM");
        option = is.nextInt();
        if (option==1){
        	baralho.retiraCartaInicio(2);
        }  
        else if (option==2){
        	baralho.retiraCartaFim(2);
        }  
        else {
        	System.err.println("\nERRO. Você digitou um número inválido.\n");
        	System.exit(1);
        } 
        
        System.out.println("\n"+baralho.a.getNome()+", deseja passar sua primeira carta para o final do seu monte?  1 - SIM		2 - NÃO");
        option = is.nextInt();
        if (option==1){
        	baralho.moveCartaParaOFim(1);
        }                
        else if (option==2){       	
        }       
        else {
        	System.err.println("\nERRO. Você digitou um número inválido.\n");
        	System.exit(1);
        }
        
        System.out.println(baralho.b.getNome()+", deseja passar sua primeira carta para o final do seu monte?  1 - SIM		2 - NÃO");
        option = is.nextInt();
        if (option==1){
        	baralho.moveCartaParaOFim(2);
        }        
        else if (option==2){        	
        }        
        else {
        	System.err.println("\nERRO. Você digitou um número inválido.\n");
        	System.exit(1);
        }
        
        baralho.comparaCartas(); //compara as cartas
        
        baralho.verificaMontesJogadores(); //verifica as cartas que cada jogador tem em seu poder
        
        baralho.imprimeResultado(); //mostra o resultado do jogo
   
    }
    
    
    /**
     * chama o método que manipula as cartas
     */
    public static void main(String[] args) {
    	ManipulaCartas();        
    }
    
}