/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package esipka;

/**
 *
 * @author RadoK
 */
public class Sipka {

private ISipka sipka;

public Sipka() {
    this.sipka = new ESipka();
}


public void vpred() {
    sipka.vpred();
}


public ISipka vlavoBok() {
    sipka = sipka.vlavoBok();
    return null;
}

}
