import java.util.Scanner;

/**
 * A classe TvSmart simula comandos de um controle remoto, da iteração do usuário com a TV.
 * 
 * <p>Registra funções de liga/desliga da TV, aumento e redução de volume, e troca de canal</p>
 * 
 * @author Lucas Degrande
 * @version 1.0
 * @since 20/08/2024
 */

public class TvSmart {

    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        boolean ligada = false;

        System.out.println( "Deseja ligar a TV? ");
        System.out.println( "0 - Não");
        System.out.println( "1 - Sim");
        int ligarDesligarTV = leitura.nextInt();

        if (ligarDesligarTV == 0) {
            ligada = false;
            System.out.println("TV desligada!");
        }
        else{
            ligada = true;
            System.out.println("Tv Ligada!");
            System.out.println( "Qual Opcao deseja? ");
            System.out.println( "0 - Volume");
            System.out.println( "1 - Canal");
            int opcao = leitura.nextInt();

            if (opcao == 0) {
                System.out.println( "0 - Diminuir volume");
                System.out.println( "0 - Aumentar volume");
                int aumentaDiminuiVolume = leitura.nextInt();
                if (aumentaDiminuiVolume == 0) {
                    Volume.diminuiVolume(); //Criar instância
                }
                else{
                    Volume.aumentaVolume();
                }
                
            }
            else{
                canal();


            }
        }
    }
    
}
