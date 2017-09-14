/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Franklin Garcia
 */
public class Hamadries extends Hadas{
    private double arbol;

    public Hamadries() {
    super();
    }

    public Hamadries(double arbol, String Nombre, double altura, String edad, double salud, double poder) {
        super(Nombre, altura, edad, salud, poder);
        this.arbol = arbol;
    }

    public double getArbol() {
        return arbol;
    }

    public void setArbol(double arbol) {
        this.arbol = arbol;
    }
    
    
}
