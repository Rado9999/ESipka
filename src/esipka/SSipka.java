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
public class SSipka extends ASipka {

public SSipka(int x, int y) {

    Triangle body1 = new Triangle(x, y, STEP, STEP, NamedColor.RED, Direction8.SOUTH);

    multishape = new Multishape(body1);
    CM.add(this);

}

@Override
public void vpred() {
    mover.moveBy(0, STEP, this);
}

@Override
public ISipka vlavoBok() {
    setCoordinates();
    
    ESipka sip = new ESipka(x,y);
    
    CM.remove(this);
    
    return sip;
}

}
