public class armor implements accessories{
    private double atk;
    private double def;
    private double mana;
    private double spd;
    private int currentExp;
    private int maxExp;
    private int level;
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
        atk = 5 * level;
        def = 15 * level;
        mana = level;
        spd = -5*level;
        maxExp = 10*level;
    }
}