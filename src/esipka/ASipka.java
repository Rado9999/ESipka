/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package esipka;

import static cz.pecinovsky.canvasmanager.IPaintable.CM;
import cz.pecinovsky.canvasmanager.Mover;
import cz.pecinovsky.canvasmanager.Multishape;
import cz.pecinovsky.canvasmanager.Painter;
import cz.pecinovsky.util.Position;

/**
 *
 * @author RadoK
 */
public abstract class ASipka implements ISipka {


protected static final Mover mover = new Mover(8);
protected static final int STEP = CM.getStep();

protected Multishape multishape;
protected int x, y;


public void setCoordinates(){
    x = multishape.getX();
    y = multishape.getY();
}

public void changePict(ISipka addObj, ISipka delObj) {
    CM.add(addObj);
    CM.remove(delObj);
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
}
