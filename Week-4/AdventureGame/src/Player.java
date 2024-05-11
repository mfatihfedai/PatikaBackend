import java.util.Scanner;
public class Player {
    Scanner input = new Scanner(System.in);
    private String playerName;
    private int charID;
    private String charName;
    private int damage;
    private int orjHealth;
    private int health;
    private int money;
    private Inventory inventory;

    Player(String playerName) {
        this.playerName = playerName;
        this.inventory = new Inventory();
    }

    public void selectChar(){
        Samurai samurai = new Samurai();
        Knight knight = new Knight();
        Archer archer = new Archer();

        GameChar[] charlist = {new Samurai(), new Knight(), new Archer()};

        System.out.println("-----------------------------");
        for(GameChar gameChar : charlist){
            System.out.println("ID : " + gameChar.getCharID() +
                    "\t\t Character : " + gameChar.getName() +
                    "\t\t Damage : " + gameChar.getDamage() +
                    "\t\t Health : " + gameChar.getHealth() +
                    "\t\t Money : " + gameChar.getMoney());
        }
        System.out.print("PLease select a character : ");
        charID = input.nextInt();

        switch (charID){
            case 1:
                System.out.println("You selected Samurai!");
                initPlayer(new Samurai());
                break;
            case 2:
                System.out.println("You selected Knight!");
                initPlayer(new Knight());
                break;
            case 3:
                System.out.println("You selected Archer!");
                initPlayer(new Archer());
                break;
            default:
                System.out.println("You selected Samurai");
                initPlayer(new Samurai());
                break;
        }
        System.out.println("Character : " + getName() +
                "\t\t Damage : " + getDamage() +
                "\t\t Health : " + getHealth() +
                "\t\t Money : " + getMoney());
    }

    private void initPlayer(GameChar gameChar) {
        this.setName(gameChar.getName());
        this.setDamage(gameChar.getDamage());
        this.setOrjHealth(gameChar.getHealth());
        this.setHealth(gameChar.getHealth());
        this.setMoney(gameChar.getMoney());
    }
    public void printInfo(){
        System.out.println("Weapons : " + this.getInventory().getWeapon().getName() +
                "\t\t Armor : " + this.getInventory().getArmor().getName() +
                "\t\t Block : " + this.getInventory().getArmor().getBlock() +
                "\t\t Damage : " + this.getTotalDamage() +
                "\t\t Health : " + this.getHealth() +
                "\t\t Money : " + this.getMoney() +
                "\t\t Assets : " + this.getInventory().getAsset());
    }

    public String getName(){
        return playerName;
    }
    public void setName(String newName){
        this.playerName = newName;
    }

    public int getCharID() {
        return charID;
    }

    public void setCharID(int charID) {
        this.charID = charID;
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

    public int getTotalDamage(){
        return this.getInventory().getWeapon().getDamage();
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public int getOrjHealth() {
        return orjHealth;
    }

    public void setOrjHealth(int orjHealth) {
        this.orjHealth = orjHealth;
    }
}
