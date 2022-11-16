public class Monster {
    private String nome;
    private int puntiFerita;
    private int danno;

    void Monster(String nome, int puntiFerita, int danno){
        this.nome = nome;
        this.puntiFerita = puntiFerita;
        this.danno = danno;
    }

    public int attacca(){
        return danno;
    }

    public void subisci(int dannoAvversario){
        puntiFerita-= dannoAvversario;
    }

    public String toString(){
        return ("Il mostro " + nome + " che fa " + danno + " punti vita di danno ha ancora " + " di vita");
    }
}