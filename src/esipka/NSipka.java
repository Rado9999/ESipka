/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package esipka;

import cz.pecinovsky.canvasmanager.IModular;
import static cz.pecinovsky.canvasmanager.IPaintable.CM;
import cz.pecinovsky.canvasmanager.Mover;
import cz.pecinovsky.canvasmanager.Multishape;
import cz.pecinovsky.canvasmanager.Painter;
import cz.pecinovsky.canvasmanager.Triangle;
import cz.pecinovsky.util.Direction8;
import cz.pecinovsky.util.NamedColor;
import cz.pecinovsky.util.Position;

/**
 *
 * @author RadoK
 */
public class NSipka extends ASipka {


public NSipka(int x, int y) {

    Triangle body1 = new Triangle(x, y, STEP, STEP, NamedColor.RED, Direction8.NORTH);

    multishape = new Multishape(body1);
    CM.add(this);

}

@Override
public void vpred() {
    mover.moveBy(0, -STEP, this);
}

@Override
public ISipka vlavoBok() {
    setCoordinates();
    WSipka sip = new WSipka(x,y);
    
    CM.remove(this);
    
    return sip;
}
}