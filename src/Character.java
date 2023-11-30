import java.util.List;
public interface Character {
    String getName();
    int getLevel();
    void updateLevel();
    int getCurrentExp();
    int getMaxExp();
    void setCurrentExp(int exp);
    String getJob();
    void displayStats();

    void updateStatus();

    default void equipWeapon(){

    }

    default void equipAccessory(Accessory accessory){

    }


    default void updateExp(int exp){
        this.setCurrentExp(getCurrentExp()+exp);
        if(this.getCurrentExp() >= this.getMaxExp()){
            setCurrentExp(getCurrentExp()-getMaxExp());
            this.updateLevel();

        }
    }



    List<Accessory> getEquippedAccessories();
}

