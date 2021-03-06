
/*
 * Autor do código:
 *      Ronaldo Mendonça Zica
 *      E-mail: rzica42@gmail.com
 *      Github: ronaldozica
 */

package arvoregenealogica;
import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Pessoa[] pessoa = new Pessoa [10];                                              // Cria o vetor de pessoas, que receberá 10 pessoas que
        Pessoa[] mae = new Pessoa [10];                                                 // possuírão nome, pai e mãe, para isso será usado o vetor
        Pessoa[] pai = new Pessoa [10];                                                 // de pai e vetor de mãe declarado nas linhas 18 e 19
        
        String nome = " ";
        String nomeMae = " ";
        String nomePai = " ";
        
        for(int i = 1; i < 11; i ++)                                                    // Começou em i = 1 para que pudesse exibir no println a mensagem
        {                                                                               // "iª pessoa" sem necessitar somar   
                System.out.println("Digite o nome da " + i + "ª pessoa:");
                nome = scanner.next();
                
                System.out.println("Digite o nome da mãe da " + i  + "ª pessoa:");
                nomeMae = scanner.next();
                
                System.out.println("Digite o nome do pai da " + i + "ª pessoa:");
                nomePai = scanner.next();
                
                mae[i - 1] = new Pessoa(nomeMae);                                       // Foi utilizado posição i-1 pra corrigir o deslocamento de +1 
                pai[i - 1] = new Pessoa(nomePai);                                       // inicial no i
                
                pessoa[i - 1] = new Pessoa(nome, mae[i - 1], pai[i - 1]);
        }
    
        if(pessoa[0].ehSemanticamenteIgual(pessoa[1]))
        {
            System.out.println(pessoa[0].getNome() + " e " + pessoa[1].getNome() + " são a mesma pessoa");
        }
        
        else
        {
            System.out.println(pessoa[0].getNome() + " e " + pessoa[1].getNome() + " não são a mesma pessoa");
        }
        
        if(pessoa[0].ehAntecessor(pessoa[1]))
        {
            System.out.println(pessoa[0].getNome() + " é antecessor de " + pessoa[1].getNome());
        }
        
        else
        {
            System.out.println(pessoa[0].getNome() + " não é antecessor de " + pessoa[1].getNome());
        }
        
        if(pessoa[0].ehIrma(pessoa[1]))
        {
            System.out.println(pessoa[0].getNome() + " é irmã(o) de " + pessoa[1].getNome());
        }
        
        else
        {
            System.out.println(pessoa[0].getNome() + " não é irmã(o) de " + pessoa[1].getNome());
        }
    }
    
}
