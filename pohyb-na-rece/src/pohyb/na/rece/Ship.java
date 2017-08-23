/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pohyb.na.rece;

/**
 * Třída reprezentuje loď jako obecně
 * @author DHA
 */
public class Ship {
    /* Každá Ship má jméno, údaj o rychlosti a odolnosti */ 
    protected String jmeno;
    protected int rychlost;
    protected int odolnost;
    
    public Ship (String jmeno, int rychlost, int odolnost) {
        this.jmeno = jmeno;
        this.rychlost = rychlost;
        this.odolnost = odolnost;
    }
    
    /* Gettery a settery všech atributů */
    public void setJmeno (String jmeno) {
        this.jmeno = jmeno;
    }
    public void setRychlost (int rychlost) {
        this.rychlost = rychlost;
    }
    public void setOdolnost (int odolnost) {
        this.odolnost = odolnost;
    }
    public String getJmeno () {
        return jmeno;
    }
    public int getRychlost () {
        return rychlost;
    }
    public int getOdolnost () {
        return odolnost;
    }
    /* Upravená met. toString */
    @Override 
    public String toString () {
        return "loď " + jmeno;
    }
}
