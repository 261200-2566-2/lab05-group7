// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("(new swordman character 'kai' !!!)");
        Swordman kai = new Swordman("kai");
        kai.displayStats();
        kai.updateExp(101);
        kai.displayStats();
        System.out.println("(new boots)");
        boot B = new boot();
        B.showStatus();
        System.out.println("(Kai equip boots)");
        kai.equipBoot(B);
        kai.displayStats();
        kai.updateExp(509);
        kai.unEquipBoot(B);
        System.out.println("(Kai unequip boots)");
        kai.displayStats();
        System.out.println("----------------------------------------------------");
        armor A = new armor();
        System.out.println("(new armor)");
        A.showStatus();
        A.updateExp(40);
        System.out.println("(armor level up)");
        A.showStatus();
        System.out.println("(Kai equip armor)");
        kai.equipArmor(A);
        kai.displayStats();
        kai.equipArmor(A);
        kai.unEquipBoot(B);
        System.out.println("----------------------------------------------------");
        System.out.println("(new mage character 'flash' !!!)");
        Mage flash = new Mage("flash");
        flash.displayStats();
        ring r = new ring();
        System.out.println("(new ring)");
        r.showStatus();
        flash.equipRing(r);
        flash.displayStats();
        System.out.println("----------------------------------------------------");
        System.out.println("(new tank character 'tank' !!!)");
        Tank tank =new Tank("tank");
        tank.displayStats();


    }
}