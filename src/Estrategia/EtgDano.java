
package Estrategia;

import Interfaces.Estrategia;
import Cartas.Cartas;


public class EtgDano implements Estrategia{

    @Override
    public boolean combate(Cartas c1, Cartas c2) {
        return c1.getDano()> c2.getDano();
    }
}
