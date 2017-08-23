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
public class TradeShip extends Ship {
    protected int nosnost;

    public TradeShip (String jmeno, int rychlost, int odolnost, int nosnost) {
        super (jmeno, rychlost, odolnost);
        this.nosnost = nosnost;
    }
    
}
