import java.util.List;

public class Swordman implements Character{
    String name;
    private int level;
    private int maxExp;
    private int currentExp;
    private int maxHp;
    private int currentHp;
    private int maxMana;
    private int currentMana;
    private double SPD;
    private double atk;
    private double def;


    public Swordman(String name){
        this.name = name;
        level = 1;
        updateStatus();
        currentHp = maxHp;
        currentMana = maxMana;
    }

    public void updateStatus(){
        maxHp = 250+(10*level);
        maxMana = 100+(2*level);
        maxExp = 100*level;
        SPD = 20+level;
        atk = 50+(5*level);
        def = 65+(6*level);
    }

//    private void levelAscending(){
//        level++;
//        updateStatus();
//    }

    public void updateLevel(){
        level++;
        updateStatus();
    }

    public String getName(){
        return this.name;
    }

    public int getLevel(){
        return this.level;
    }
    public int getMaxExp(){
        return this.maxExp;
    }
    public int getCurrentExp(){
        return currentExp;
    }
    public void setCurrentExp(int exp){
        this.currentExp = exp;

    }
    public String getJob(){
        return "Swordman";
    }
    public void displayStats() {
        System.out.println("name : " + this.name);
        System.out.println("level " + this.level+ " | exp : " + this.currentExp +"/" + this.maxExp);
        System.out.println("HP : " + this.currentHp +"/" + this.maxHp);
        System.out.println("Mana : " + this.currentMana +"/" + this.maxMana);
        System.out.println("Speed : " + this.SPD);
        System.out.println("Attack : " + this.atk);
        System.out.println("Defense : " + this.def);
    }

}
