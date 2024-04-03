package Estrategia;

import Interfaces.Estrategia;
import Cartas.Cartas;


public class EtgVelocidade implements Estrategia{

    @Override
    public boolean combate(Cartas c1, Cartas c2) {
        return c1.getVelocidade() > c2.getVelocidade();
    }
    
}
