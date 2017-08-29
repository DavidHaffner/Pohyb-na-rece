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
public class Destroyer extends WarShip{
    private int uhyb;  //číslo mezi 2 až 10 - čím více, tím větší šance na úhyb
    
    public Destroyer(String jmeno, int odolnost, int silaDel, int uhyb) {
        super(jmeno, odolnost, silaDel);
        this.uhyb = uhyb;
    }

    /**
     * @return the uhyb
     */
    public int getUhyb() {
        return uhyb;
    }

    /**
     * @param uhyb the uhyb to set
     */
    public void setUhyb(int uhyb) {
        this.uhyb = uhyb;
    }
    
}
