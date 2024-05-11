import java.util.ArrayList;
public class Inventory {
    private Weapon weapon;
    private Armor armor;
    private ArrayList<String> asset;
    public Inventory(){
        this.weapon = new Weapon(-1,"Punch", 0,0);
        this.armor = new Armor(-1, "None", 0,0);
        this.asset = new ArrayList<>();
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Armor getArmor() {
        return armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }
    public ArrayList<String> getAsset() {
        return asset;
    }
    public void addAsset(String newAsset) {
        this.asset.add(newAsset);
    }
}
