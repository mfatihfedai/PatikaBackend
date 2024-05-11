
public class SafeHouse extends NormalLoc{

    public SafeHouse(Player player) {
        super(player, "Safe House");
    }
    public boolean onLocation(){
        System.out.println("You are in Safe House !");
        System.out.println("Refresh your health :)");
        this.getPlayer().setHealth(this.getPlayer().getOrjHealth());
        return true;
    }
}
