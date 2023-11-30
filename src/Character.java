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

    default void updateExp(int exp){
        this.setCurrentExp(getCurrentExp()+exp);
        if(this.getCurrentExp() >= this.getMaxExp()){
            setCurrentExp(getCurrentExp()-getMaxExp());
            this.updateLevel();

        }
    }




}

