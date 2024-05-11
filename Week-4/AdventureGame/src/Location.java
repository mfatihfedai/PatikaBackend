import java.util.Scanner;
public abstract class Location {
    Scanner input = new Scanner(System.in);
    private Player player;
    private String name;
    public abstract boolean onLocation();

    public Location(Player player, String name){
        this.player = player;
        this.name = name;
    }
    public Player getPlayer(){
        return this.player;
    }
    public void setPlayer(Player player){
        this.player = player;
    }
    public String getName(){
        return name;
    }
    public void setName(String newName){
        this.name = newName;
    }


}
