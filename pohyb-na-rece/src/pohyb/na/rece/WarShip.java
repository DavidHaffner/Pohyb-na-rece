/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pohyb.na.rece;

/**
 *
 * @author DHA
 */
public class WarShip extends Ship {
    private int silaDel;

    public WarShip (String jmeno, int odolnost, int silaDel) {
        super (jmeno, odolnost);
        this.silaDel = silaDel;
    }

    /**
     * @return the silaDel
     */
    public int getSilaDel() {
        return silaDel;
    }

    /**
     * @param silaDel the silaDel to set
     */
    public void setSilaDel(int silaDel) {
        this.silaDel = silaDel;
    }
    
    
}
