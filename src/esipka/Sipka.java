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
public class Sipka implements ISipka {

private ISipka sipka;

public Sipka() {
    this.sipka = new ESipka();
}

@Override
public void vpred() {
    sipka.vpred();
}

@Override
public ISipka vlavoBok() {
    sipka = sipka.vlavoBok();
    return null;
}

//* Vnorené triedy
    private class ESipka implements ISipka, IModular {

    private final Multishape multishape;
    private final Mover mover = new Mover(8);
    private final int STEP = CM.getStep();

    private ESipka() {

        this(0, 0);
    }

    private ESipka(int x, int y) {

        Triangle body1 = new Triangle(x, y, STEP, STEP, NamedColor.RED, Direction8.EAST);

        multishape = new Multishape(body1);
        CM.add(this);
    }
    @Override
    public void vpred() {
        mover.moveBy(STEP, 0, this);
    }

    @Override
    public ISipka vlavoBok() {
        int x = multishape.getX();
        int y = multishape.getY();

        NSipka sip = new NSipka(x,y);
        CM.add(sip);
        CM.remove(this);

        return sip;
    }

    @Override
    public int getModule() {
        //TODO
        throw new UnsupportedOperationException("Not supported yet.");
         //Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void setModule(int module) {
        //TODO
        throw new UnsupportedOperationException("Not supported yet.");
         //Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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

    //********************
    private class NSipka implements ISipka, IModular {

private final Multishape multishape;
private final Mover mover = new Mover(5);
private final int STEP = CM.getStep();

public NSipka(int x, int y) {

    Triangle body1 = new Triangle(x, y, STEP, STEP, NamedColor.RED, Direction8.NORTH);

    multishape = new Multishape(body1);

}

@Override
public void vpred() {
    mover.moveBy(0, -STEP, this);
}

@Override
public ISipka vlavoBok() {
    int x = multishape.getX();
    int y = multishape.getY();
    
    WSipka sip = new WSipka(x,y);
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

//*********************************************
private class WSipka implements ISipka, IModular {

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
//**************************************
private class SSipka implements ISipka, IModular {

private final Multishape multishape;
private final Mover mover = new Mover(5);
private final int STEP = CM.getStep();

public SSipka(int x, int y) {

    Triangle body1 = new Triangle(x, y, STEP, STEP, NamedColor.RED, Direction8.SOUTH);

    multishape = new Multishape(body1);

}

@Override
public void vpred() {
    mover.moveBy(0, STEP, this);
}

@Override
public ISipka vlavoBok() {
    int x = multishape.getX();
    int y = multishape.getY();
    
    ESipka sip = new ESipka(x,y);
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
}
}
