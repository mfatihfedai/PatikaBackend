import java.util.Random;

public class Snake extends Monster {

    public Snake() {
        super(4, "Snake", generateRandomDamage(), 12, generateAward());
    }
    private static int generateRandomDamage() {
        Random random = new Random();
        return random.nextInt(4) + 3;
    }

    private static int generateAward() {
        Random random = new Random();
        int chance = random.nextInt(100) + 1; // 1-100 arası rastgele sayı

        if (chance <= 15) {
            // Silah kazanma ihtimali %15
            return getRandomWeapon();
        } else if (chance <= 35) {
            // Zırh kazanma ihtimali %20
            return getRandomArmor();
        } else if (chance <= 60) {
            // Para kazanma ihtimali %25
            return getRandomMoney();
        } else {
            // Hiçbir şey kazanamama ihtimali %40
            return 0;
        }
    }

    private static int getRandomWeapon() {
        Random random = new Random();
        int weaponChance = random.nextInt(100) + 1;

        if (weaponChance <= 15) {
            // Tüfek kazanma ihtimali %20
            return 2;
        } else if (weaponChance <= 35) {
            // Kılıç kazanma ihtimali %30
            return 3;
        } else if (weaponChance <= 65) {
            // Tabanca kazanma ihtimali %50
            return 1;
        } else {
            // Silah kazanma ihtimali olmama %5
            return 0;
        }
    }

    private static int getRandomArmor() {
        Random random = new Random();
        int armorChance = random.nextInt(100) + 1;

        if (armorChance <= 15) {
            // Ağır Zırh kazanma ihtimali %20
            return 5;
        } else if (armorChance <= 35) {
            // Orta Zırh kazanma ihtimali %30
            return 4;
        } else if (armorChance <= 65) {
            // Hafif Zırh kazanma ihtimali %50
            return 3;
        } else {
            // Zırh kazanma ihtimali olmama %5
            return 0;
        }
    }

    private static int getRandomMoney() {
        Random random = new Random();
        int moneyChance = random.nextInt(100) + 1;

        if (moneyChance <= 20) {
            // 10 Para kazanma ihtimali %20
            return 10;
        } else if (moneyChance <= 50) {
            // 5 Para kazanma ihtimali %30
            return 5;
        } else {
            // 1 Para kazanma ihtimali %50
            return 1;
        }
    }
}
