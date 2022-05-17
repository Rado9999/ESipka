/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package esipka;

import static cz.pecinovsky.canvasmanager.IPaintable.CM;
import cz.pecinovsky.canvasmanager.Multishape;
import cz.pecinovsky.canvasmanager.Triangle;
import cz.pecinovsky.util.Direction8;
import cz.pecinovsky.util.NamedColor;

/**
 *
 * @author RadoK
 */
public class WSipka extends ASipka {


public WSipka(int x, int y) {

    Triangle body1 = new Triangle(x, y, STEP, STEP, NamedColor.RED, Direction8.WEST);

    multishape = new Multishape(body1);
    CM.add(this);

}

@Override
public void vpred() {
    mover.moveBy(-STEP, 0, this);
}

@Override
public ISipka vlavoBok() {
    setCoordinates();
    
    SSipka sip = new SSipka(x,y);
    
    CM.remove(this);
    
    return sip;
}

}
