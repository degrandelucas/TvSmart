/**
 * A classe Volume representa o controle de volume de uma TV.
 * 
 * <p>Esta classe permite aumentar ou diminuir o volume e exibir o volume atual.</p>
 * 
 * @author Lucas Degrande
 * @version 1.0
 * @since 20/08/2024
 */

public class Volume {
    int volume;

    /**
     * Construtor da classe Volume que define o volume inicial.
     * 
     * @param volumeInicial O valor inicial do volume.
     */
    public Volume (int volumeInicial){
        this.volume = volumeInicial;
    }

    /**
     * Diminui o volume em uma unidade.
     */
    public void diminuiVolume(){
        volume--;
    } 
    
    /**
     * Aumenta o volume em uma unidade.
     */
    public void aumentaVolume(){
        volume++;
    } 

    /**
     * Retorna o valor atual do volume.
     * 
     * @return O valor do volume.
     */
    public int getvolume(){
        return volume;
    }
}
