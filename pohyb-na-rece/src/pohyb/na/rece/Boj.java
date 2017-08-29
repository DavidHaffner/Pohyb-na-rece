/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pohyb.na.rece;

import java.util.Random;

/**
 *
 * @author DHA
 */
public class Boj {
    private Random random;
    private int indexUtocnik;
    private int indexObrance;
    
    public Boj () {
        this.indexUtocnik = indexUtocnik;
        this.indexObrance = indexObrance;
    }
    
    public void strelba (River river) {
        indexUtocnik = random.nextInt(river.getRiverSize());
        indexObrance = random.nextInt(river.getRiverSize());
        //cyklus, dokud se jedna loď nezničí
        while (true) {
            
        }
    }
    
}

