/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package esipka;

import cz.pecinovsky.canvasmanager.Multishape;
import cz.pecinovsky.canvasmanager.Triangle;
import cz.pecinovsky.util.Direction8;
import cz.pecinovsky.util.NamedColor;

/**
 *
 * @author RadoK
 */
public class ESipka extends ASipka {


public ESipka() {

    this(0, 0);
}

public ESipka(int x, int y) {

    Triangle body1 = new Triangle(x, y, STEP, STEP, NamedColor.RED, Direction8.EAST);

    multishape = new Multishape(body1);
    CM.add(this);
}


@Override
public ISipka vlavoBok() {

    setCoordinates();
    NSipka sip = new NSipka(x,y);
    
    CM.remove(this);
      
    return sip;
}

@Override
public void vpred() {
    mover.moveBy(STEP, 0, this);
}  




}
