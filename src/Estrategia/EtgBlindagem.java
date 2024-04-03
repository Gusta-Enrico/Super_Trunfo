
package Estrategia;

import Interfaces.Estrategia;
import Cartas.Cartas;


public class EtgBlindagem implements Estrategia{

    @Override
    public boolean combate(Cartas c1, Cartas c2) {
        return c1.getBlindagem() > c2.getBlindagem();
    }
    
}
