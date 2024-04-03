package Jogo;

import Cartas.Cartas;
import Estrategia.EtgAlcance;
import Estrategia.EtgBlindagem;
import Estrategia.EtgDano;
import Estrategia.EtgVelocidade;
import Fabrica.Fabrica;
import Interfaces.Estrategia;
import Player.Jogador;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class Jogo {
    private Jogador jogador1;
    private Jogador jogador2;

    public Jogo(Jogador jogador1, Jogador jogador2) {
        this.jogador1 = jogador1;
        this.jogador2 = jogador2;
    }
    
    private void distribuirCartas(List<Cartas> baralho) {
        for(int i = 0; i < 12; i++) {
            if (i % 2 == 0) {
                jogador1.adicionarCarta(baralho.get(i));
            } else {
                jogador2.adicionarCarta(baralho.get(1));
            }
        }
    }
    
    private Estrategia escolherEstrategia (int escolha) {
               
        switch (escolha) {
            case 1:
                return new EtgAlcance();
            case 2:
                return new EtgBlindagem();
            case 3:
                return new EtgDano();
            default:
                return new EtgVelocidade();                                                    
        }
    }
    
    public void iniciar() {
        List<Cartas> baralho = Fabrica.criarCartas();//erro necessario correção
        Collections.shuffle(baralho);

        
        distribuirCartas(baralho);

        Scanner scanner = new Scanner(System.in);
        while (jogador1.temCartas() && jogador2.temCartas()) {
            System.out.println("Jogador 1, escolha o atributo: 1-Alcance, 2-Blindagem, 3-Dano, 4= Velocidade");
            int escolha = scanner.nextInt();
            Estrategia estrategia = escolherEstrategia(escolha);

            Cartas carta1 = jogador1.getProximaCarta();
            Cartas carta2 = jogador2.getProximaCarta();
            boolean resultado = estrategia.combate(carta1, carta2);

            if (resultado) {
                jogador1.adicionarCarta(carta1);
                jogador1.adicionarCarta(carta2);
            } else {
                jogador2.adicionarCarta(carta1);
                jogador2.adicionarCarta(carta2);
            }
        }

        if (jogador1.temCartas()) {
            System.out.println("Jogador 1 venceu!");
        } else {
            System.out.println("Jogador 2 venceu!");
        }
    }
    

}
