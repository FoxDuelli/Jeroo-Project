import java.util.Random;
/**
 *  See Readme.md for instructions.
 *  Use left and right arrow keys to see it when running main()
 */
public class Main implements Directions {

    /**
     * Do NOT edit this.  Put your code inside the runJerooCode method below.
     */
    public static void main(String[] args) {
        Map.getInstance().changeSize(6, 6);
        new JerooGUI();
        Main m = new Main();
        m.runJerooCode();

    }

    /**
     * Main program where hunters and prey take turns.
     */
    public void runJerooCode() {
        Jeroo hunter = new Jeroo(0, 0, EAST, 3);
        hunter.setImage("kareln.gif", "karele.gif", "karels.gif", "karelw.gif");
        Jeroo prey1 = new Jeroo(3, 3, NORTH, 0);
        Jeroo prey2 = new Jeroo(4, 5, NORTH, 0);
        Jeroo prey3 = new Jeroo(2, 2, NORTH, 0);

        while (hunter.hasFlower()) {
            hunter.takeHunterTurn();
            prey1.takePreyTurn();
            prey2.takePreyTurn();
            prey3.takePreyTurn();
        }

        // victory dance
        hunter.turn(LEFT);
        hunter.turn(LEFT);
        hunter.turn(LEFT);
    }
}
