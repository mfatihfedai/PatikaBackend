public class ToolStore extends NormalLoc{

    public ToolStore(Player player) {
        super(player,"Tool Store");
    }

    @Override
    public boolean onLocation(){
        boolean showMenu = true;
        while(showMenu){
            System.out.println();
            System.out.println("--------------------------");
            System.out.println("Welcome to Tool Store !");
            System.out.println("1 - Weapon");
            System.out.println("2 - Armors");
            System.out.println("3 - Exit");
            System.out.print("Please a choose one : ");
            int selectCase = input.nextInt();
            while(selectCase < 1 || selectCase > 3){
                System.out.println("Wrong select ! Please try again.");
                selectCase = input.nextInt();
            }
            switch (selectCase){
                case 1:
                    printWeapon();
                    buyWeapon();
                    break;
                case 2:
                    printArmor();
                    buyArmor();
                    break;
                case 3 :
                    System.out.println("See you later !");
                    showMenu = false;
                    break;
            }
        }
        return true;
    }

    public void printWeapon(){
        System.out.println();
        System.out.println("--------- Weapons --------");
        for (Weapon w : Weapon.weapons()){
            System.out.println("ID : " + w.getId() + " - " + w.getName() + "\t << Money : " + w.getPrice() + "  Damage : " + w.getDamage() + " >>");
        }
        System.out.println("0 - Exit ");
    }
    public void buyWeapon(){
        System.out.print("Select a weapon : ");
        int selectWeaponID = input.nextInt();
        while(selectWeaponID < 0 || selectWeaponID > Weapon.weapons().length){
            System.out.println("Wrong select ! Please try again.");
            selectWeaponID = input.nextInt();
        }

        Weapon selectedWeapon = Weapon.getWeaponObjByID(selectWeaponID);
        if (selectWeaponID != 0){
            if (selectedWeapon != null){
                if(selectedWeapon.getPrice() > this.getPlayer().getMoney()){
                    System.out.println("You have not enough money.");
                }
                else {
                    //Player bought a weapon
                    System.out.println( "You bought the " + selectedWeapon.getName());
                    this.getPlayer().setMoney((getPlayer().getMoney() - selectedWeapon.getPrice()));
                    System.out.println("Your money : " + getPlayer().getMoney());
                    System.out.println("Before weapon : " + this.getPlayer().getInventory().getWeapon().getName());
                    this.getPlayer().getInventory().setWeapon(selectedWeapon);
                    System.out.println("New weapon : " + this.getPlayer().getInventory().getWeapon().getName());
                }
            }
        }
    }
    public void printArmor(){
        System.out.println();
        System.out.println("-------Armors-------");
        for(Armor a : Armor.armors()){
            System.out.println(a.getId() + " - " + a.getName() + "\t << Money : " + a.getPrice() + "  Defence : " + a.getBlock() + " >>");
        }
        System.out.println("0 - Exit ");
    }
    public void buyArmor(){
        System.out.print("Select an armor : ");
        int selectArmorID = input.nextInt();
        while(selectArmorID < 0 || selectArmorID > Armor.armors().length){
            System.out.println("Wrong select ! Please try again.");
            selectArmorID = input.nextInt();
        }
        Armor selectedArmor = Armor.getArmorObjByID(selectArmorID);
        if (selectArmorID != 0 ) {
            if (selectedArmor != null) {
                if (selectedArmor.getPrice() > this.getPlayer().getMoney()) {
                    System.out.println("You have not enough money.");
                } else {
                    System.out.println("You bought " + selectedArmor.getName());
                    this.getPlayer().setMoney(this.getPlayer().getMoney() - selectedArmor.getPrice());
                    System.out.println("Remain money : " + getPlayer().getMoney());
                    System.out.println("Before armor : " + this.getPlayer().getInventory().getArmor().getName());
                    this.getPlayer().getInventory().setArmor(selectedArmor);
                    System.out.println("New armor : " + this.getPlayer().getInventory().getArmor().getName());
                }
            }
        }

    }
}
