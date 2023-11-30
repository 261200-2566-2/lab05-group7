public class Main {
    public static void main(String[] args) {
        Character c = new Swordman("cat");

        c.displayStats();
        c.updateExp(16);
        c.displayStats();
        c.updateExp(200);
        c.displayStats();
    }
}