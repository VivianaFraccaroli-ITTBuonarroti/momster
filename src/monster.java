public class Monster {
    private String nome;
    private int puntiFerita;

    private Weapon arma;
    private int danno;

    Monster(String nome, int puntiFerita, int danno, int dannoArma){
        this.nome = nome;
        this.puntiFerita = puntiFerita;
        this.danno = danno;
        arma = new Weapon(dannoArma);
    }

    public int attacca(){
        return danno + arma.getDannoArma();
    }

    public void subisci(int dannoAvversario){
        puntiFerita-= dannoAvversario;
    }

    public String toString(){
        return ("Il mostro " + nome + " che fa " + danno + " punti vita di danno ha ancora " + puntiFerita + " di vita");
    }
}