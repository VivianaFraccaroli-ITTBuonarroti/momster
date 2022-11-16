public class Main {
    public static void main(String[] args) {
        Monster monster1 = new Monster("gianno", 30, 1, 1);
        Monster monster2 = new Monster("maria esposita", 3, 25, 90);

        monster2.subisci(monster1.attacca());
        System.out.println(monster1.toString());
        System.out.println(monster2.toString());

        monster1.subisci(monster2.attacca());
        System.out.println(monster1.toString());
        System.out.println(monster2.toString());       /////////
    }
}