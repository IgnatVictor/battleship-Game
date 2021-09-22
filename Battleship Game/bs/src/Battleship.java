
public class Battleship {
    private Display display;
    private Game game = new Game();
    private Input input;


    public Battleship() {
        display = new Display();
    }

    public void Start() {
        display.printMenu();
        mainMenu();
    }

    public void mainMenu() {
        int choice;
        boolean exit = false;
        input = new Input();

        while (!exit) {

            display.printMainMenuOptions();
            System.out.println("Enter your choice: ");
            System.out.println();
            choice = input.getIntegerMenuOption();
            switch (choice) {
                case 0:
                    display.printMessages("You chose to play game ");
                    game.addShipsToEmptyBoard();

                    break;
                case 1:
                    display.printMessages("\033[H\033[2J");
                    System.out.flush();
                    display.gameRules();
                    break;
                case 2:
                    display.printMessages("You chose to exit");
                    exitGame();
                    break;
            }
        }

    }

    public void exitGame() {
        display.printExitMessage();
        System.exit(0);
    }


}
