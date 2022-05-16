/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package esipka;

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

}
