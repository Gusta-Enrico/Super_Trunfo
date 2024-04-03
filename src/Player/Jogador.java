/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Player;

import Cartas.Cartas;
import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;

/**
 *
 * @author gusta
 */
public class Jogador {
    private String jogador;
    private List<Cartas> cartas;

    public Jogador(String jogador, List<Cartas> cartas) {
        this.jogador = jogador;
        this.cartas = new ArrayList<>();
    }
    

    public String getJogador() {
        return jogador;
    }

    public void setJogador(String jogador) {
        this.jogador = jogador;
    }

    public List<Cartas> getCartas() {
        return cartas;
    }

    public void setCartas(List<Cartas> cartas) {
        this.cartas = cartas;
    }

    @Override
    public String toString() {
        return "Jogador{" + "jogador=" + jogador + ", cartas=" + cartas + '}';
    }
    
    
    public void adicionarCarta(Cartas carta) {
        this.cartas.add(carta);
    }
    
    public boolean temCartas() {
        return !this.cartas.isEmpty();
    }
        
    public Cartas getProximaCarta() {
        if (!cartas.isEmpty()) {
        Cartas primeiraCarta = cartas.get(0);
        cartas.remove(0);
        return primeiraCarta;
    }
    return null; 
    }   
    
}
