import java.util.Random;

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


        public int setManaMaxima(){
            Random random = new Random();
            manaMaxima = random.nextInt(11) + nivel*10; 
            manaAtual = manaMaxima; 
            return manaMaxima;
        }
       
    
    
    public int setVidaMaxima(){
        Random random = new Random();
        vidaMaxima = random.nextInt(11) + nivel*10; 
        vidaAtual = vidaMaxima; 
        return vidaMaxima;
    }

    public void usarHabilidade(){
        
    }

   

    @Override
    public String toString() {
        return "Personagem{" +
                "id=" + idPersonagem +
                ", nome='" + nome + '\'' +
                ", nivel=" + nivel +
                ", vida=" + vidaAtual + "/" + vidaMaxima +
                ", mana=" + manaAtual + "/" + manaMaxima +
                '}';
    }
}
