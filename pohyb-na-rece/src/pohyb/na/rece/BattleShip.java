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
public class BattleShip extends WarShip  {
    private int pancir;
    
    public BattleShip(String jmeno, int odolnost, int silaDel, int pancir) {
        super(jmeno, odolnost, silaDel);
        this.pancir = pancir;
    }

    /**
     * @return the pancir
     */
    public int getPancir() {
        return pancir;
    }

    /**
     * @param pancir the pancir to set
     */
    public void setPancir(int pancir) {
        this.pancir = pancir;
    }
    
}
