/**
 * Put your Jeroo methods in this class.
 * @author Steve Aronson
 */
public class Jeroo extends JerooBase {

    /**
     * take a turn as prey. 
     */
    public void takePreyTurn() {
        if (hasFlower()) {
            plant();
            remove();
        } else if (isClear(AHEAD))
        {
            hop();
        } else if (getRandom()) {
            if (isClear(AHEAD)) {
                hop();
            }
        } else {
            if (getRandom()) {
                turn(LEFT);
            } else {
                turn(RIGHT);
            }
        }
    }

    /**
     *  take a turn as a hunter
     */
    public void takeHunterTurn() {

        if (isJeroo(AHEAD)) {
            give(AHEAD);
        } else if (getRandom()) {
            hideMovement();
            if (!isWater(AHEAD)) {
                if (!isJeroo(AHEAD))
                    hop();
            }
            showMovement();
            if (isClear(AHEAD)) {
                hop();
            }

        } else {
            if (getRandom()) {
                turn(LEFT);
            } else {
                turn(RIGHT);
            }
        }
    }

    // Do NOT touch the code below here
    public Jeroo() {super();}

    public Jeroo(int flowers) {super(flowers); }

    public Jeroo(int y, int x) { super(y, x); }

    public Jeroo(int y, int x, CompassDirection direction) { super (y, x, direction);}

    public Jeroo(int y, int x, int flowers) { super (y, x, flowers);}

    public Jeroo(int y, int x, CompassDirection direction, int flowers) { super(y, x, direction, flowers);}
}

