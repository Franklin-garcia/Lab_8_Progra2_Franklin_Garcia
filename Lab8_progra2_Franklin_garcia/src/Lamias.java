/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Franklin Garcia
 */
public class Lamias extends Hadas{
  private  int aleta;
  private  int branquias;

    public Lamias() {
    super();
    }

    public Lamias(int aleta, int branquias, String Nombre, double altura, String edad, double salud, double poder) {
        super(Nombre, altura, edad, salud, poder);
        this.aleta = aleta;
        this.branquias = branquias;
    }

    public int getAleta() {
        return aleta;
    }

    public void setAleta(int aleta) {
        this.aleta = aleta;
    }

    public int getBranquias() {
        return branquias;
    }

    public void setBranquias(int branquias) {
        this.branquias = branquias;
    }



  
}
