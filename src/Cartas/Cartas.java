
package Cartas;


public class Cartas {
    private String nome;
    private int dano;
    private int blindagem;
    private int alcance;
    private int velocidade;

    public Cartas(String nome, int dano, int blindagem, int alcance, int velocidade) {
        this.nome = nome;
        this.dano = dano;
        this.blindagem = blindagem;
        this.alcance = alcance;
        this.velocidade = velocidade;
    }

    public String getNome() {
        return nome;
    }

    public int getDano() {
        return dano;
    }

    public int getBlindagem() {
        return blindagem;
    }

    public int getAlcance() {
        return alcance;
    }

    public int getVelocidade() {
        return velocidade;
    }



    @Override
    public String toString() {
        return "CartasJogo{" + "nome=" + nome + ", dano=" + dano + ", blindagem=" + blindagem + ", alcance=" + alcance + ", velocidade=" + velocidade + '}';
    }
    
    
    
}
