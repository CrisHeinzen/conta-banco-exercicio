
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
        
        
                    }
                }

