public class Personagem {
    int idPersonagem=0;
    String nome;
    int nivel=0;
    int vidaMaxima,vidaAtual;
    int manaMaxima,manaAtual;

    public int receberDano(int dano){
        vidaAtual-=dano;

        if(vidaAtual<0){
            vidaAtual=0;
        }
        return vidaAtual;
    }
    
    public int curar(int cura){
        vidaAtual+=cura;

        if(vidaAtual>vidaMaxima){
            vidaAtual=vidaMaxima;
        }
        return vidaAtual;
    }

    public void usarHabilidade(){
        
    }
}
