import java.util.Random;

public abstract class BattleLoc extends Location{
    private Monster monster;
    private String award;
    private int maxMonster;
    public BattleLoc(Player player, String name, Monster monster, String award, int maxMonster) {
        super(player, name);
        this.monster = monster;
        this.award = award;
        this.maxMonster = maxMonster;
    }
    public int randomMonsterNumber(){
        Random r = new Random();
        return r.nextInt(this.getMaxMonster()) + 1;
    }
    public boolean combat(int obsNumber){           //War starts.
        for (int i = 1 ; i <= obsNumber; i++){
            this.getMonster().setHealth(this.getMonster().getOrjHealth());
            playerStats();
            monsterStats(i);
            while (this.getPlayer().getHealth() > 0 && this.getMonster().getHealth() > 0){
                System.out.print("<S>hoot or <E>scape : ");
                String selectCombat = input.nextLine().toUpperCase();
                if (selectCombat.equals("S")){
                    System.out.println("You shot it.");
                    this.getMonster().setHealth(this.getMonster().getHealth() - this.getPlayer().getDamage());
                    afterHit();
                    if (this.getMonster().getHealth() > 0){
                        System.out.println(this.getMonster().getName() + " shot to you.");
                        int monsterDamage = this.getMonster().getDamage() - this.getPlayer().getInventory().getArmor().getBlock();
                        if (monsterDamage < 0 ){
                            monsterDamage = 0;
                        }
                        this.getPlayer().setHealth(this.getPlayer().getHealth() - monsterDamage);
                        afterHit();
                    }
                }
                else {
                    return false;
                }
            }
            if (this.getMonster().getHealth() < this.getPlayer().getHealth()){
                System.out.println("You defeated the " + this.getMonster().getName());
                System.out.println("You earn the " + this.getMonster().getAward() + " money.");
                this.getPlayer().setMoney(this.getPlayer().getMoney() + this.getMonster().getAward());
                System.out.println("Updated money : " + this.getPlayer().getMoney());
            }
            else{
                return false;
            }
        }
        return true;
    }
    @Override
    public boolean onLocation() {
        int obsNumber = randomMonsterNumber();

        System.out.println("You are in " + this.getName());
        System.out.println("Be careful! " + obsNumber + " " + this.getMonster().getName() + " lives in here!");
        System.out.println("<F>ight or <E>scape ");
        String selectCase = input.nextLine();
        selectCase = selectCase.toUpperCase();

        if (selectCase.equals("F") && combat(obsNumber)){
            System.out.println(this.getName() + " have defeated all the " + this.getMonster().getName());
            this.getPlayer().getInventory().addAsset(this.getAward());
            System.out.println("You earned the " + this.getAward());
        }
        if (this.getPlayer().getHealth() <= 0){
            System.out.println("You died :(");
            return false;
        }
        else if (selectCase.equals("E")) {
            System.out.println("Espaceeee");
        }
        return true;
    }
    public void afterHit(){                 //After hit, show the player and monster health information.
        System.out.println("Your health : " + this.getPlayer().getHealth());
        System.out.println(this.getMonster().getName() + " health : " + this.getMonster().getHealth());
        System.out.println();
    }
    public void playerStats(){               //The player information is shown.
        System.out.println("Player Information");
        System.out.println("------------------------");
        System.out.println("Health : " + this.getPlayer().getHealth());
        System.out.println("Weapon : " + this.getPlayer().getInventory().getWeapon().getName());
        System.out.println("Armor  : " + this.getPlayer().getInventory().getArmor().getName());
        System.out.println("Block  : " + this.getPlayer().getInventory().getArmor().getBlock());
        System.out.println("Damage : " + this.getPlayer().getTotalDamage());
        System.out.println("Money  : " + this.getPlayer().getMoney());
    }
    public void monsterStats(int i){             //The monster information is shown.
        System.out.println(i + ". " + this.getMonster().getName() + " Information");
        System.out.println("------------------------");
        System.out.println("Health : " + this.getMonster().getHealth());
        System.out.println("Damage : " + this.getMonster().getDamage());
        System.out.println("Award  : " + this.getMonster().getAward());

    }
    public Monster getMonster() {
        return monster;
    }

    public void setMonster(Monster monster) {
        this.monster = monster;
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }
    public int getMaxMonster(){
        return maxMonster;
    }
    public void setMaxMonster(int maxMonster){
        this.maxMonster = maxMonster;
    }
}
