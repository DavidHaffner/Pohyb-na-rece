/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pohyb.na.rece;

import java.util.ArrayList;
import java.util.Random;

/**
 * Třída simuluje prostředí řeky s objekty lodě i jejich potomky objekty bitevky
   a obchodnílodě
 * @author DHA
 */
public class River {
    /* prom. seznamReka je hlavní seznam všech lodí na řece; dále tento objekt
    bude pracovat s objekty typu Ship */
    protected ArrayList<Ship> river;
    protected Ship ship;
    private Random random;
    
    public River () {
        this.river = new ArrayList<Ship>(); //vyvolá se hl. seznam
    }
    
    public void addShip (Ship ship) {
        river.add(ship);
    }
    public void removeShip (int index) {
        river.remove(index);
    }
    public int getRiverSize () {
        return river.size();
    }
    public void fight (int indexUtocnik, int indexObrance) {
        Ship utocnik = river.get(indexUtocnik);
        Ship obrance = river.get(indexObrance);
        
        if (utocnik instanceof TradeShip  || utocnik instanceof Ship) {
            System.out.println("Útok se nezdařil");
            return;
        }
        if (obrance instanceof Destroyer) {
            int pom = random.nextInt(10) +1;
            if (((Destroyer) obrance).getUhyb()>pom) {
                System.out.println("Útok se nezdařil");
                return;
            }
        }
        if (obrance instanceof BattleShip) {
            int poskozeni = ((WarShip)utocnik).getSilaDel() -((BattleShip)obrance).getPancir();
            obrance.setOdolnost(obrance.getOdolnost()-poskozeni);
            ((Ship)obrance).toString();
            System.out.printf(" poškozena za %d životů\n", poskozeni);
            return;
        }
        obrance.setOdolnost(obrance.getOdolnost()-((WarShip)utocnik).getSilaDel());
        ((Ship)obrance).toString();
        System.out.printf(" poškozena za %d životů\n", ((WarShip)utocnik).getSilaDel());
    }
}
