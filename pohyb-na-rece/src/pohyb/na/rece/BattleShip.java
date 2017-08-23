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
public class BattleShip extends Ship {
    protected int silaDel;

    public BattleShip (String jmeno, int rychlost, int odolnost, int silaDel) {
        super (jmeno, rychlost, odolnost);
        this.silaDel = silaDel;
    }
    
    
}
