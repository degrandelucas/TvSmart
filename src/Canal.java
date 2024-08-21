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
    
    public Canal(int novoCanal){
        this.canal = novoCanal;
    }

    public void apresentarCanalAtual(){
        System.out.println("Canal atual: " + getCanal());
    }

    public int getCanal(){
        return canal;
    }

    public int trocarCanal(){
        System.out.println("Digite qual o novo canal? ");
        this.canal = leitura.nextInt();
        return canal;
    }
  
}
