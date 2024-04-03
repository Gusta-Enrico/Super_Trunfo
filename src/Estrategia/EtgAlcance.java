/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estrategia;

import Interfaces.Estrategia;
import Cartas.Cartas;

/**
 *
 * @author gusta
 */
public class EtgAlcance implements Estrategia{

    @Override
    public boolean combate(Cartas c1, Cartas c2) {
        return c1.getAlcance() > c2.getAlcance();
    }
    
}
