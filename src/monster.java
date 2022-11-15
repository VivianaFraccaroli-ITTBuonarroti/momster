public class Monster {
    private String nome;
    private int puntiFerita;
    private int danno;

    void Monster(String nome, int puntiFerita, int danno){
        this.vita = vita;
    }

    public int attacca(){
        return danno;
    }

    public subisci(int dannoAvversario){
        puntiFerita-= dannoAvversario;
    }

    public String toString(){
        return ("Il mostro " + nome + " che fa " + danno + " punti vita di danno ha ancora " + " di vita")
    }
}