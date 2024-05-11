import java.util.Scanner;
public class Game {
        private Scanner input = new Scanner(System.in);

        public void start(){
            System.out.println("Welcome to Adventure Game!");
            System.out.print("Please enter a name : ");
            String playerName = input.nextLine();
            Player player = new Player("playerName");
            System.out.println("Dear " + playerName + " welcome to our game !");
            player.selectChar();


            Location location = null;
            while (true){
                System.out.println();
                player.printInfo();
                System.out.println("-----------------------------");
                System.out.println("1 - Safe House >> This location is safety for you. You can refresh your health.");
                System.out.println("2 - Item Store >> You can buy weapon or armor.");
                System.out.println("3 - Cave       >> Awards : Food <<     Can be zombie, be careful");
                System.out.println("4 - Forest     >> Awards : Firewood << Can be vampire, be careful");
                System.out.println("5 - River      >> Awards : Water <<    Can be bear, be careful");
                System.out.print("Please select a location : ");
                int selectLoc = input.nextInt();
                switch (selectLoc){
                    case 1 :
                        location = new SafeHouse(player);
                        break;
                    case 2 :
                        location = new ToolStore(player);
                        break;
                    case 3 :
                        if (player.getInventory().getAsset().contains("food")) {
                            System.out.println("You entered this location before. Please try again.");
                            continue;
                        }
                        location = new Cave(player);
                        break;
                    case 4 :
                        if (player.getInventory().getAsset().contains("firewood")) {
                            System.out.println("You entered this location before. Please try again.");
                            continue;
                        }
                        location = new Forest(player);
                        break;
                    case 5 :
                        if (player.getInventory().getAsset().contains("water")) {
                            System.out.println("You entered this location before. Please try again.");
                            continue;
                        }
                        location = new River(player);
                        break;
                    default:
                        System.out.println("Please enter valid number.");
                        break;
                }
                if (player.getInventory().getAsset().contains("water" + "food" + "firewood")) {
                    System.out.println("Congratulations! You are winner !! ");
                    break;
                }
                if (!location.onLocation()) {
                    System.out.println("GAME OVER !!");
                    break;
                }
            }

        }

}
