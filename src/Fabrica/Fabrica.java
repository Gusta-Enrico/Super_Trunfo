package Fabrica;

import Cartas.Cartas;
import java.util.ArrayList;
import java.util.List;

public class Fabrica {
    public Fabrica() {
    }

    public static Cartas gerarCarta(int op) {

        Cartas c1 = null;

        switch (op) {
            case 1:
                c1 = new Cartas("F22 RAPTOR",650,999,4,4);
            case 2:
                c1 = new Cartas("DASSAUILT RAFALE",710,800,5,5);
            case 3:
                c1 = new Cartas("SU=35",750,900,6,3);
            case 4:
                c1 = new Cartas("M1 ABRAMS",850,500,9,7);
            case 5:
                c1 = new Cartas("LEOPARD 2",790,550,8,6);
            case 6:
                c1 = new Cartas("T-90",800,450,7,6);
            case 7:
                c1 = new Cartas("DESTROYER BURKE",950,450,8,8);
            case 8:
                c1 = new Cartas("FRAGATA FREMM",900,500,7,9);
            case 9:
                c1 = new Cartas("CRUZADOR TREODERGA",970,400,9,8);
            case 10:
                c1 = new Cartas("ASTROS II",700,350,10,6);
            case 11:
                c1 = new Cartas("HIMUSS",650,400,10,5);
            case 12:
                c1 = new Cartas("BM-30",770,450,10,5);

        }

        return c1;
    }
    
    private int quantidade = 12;
    //erro necessario correção
    public static List<Cartas> criarCartas(int quantidade) {
        List<Cartas> cartas = new ArrayList<>();
        for (int i = 0; i < quantidade; i++) {
            cartas.add(gerarCarta());
        }
        return cartas;
    }
}
