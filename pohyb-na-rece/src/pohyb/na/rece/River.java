/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pohyb.na.rece;

import java.util.ArrayList;

/**
 * Třída simuluje prostředí řeky s objekty lodě i jejich potomky objekty bitevky
   a obchodnílodě
 * @author DHA
 */
public class River {
    /* prom. seznamReka je hlavní seznam všech lodí na řece; dále tento objekt
    bude pracovat s objekty typu Ship */
    protected ArrayList<Ship> seznamReka;
    protected Ship ship;
    
    public River () {
        ArrayList<Ship> seznamReka = new ArrayList<Ship>(); //vyvolá se hl. seznam
    }
}
