import java.util.Scanner;
/**
 * A classe Canal representa a funcionalidade de controle de canais de uma TV.
 * 
 * <p>Esta classe permite exibir o canal atual e trocar para um novo canal através de entrada do usuário.</p>
 * 
 * @author Lucas Degrande
 * @version 1.0
 * @since 20/08/2024
 */

public class Canal {
    int canal;
    Scanner leitura = new Scanner(System.in);
    
    /**
     * Construtor da classe Canal que define o canal inicial
     * 
     * @param novoCanal O número do canal inicial.
     */
    public Canal(int novoCanal){
        this.canal = novoCanal;
    }

    /**
     * Exibe o canal atual da TV.
     */
    public void apresentarCanalAtual(){
        System.out.println("Canal atual: " + getCanal());
    }

    /**
     * Retorna o número do canal atual.
     * 
     * @return O número do canal atual.
     */
    public int getCanal(){
        return canal;
    }

    /**
     * Troca o canal atual para um novo canal fornecido pelo usuário.
     * 
     * @return O número do novo canal.
     */
    public int trocarCanal(){
        System.out.println("Digite qual o novo canal? ");
        this.canal = leitura.nextInt();
        return canal;
    }
  
}
