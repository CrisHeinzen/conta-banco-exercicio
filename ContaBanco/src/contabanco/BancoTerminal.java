
package contabanco;

import java.util.Locale;
import java.util.Scanner;


public class BancoTerminal {

 
    public static void main(String[] args) {
        
        double saldo = 25;
        double valorSolicitado = 18;       
        
        if (saldo<valorSolicitado)
            System.out.println("Saldo insuficiente");
     
        else 
             saldo = saldo - valorSolicitado;      
            System.out.println("O saldo atualizado é: " + saldo);
            System.out.println("FIM DA EXECUCAO DO PRIMEIRO TESTE \n");
        
            
        double saldo1 = 15;
        double valorSolicitado1 = 22;       
        
        if (saldo1<valorSolicitado1)
            System.out.println("Saldo insuficiente");
     
        else 
             saldo1 = saldo1 - valorSolicitado1;      
            System.out.println("O saldo atualizado é: " + saldo1);    
            System.out.println("FIM DA EXECUCAO DO SEGUNDO TESTE \n");
                    }
                }

