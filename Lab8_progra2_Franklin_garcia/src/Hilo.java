
import javax.swing.JProgressBar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Franklin Garcia
 */
public class Hilo extends Thread {

     JProgressBar barra1;
    JProgressBar barra2;
    Hadas jugador1;
    Hadas jugador2;

    public Hilo() {
        super();
    }

    public Hilo(JProgressBar barra1, JProgressBar barra2, Hadas jugador1, Hadas jugador2) {
        this.barra1 = barra1;
        this.barra2 = barra2;
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
    }



    public Hadas getJugador1() {
        return jugador1;
    }

    public void setJugador1(Hadas jugador1) {
        this.jugador1 = jugador1;
    }

    public Hadas getJugador2() {
        return jugador2;
    }

    public void setJugador2(Hadas jugador2) {
        this.jugador2 = jugador2;
    }
        @Override
    public String toString() {
        return "ThreadBatallas{" + "player1=" + jugador1 + ", player2=" + jugador2 + '}';
    }
    

    public boolean vive1 = true;
    public boolean vive2 = true;

    public boolean isVive1() {
        return vive1;
    }

    public void setVive1(boolean vive1) {
        this.vive1 = vive1;
    }

    public boolean isVive2() {
        return vive2;
    }

    public void setVive2(boolean vive2) {
        this.vive2 = vive2;
    }

    @Override
    public void run() {
        try {
            while (vive1) {
                if (vive1) {
                    if (jugador1 instanceof Salamandras && ((jugador2 instanceof Hamadries))) {
                        jugador2.setSalud((int) (jugador2.getSalud() - (jugador1.getPoder() + (jugador1.getPoder() * 0.37))));
                    } else if (((jugador1 instanceof Lamias) || (jugador1 instanceof Silfides)) && (jugador2 instanceof Hamadries)) {
                        if (jugador1 instanceof Lamias) {
                            jugador2.setSalud((int) (jugador2.getSalud() - (jugador1.getPoder() + (jugador1.getPoder() * 0.42))));
                        }
                        if (jugador1 instanceof Silfides) {
                            jugador2.setSalud((int) (jugador2.getSalud() - (jugador1.getPoder() + (jugador1.getPoder() * 0.37))));
                        }
                    } else {
                        jugador2.setSalud(jugador2.getSalud() - (jugador1.getPoder()));
                    }
                    if (jugador2 instanceof Salamandras && ((jugador1 instanceof Hamadries))) {
                        jugador1.setSalud((int) (jugador1.getSalud() - (jugador1.getPoder() + (jugador2.getPoder() * 0.37))));
                    } else if (((jugador2 instanceof Lamias) || (jugador2 instanceof Silfides)) && (jugador1 instanceof Hamadries)) {
                        if (jugador2 instanceof Lamias) {
                            jugador1.setSalud((int) (jugador1.getSalud() - (jugador2.getPoder() + (jugador2.getPoder() * 0.42))));
                        }
                        if (jugador2 instanceof Silfides) {
                            jugador1.setSalud((int) (jugador1.getSalud() - (jugador2.getPoder() + (jugador2.getPoder() * 0.37))));
                        }
                    } else {
                        jugador1.setSalud(jugador1.getSalud() - (jugador2.getPoder()));
                    }
                }
            }
        } catch (Exception e) {
        }

    }

}
