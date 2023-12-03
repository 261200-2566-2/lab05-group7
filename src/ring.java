public class ring implements accessories{
    private double atk;
    private double def;
    private double mana;
    private double spd;
    private int currentExp;
    private int maxExp;
    private int level;
    public ring(){
        level = 1;
        this.spd = 20;
        this.atk = 10;
        this.def = 5;
        this.mana = 50;
        this.updateStatus();
    }
    @Override
    public double getAtk() {
        return atk;
    }
    @Override
    public double getMana() {
        return mana;
    }
    @Override
    public double getDef() {
        return def;
    }
    @Override
    public double getSpd() {
        return spd;
    }
    @Override
    public int getCurrentExp() {
        return currentExp;
    }
    public int getMaxExp(){
        return maxExp;
    }
    @Override
    public void setCurrentExp(int currentExp) {
        this.currentExp = currentExp;
    }
    @Override
    public void updateLevel() {
        level++;
        updateStatus();
    }
    public void showStatus(){
        System.out.println(atk);
        System.out.println(def);
        System.out.println(mana);
        System.out.println(spd);
    }
    public void updateStatus() {
        atk = 2 * level;
        def = level;
        mana = 15 * level;
        spd = level;
        maxExp = 10*level;
    }
}
