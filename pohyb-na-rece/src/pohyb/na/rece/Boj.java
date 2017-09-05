/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pohyb.na.rece;
import java.util.ArrayList;
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
    
    //cyklus, dokud nezůstane v river právě 1 loď = vítěz
    public void strelba (River river) {
        while (true) {
            indexUtocnik = random.nextInt(river.getRiverSize());
            indexObrance = random.nextInt(river.getRiverSize());
            Ship obrance = river.getArLiShip(indexObrance);
            river.fight(indexUtocnik, indexObrance);
            if (obrance.getOdolnost() ==0) {
                river.removeShip(indexObrance);
            }
            if (river.getRiverSize()<=1) {
                // vypíše vítěze 
                System.out.println("A boj vyhrává " + ((Ship)river.getArLiShip(0)).toString());
                return;                  
            }
        }    
    }
}

