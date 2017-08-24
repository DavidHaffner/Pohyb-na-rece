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
public class MotoroveVozidlo {
    protected int vykon_motoru;
    protected int pocet_mist_k_sezeni;
    protected int max_rychlost;
    
    public MotoroveVozidlo (int vykon_motoru, int pocet_mist_k_sezeni, int max_rychlost) {
        this.vykon_motoru = vykon_motoru;
        this.pocet_mist_k_sezeni = pocet_mist_k_sezeni;
        this.max_rychlost = max_rychlost;
    }
    
}
