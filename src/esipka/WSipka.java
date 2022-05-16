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
public class WSipka implements ISipka, IModular {

private final Multishape multishape;
private final Mover mover = new Mover(5);
private final int STEP = CM.getStep();

public WSipka(int x, int y) {

    Triangle body1 = new Triangle(x, y, STEP, STEP, NamedColor.RED, Direction8.WEST);

    multishape = new Multishape(body1);

}

@Override
public void vpred() {
    mover.moveBy(-STEP, 0, this);
}

@Override
public ISipka vlavoBok() {
    int x = multishape.getX();
    int y = multishape.getY();
    
    SSipka sip = new SSipka(x,y);
    CM.add(sip);
    CM.remove(this);
    
    return sip;
}

@Override
public int getModule() {
    //TODO
    throw new UnsupportedOperationException("Not supported yet.");
    // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
}

@Override
public void setModule(int module) {
    //TODO
    throw new UnsupportedOperationException("Not supported yet.");
    // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
}

@Override
public Position getPosition() {

    return multishape.getPosition();
}

@Override
public void setPosition(int x, int y) {
    multishape.setPosition(x, y);
}

@Override
public void paint(Painter painter) {
    multishape.paint(painter);
}
}
