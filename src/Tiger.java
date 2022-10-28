import java.awt.*;
import java.util.Random;

public class Tiger extends Critter {
    Color f;
    int i = 0;
    public Tiger() {
        f = null;
    }
    public Color getColor() {
        Random rand = new Random();
        if (i%3==0) {
            int j = rand.nextInt(3);
            if (j==0) {
                f = Color.RED;
                return f;
            } else if (j==1) {
                f =Color.GREEN;
                return f;
            } else {
                f = Color.BLUE;
                return f;
            }
        } else {
            return f;
        }
    }
    public String toString() {
        return "TGR";
    }
    public Action getMove(CritterInfo info) {
        i++;
        if (info.frontThreat()) {
            return Action.INFECT;
        } else if ((info.getFront()==Neighbor.WALL)||(info.getRight()==Neighbor.WALL)) {
            return Action.LEFT;
        } else if (info.getFront()==Neighbor.SAME) {
            return Action.RIGHT;
        } else {
            return Action.HOP;
        }
    }
}
