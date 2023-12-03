// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Swordman kai = new Swordman("kai");
        kai.updateExp(101);
        kai.displayStats();
        boot B = new boot();
        kai.equipBoot(B);
        kai.displayStats();
        kai.updateExp(509);
        kai.unEquipBoot(B);
        kai.displayStats();
    }
}