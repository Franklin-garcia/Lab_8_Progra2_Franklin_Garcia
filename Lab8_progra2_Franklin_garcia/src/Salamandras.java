/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Franklin Garcia
 */
public class Salamandras extends Hadas{
    private int alas;

    public Salamandras() {
        super();
    }

    public Salamandras(int alas, String Nombre, double altura, String edad, double salud, double poder) {
        super(Nombre, altura, edad, salud, poder);
        this.alas = alas;
    }
    

    public int getAlas() {
        return alas;
    }

    public void setAlas(int alas) {
        this.alas = alas;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
