/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package katalogvozidel;

/**
 *
 * @author Student
 */
public class Ambulance extends MotoroveVozidlo {
    protected int pocet_lehatek;
    
    public Ambulance (int vykon_motoru, int pocet_mist_k_sezeni,
            int max_rychlost, int pocet_lehatek) {
        super (vykon_motoru, pocet_mist_k_sezeni, max_rychlost);
        this.pocet_lehatek = pocet_lehatek;
    }
    
}
